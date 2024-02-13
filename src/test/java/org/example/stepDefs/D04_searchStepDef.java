package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;
public class D04_searchStepDef {
    P03_homePage search=new P03_homePage();
    SoftAssert soft=new SoftAssert();
    @When("User goes to search bar")
    public void goesToSearchBar(){
        search.searchBar.click();
    }

    @And("Type the product name {string}")
    public void typeTheProductName(String arg0) {
        search.searchBar.sendKeys(arg0);
        search.searchButton.click();
    }
//I can make a for loop for pages that products appear on it then assert?
    @Then("Search shows relevant results to the product name {string}")
    public void searchShowsRelevantResultsTo(String arg0) throws InterruptedException{
        //        productName Assertions
//        1- URL Contains
        String currURL=driver.getCurrentUrl();
        String URL="https://demo.nopcommerce.com/search?q=";
        boolean includes=currURL.contains(URL);
        soft.assertTrue(includes);
//        2- Search shows relevant results
//        int noProducts=search.products.size();
            for (WebElement product : search.products) {
                String title = product.getText().toLowerCase();
                System.out.println(title);
                boolean resContains = title.contains(arg0);
                soft.assertTrue(resContains);
            }
        if (!search.pagesSlider.isEmpty()) {
            search.pagesSlider.get(0).click();
            for (WebElement productNext : search.products) {
                String titleOfNext = productNext.getText().toLowerCase();
                System.out.println(titleOfNext);
                boolean resContains = titleOfNext.contains(arg0);
                soft.assertTrue(resContains);
            }
        }
        soft.assertAll();
//        int noPages=search.pagesSlider.size(); // => only 2  [2, next]
    }

    @And("Type the product serial number {string}")
    public void typeTheProductSerialNumber(String arg0) {
        search.searchBar.sendKeys(arg0);
        search.searchButton.click();
        search.productClick.click();
    }


    @Then("Search shows relevant results to the product sku{string}")
    public void searchShowsRelevantResultsToTheProductSku(String arg0) {
//        Assertions
        String skuShown=search.productSku.getText();
        boolean found=skuShown.contains(arg0);
        soft.assertTrue(found);
        soft.assertAll();
    }
}
