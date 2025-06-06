package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CategoryPage {
    private static By elementToFind =By.id("ShoeType");
    public static void verify_the_category_visibility(){
       $(elementToFind).getText();
        Assert.assertEquals($(elementToFind).getText(), "Formal Shoes");
    }
}
