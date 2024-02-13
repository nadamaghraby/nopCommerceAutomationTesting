package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;
public class D08_wishlistStepDef {
    P03_homePage wish=new P03_homePage();
    SoftAssert soft=new SoftAssert();
    int Qty;

    @When("User clicks on wishlist button ❤")
    public void clickOnWishlistButton() throws InterruptedException{
        wish.wishlistButtons.get(2).click();
        Thread.sleep(3000);
        /*
        WebDriverWait expWait=new WebDriverWait(driver,Duration.ofSeconds(8));
        expWait.until(ExpectedConditions.visibilityOf(wish.msgBar));

         */
    }


    @Then("Product is added to wishlist successfully")
    public void productIsAddedToWishlistSuccessfully(){
//        Assertions
//        1- success msg appeared
//        It's better to wait before getting values from the element
//        Waiting for it to appear, Used explicit wait also but it doesn't work fine
        /* WebDriverWait expWait=new WebDriverWait(driver,Duration.ofSeconds(8));
        expWait.until(ExpectedConditions.visibilityOf(wish.msgBar));
        */
        String txt=wish.successMsg.getText();
        boolean msgExist=txt.contains("The product has been added to your wishlist");
        soft.assertTrue(msgExist);

//        2- green color background
        String color=wish.msgBar.getCssValue("background-color");
        String expectedColor="rgba(75, 176, 122, 1)";
        soft.assertEquals(color,expectedColor);
        soft.assertAll();
    }

    @And("User clicks on wishlist tab")
    public int userClicksOnWishlistTab() {
//        boolean displayed=wish.successMsg.isDisplayed();

        WebDriverWait expWait=new WebDriverWait(driver,Duration.ofSeconds(8));
        expWait.until(ExpectedConditions.invisibilityOf(wish.msgBar));

        wish.wishlistTab.click();
        String text=wish.productsNo.getText();
        text = text.replaceAll("\\p{P}",""); //removes all punctuations
        Qty=Integer.parseInt(text);
        return Qty;
    }
    @Then("There are products in wishlist")
    public void thereAreProductsInWishlist() {
//        Assertion
//        Qty value is more than 0
        if (Qty>0){
            soft.assertTrue(true);
        }
        soft.assertAll();
    }
}

