package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class D03_currenciesStepDef {
    P03_homePage curr=new P03_homePage();
    SoftAssert soft=new SoftAssert();

    @When("user selects euro currency")
    public void selectCurrency() throws InterruptedException{
        Select selectCurr = new Select(curr.selectCurrency);
        selectCurr.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
        Thread.sleep(2000);
    }

/*
    @And("goes to Featured products")
    public void goesToFeaturedProducts() {
//        List of prices by find elements
//        itemPrices.getText
        curr.itemPrices.get(0).getText();
        System.out.println(curr.itemPrices.get(0).getText());
    }
*/
    @Then("Euro Symbol is shown on products")
    public void euroSymbolIsShownOnProducts() {
//        Assertions
        WebDriverWait expWait=new WebDriverWait(driver, Duration.ofSeconds(8));
        expWait.until(ExpectedConditions.visibilityOf(curr.EURO));

        for (WebElement itemPrice: curr.itemPrices){
            String price=itemPrice.getText();
            System.out.println(price);
            boolean euro=price.contains("€");
            soft.assertTrue(euro);
        }
        soft.assertAll();
    }

}
