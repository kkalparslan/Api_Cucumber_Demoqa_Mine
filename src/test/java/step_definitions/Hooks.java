package step_definitions;

import io.cucumber.java.Before;
import io.restassured.RestAssured;
import org.junit.After;

import static io.restassured.path.json.JsonPath.reset;

public class Hooks {

    @Before
    public void setUp(){
        RestAssured.baseURI="https://demoqa.com";
    }

    @After
    public void tearDown(){
        reset();
    }
}
