package consumer.member;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import consumer.member.db.MemberDb;
import consumer.member.model.Dependant;
import consumer.member.model.Subscriber;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.Month;
import java.util.Properties;

import static com.mongodb.client.model.Filters.eq;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MemberTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MemberTest.class);
    String uri;
    MongoClient mongoClient;
    MongoDatabase database;
    @Before
    public void init() {
        try (InputStream input = MemberDb.class.getClassLoader().getResourceAsStream("app.properties")) {

            Properties prop = new Properties();

            if (input == null) {
                System.out.println("Sorry, unable to find app.properties");
                return;
            }
            prop.load(input);
            this.uri = prop.getProperty("mongoURI");
            LOGGER.info("MongoConnectionString: {}", uri);
            this.mongoClient = MongoClients.create(uri);
            this.database = mongoClient.getDatabase("test");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    private static String firstSubscriber = """
            {
                "source":"subscriber",
                "afterImage":{
                    "CUMB_ID_NO":12345,
                    "CUMBH_EFF_DT":"2024-01-01",
                    "CUMBH_EXPRTN_DT":"9999-12-31",
                    "CUMBH_LAST_NM":"Capista",
                    "CUMBH_FST_NM":"Scott"
                }
            }""";

    private static String firstDependant = """
            {
                "source":"dependant",
                "afterImage":{
                    "CUMB_ID_NO":12346,
                    "CUMBH_EFF_DT":"2024-01-01",
                    "CUMBH_EXPRTN_DT":"9999-12-31",
                    "CUMBH_LAST_NM":"Capista",
                    "CUMBH_FST_NM":"Scott"
                }
            }""";

    private static String firstErroneousRecord = """
            {
                "source":"other",
                "afterImage":{
                    "CUMB_ID_NO":12346,
                    "CUMBH_EFF_DT":"2024-01-01",
                    "CUMBH_EXPRTN_DT":"9999-12-31",
                    "CUMBH_LAST_NM":"Capista",
                    "CUMBH_FST_NM":"Scott"
                }
            }""";




    @Test
    public void parseSubscriber(){
        Member member = new Member();
        Object object = member.processMemberMessage(firstSubscriber);
        assertTrue(object instanceof Subscriber);
    }

    @Test
    public void parseDependant(){
        Member member = new Member();
        Object object = member.processMemberMessage(firstDependant);
        assertTrue(object instanceof Dependant);
    }

    @Test( expected = IllegalArgumentException.class )
    public void parseErroneousRecord(){
        Member member = new Member();
        member.processMemberMessage(firstErroneousRecord);
    }

    @Test
    public void dependantValuesCorrect(){
        Member member = new Member();
        Object object = member.processMemberMessage(firstDependant);
        assertTrue(object instanceof Dependant);
        assertEquals(((Dependant) object).getCUMB_ID_NO(), 12346);
        assertEquals(((Dependant) object).getCUMBH_FST_NM(), "Scott");
        assertEquals(((Dependant) object).getCUMBH_LAST_NM(), "Capista");
        assertEquals(((Dependant) object).getCUMBH_EFF_DT(), LocalDate.of(2024, Month.JANUARY, 1));
        assertEquals(((Dependant) object).getCUMBH_EXPRTN_DT(), LocalDate.of(9999, Month.DECEMBER, 31));
    }

    @Test
    public void subscriberValuesCorrect(){
        Member member = new Member();
        Object object = member.processMemberMessage(firstSubscriber);
        assertTrue(object instanceof Subscriber);
        assertEquals(((Subscriber) object).getCUMB_ID_NO(), 12345);
        assertEquals(((Subscriber) object).getCUMBH_FST_NM(), "Scott");
        assertEquals(((Subscriber) object).getCUMBH_LAST_NM(), "Capista");
        assertEquals(((Subscriber) object).getCUMBH_EFF_DT(), LocalDate.of(2024, Month.JANUARY, 1));
        assertEquals(((Subscriber) object).getCUMBH_EXPRTN_DT(), LocalDate.of(9999, Month.DECEMBER, 31));
    }

    @Test
    public void insertNewDependant(){
        Member member = new Member();
        Object object = member.processMemberMessage(firstDependant);
        assertTrue(object instanceof Dependant);
        MemberDb memberDb = new MemberDb();
        memberDb.updateDependant((Dependant) object);
        //Bson query = eq("CUMB_ID_NO", ((Dependant) object).getCUMB_ID_NO());
        //Dependant dependant = database.getCollection("member", Dependant.class).find().first();
        //System.out.println(dependant.toString());
    }


}
