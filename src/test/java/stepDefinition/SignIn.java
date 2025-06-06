package stepDefinition;

import io.cucumber.java.en.When;

import static pages.LoginPage.*;

public class SignIn {
    @When("user succcessfully enter the login details")
    public void inLoginPage() {
        set_username();
        set_password();
        click_login_button();
    }
}
