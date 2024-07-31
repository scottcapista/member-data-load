package consumer.member;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import consumer.member.Deserializers.LocalDateDeserializer;
import consumer.member.db.MemberDb;
import consumer.member.model.Dependant;
import consumer.member.model.Subscriber;

import java.time.LocalDate;

public class Member {
    public Member() {}

    public void streamLoop(){
        //loop through individual records and pass them off to processMemberMessage and MemberDb class
        //this method can be implimented once we have Kafka Connection Details
    }

    //parse message and determine what source it came from
    public Object processMemberMessage(String message){
        JsonObject rootObject = JsonParser.parseString(message).getAsJsonObject();
        String source = rootObject.get("source").getAsString();
        JsonObject afterImageObject = rootObject.get("afterImage").getAsJsonObject();
        return parseAfterImage(source, afterImageObject);
    }

    //based on the source, parse the object in the right class
    private Object parseAfterImage(String source, JsonObject afterImageObject) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(LocalDate.class, new LocalDateDeserializer());
        Gson gson = gsonBuilder.create();
        return switch (source) {
            case "subscriber" -> gson.fromJson(afterImageObject, Subscriber.class);
            case "dependant" -> gson.fromJson(afterImageObject, Dependant.class);
            // Add more cases as needed
            default -> throw new IllegalArgumentException("Unknown source: " + source);
        };
    }
}
