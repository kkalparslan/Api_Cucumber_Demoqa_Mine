package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.GenerateToken;

public class GenerateStep_Defs {

    GenerateToken generateToken=new GenerateToken();

    @Given("input valid credentials")
    public void input_valid_credentials() {
        generateToken.generateToken();
    }

    @Then("verify token status")
    public void verify_token_status() {
        generateToken.verifyGenerateStatusCode();
    }
}
