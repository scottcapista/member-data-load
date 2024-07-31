package consumer.member.db;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.UpdateOptions;
import consumer.member.model.Dependant;
import org.bson.conversions.Bson;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.Properties;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;

public class MemberDb {
    String uri;
    MongoClient mongoClient;
    MongoDatabase database;
    public MemberDb() {
        try (InputStream input = MemberDb.class.getClassLoader().getResourceAsStream("app.properties")) {

            Properties prop = new Properties();

            if (input == null) {
                System.out.println("Sorry, unable to find app.properties");
                return;
            }
            prop.load(input);
            this.uri = prop.getProperty("mongoURI");
            this.mongoClient = MongoClients.create(uri);
            this.database = mongoClient.getDatabase("test");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void updateDependant(Dependant dependant){
        Bson query = and(
                eq("CUMB_ID_NO", dependant.getCUMB_ID_NO()),
                gte("CUMBH_EFF_DT", dependant.getCUMBH_EFF_DT()),
                eq("CUMB_EXPRTN_DT", dependant.getCUMBH_EXPRTN_DT())
        );

        Bson update = combine(
                set("CUMBH_EFF_DT", dependant.getCUMBH_EFF_DT()),
                set("CUMBH_FST_NM", dependant.getCUMBH_FST_NM()),
                set("CUMBH_LAST_NM", dependant.getCUMBH_LAST_NM()),
                set("lastUpdatedDate", LocalDateTime.now())
        );

        UpdateOptions updateOptions = new UpdateOptions().upsert(true);

        database.getCollection("member").updateOne(query, update, updateOptions);
    }


}
