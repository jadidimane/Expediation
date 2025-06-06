package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {
    private static By menuIcon=By.xpath("//div[@id='menuToggle']//input");
    private static By signinOption=By.xpath("//*[@id='menu']/a[2]/li");
   public static void click_menu_icon(){
       open("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
       $(menuIcon).click();
   }
   public static void  click_sign_in(){
       $(signinOption).click();
   }

}
