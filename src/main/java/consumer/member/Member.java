package consumer.member;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import consumer.member.Deserializers.LocalDateDeserializer;
import consumer.member.db.MemberDb;
import consumer.member.model.Dependant;
import consumer.member.model.Subscriber;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Produced;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Properties;

public class Member {
    public Member() {}

    public static void main(String[] args) throws IOException {
        // Set up Kafka Streams configuration
        final Properties config = readConfig("<<path-to-prop file>>kafka.properties");
        MemberProcessor memberProcessor = new MemberProcessor();
        config.put(StreamsConfig.APPLICATION_ID_CONFIG, "json-processing-app10");
        config.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        config.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        config.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());

        // Build the topology
        StreamsBuilder builder = new StreamsBuilder();
        KStream<String, String> sourceStream = builder.stream("memberData");

        sourceStream.peek((k,v) -> System.out.println(v));
        sourceStream.foreach((k,v) -> memberProcessor.processMemberMessage(v));

        // Start the streams application
        KafkaStreams streams = new KafkaStreams(builder.build(), config);
        streams.start();

        // Add shutdown hook to stop the application gracefully
        Runtime.getRuntime().addShutdownHook(new Thread(streams::close));
    }

    public static Properties readConfig(final String configFile) throws IOException {
        // reads the client configuration from client.properties
        // and returns it as a Properties object
        if (!Files.exists(Paths.get(configFile))) {
            throw new IOException(configFile + " not found.");
        }

        final Properties config = new Properties();
        try (InputStream inputStream = new FileInputStream(configFile)) {
            config.load(inputStream);
        }

        return config;
    }
}
