package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private static By usernameField=By.id("usr");
    private static By passwordField=By.id("pwd");
    private static By loginButton=By.xpath("//input[@value='Login']");
    public static void set_username() {
        $(usernameField).type("imane");
    }
    public static void set_password() {
       $(passwordField).type("imane");
    }
    public static void click_login_button() {
         $(loginButton).click();
    }
}
