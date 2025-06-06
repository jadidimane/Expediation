package stepDefinition;

import io.cucumber.java.en.Then;

import static pages.CategoryPage.verify_the_category_visibility;

public class ProductCategory {
    @Then("User should be able to see the product category page")
    public void user_should_be_able_to_see_the_product_category_page() {
        verify_the_category_visibility();
    }

}
