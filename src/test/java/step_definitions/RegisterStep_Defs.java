package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.Register;

public class RegisterStep_Defs {

    Register register=new Register();
    @Given("User should register with valid credentials")
    public void user_should_register_with_valid_credentials() {
        register.userRegister();
    }
    @Then("User should verify status code")
    public void user_should_verify_status_code() {
        register.verifyRegisterStatusCode();
    }

}
