package consumer.member;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import consumer.member.Deserializers.LocalDateDeserializer;
import consumer.member.db.MemberDb;
import consumer.member.model.Coverage;
import consumer.member.model.Dependant;
import consumer.member.model.Subscriber;

import java.time.LocalDate;

public class MemberProcessor {
    MemberDb memberDb = new MemberDb();

    MemberProcessor(){}

    //parse message and determine what source it came from
    public void processMemberMessage(String message){
        try {
            JsonObject rootObject = JsonParser.parseString(message).getAsJsonObject();
            String source = rootObject.get("alias").getAsString();
            JsonObject afterImageObject = rootObject.get("after_image").getAsJsonObject();
            parseAfterImage(source, afterImageObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //based on the source, parse the object in the right class
    private void parseAfterImage(String source, JsonObject afterImageObject) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(LocalDate.class, new LocalDateDeserializer());
        Gson gson = gsonBuilder.create();
        switch (source) {
            case "subscriber":
                gson.fromJson(afterImageObject, Subscriber.class);
                break;
            case "TM1H000":
                Dependant dependant = gson.fromJson(afterImageObject, Dependant.class);
                memberDb.updateDependant(dependant, source);
                break;

            case "COVERAGE":
                Coverage coverage = gson.fromJson(afterImageObject, Coverage.class);
                memberDb.pushCoverage(coverage);
                break;
            // Add more cases as needed
            default:
                throw new IllegalArgumentException("Unknown source: " + source);
        }
    }
}
