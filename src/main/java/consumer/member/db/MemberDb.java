package consumer.member.db;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.UpdateOptions;
import consumer.member.model.Coverage;
import consumer.member.model.Dependant;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.conversions.Bson;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.Properties;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.*;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class MemberDb {
    String uri;
    MongoClient mongoClient;
    MongoDatabase database;
    CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
            fromProviders(PojoCodecProvider.builder().automatic(true).build()));
    public MemberDb() {
        try (InputStream input = MemberDb.class.getClassLoader().getResourceAsStream("app.properties")) {

            Properties prop = new Properties();

            if (input == null) {
                System.out.println("Sorry, unable to find app.properties");
                return;
            }
            prop.load(input);
            this.uri = prop.getProperty("mongoURI");
            MongoClientSettings settings = MongoClientSettings.builder()
                    .applyConnectionString(new com.mongodb.ConnectionString(uri))
                    //use getters and setters to assign values to documents
                    .codecRegistry(pojoCodecRegistry)
                    .build();
            this.mongoClient = MongoClients.create(settings);
            this.database = mongoClient.getDatabase("test");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void updateDependant(Dependant dependant, String source){
        Bson query = and(
                eq("cumbId", dependant.getCumbIdNo())
        );

        Bson update = combine(
                set("cumbId", dependant.getCumbIdNo()),
                set("dependant", dependant),
                set("meta.source", source),
                setOnInsert("meta.createDate", LocalDateTime.now()),
                currentTimestamp("meta.lastUpdateDate")

        );

        UpdateOptions updateOptions = new UpdateOptions().upsert(true);

        database.getCollection("member").updateOne(query, update, updateOptions);
    }

    public void pushCoverage(Coverage coverage){
        Bson query = eq("cumbId", coverage.getCumbIdNo());
        Bson update = push("coverageArray", coverage);

        UpdateOptions updateOptions = new UpdateOptions().upsert(true);
        database.getCollection("member").updateOne(query, update, updateOptions);
    }
}
