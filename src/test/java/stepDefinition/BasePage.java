package stepDefinition;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import pages.HomePage.*;

import static pages.HomePage.click_menu_icon;
import static pages.HomePage.click_sign_in;

public class BasePage {
    @Before
    public void setUp() {
        Configuration.timeout = 8000; // 8 secondes
        Configuration.browser = "chrome"; // exemple de config complémentaire
    }
    @Given("user navigate to the login page")
    public void navigateToLoginPage() {
        click_menu_icon();
        click_sign_in();
    }
}
