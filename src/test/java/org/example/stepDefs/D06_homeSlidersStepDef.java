package org.example.stepDefs;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;
public class D06_homeSlidersStepDef {
    SoftAssert soft=new SoftAssert();
    P03_homePage homeSlider= new P03_homePage();
    Actions actions = new Actions(driver);
    String firstURL;
    String secondURL;

    @When("User clicks on first slider")
    public String clicksOn1stSlider() throws InterruptedException {
        homeSlider.sliderOptions=homeSlider.slider.findElements(By.tagName("a"));
//        hover first before clicking
        actions.moveToElement(homeSlider.sliderOptions.get(0)).perform();
//        It doesn't matter if I hover before or not, I needed to wait after clicking to get the right URL
        homeSlider.sliderOptions.get(0).click();
//        System.out.println(homeSlider.sliderOptions.get(0).getText());
        /*
        WebDriverWait explicitlyWait= new WebDriverWait(driver, Duration.ofSeconds(8));
        explicitlyWait.until(ExpectedConditions.urlContains("https://demo.nopcommerce.com/nokia-lumia-1020"));
//        It doesn't work when the condition won't happen
        */
        Thread.sleep(3000);
        firstURL= driver.getCurrentUrl();
        System.out.println(firstURL);
        return firstURL;
    }


    @Then("User is directed to the first product's page")
    public void userIsDirectedToTheFirstProductSPage() {
//        Assertion
        String expectedURL="https://demo.nopcommerce.com/nokia-lumia-1020";
        boolean exist=firstURL.contains(expectedURL);
        soft.assertTrue(exist);
        soft.assertAll();
    }

    @When("User clicks on second slider")
    public String clicksOn2ndSlider() throws InterruptedException{
        homeSlider.sliderOptions=homeSlider.slider.findElements(By.tagName("a"));
        homeSlider.sliderOptions.get(1).click();
//        System.out.println(homeSlider.sliderOptions.get(1).getText());
        Thread.sleep(3000);
        secondURL= driver.getCurrentUrl();
        System.out.println(secondURL);
        return secondURL;
    }

    @Then("User is directed to the second product's page")
    public void userIsDirectedToTheSecondProductSPage() {
        //        Assertion
        String expectedURL="https://demo.nopcommerce.com/iphone-6";
        boolean exist=secondURL.contains(expectedURL);
        soft.assertTrue(exist);
        soft.assertAll();
    }
}
