package org.example.stepDefs;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;

import static org.example.stepDefs.Hooks.driver;
public class D07_followUsStepDef {
    P03_homePage follow=new P03_homePage();
    SoftAssert soft=new SoftAssert();
    String currURL;
    ArrayList<String> URLs;
    @When("User clicks on facebook logo")
    public String clicksOnFacebook(){
        System.out.println(follow.networks.get(0).getText());
        follow.networks.get(0).click();
        WebDriverWait explicitWait= new WebDriverWait(driver, Duration.ofSeconds(8));
        explicitWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        URLs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(URLs.get(1));
        currURL=driver.getCurrentUrl();
        return currURL;
    }


    @Then("Page on Facebook {string} is opened in a new tab")
    public void pageOnFacebookIsOpenedInANewTab(String arg0) {
        soft.assertEquals(currURL,arg0);
        soft.assertAll();
    }

    @When("User clicks on twitter logo")
    public String clicksOnTwitter(){
        System.out.println(follow.networks.get(1).getText());
        follow.networks.get(1).click();
        WebDriverWait explicitWait= new WebDriverWait(driver, Duration.ofSeconds(8));
        explicitWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        URLs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(URLs.get(1));
        currURL=driver.getCurrentUrl();
        return currURL;
    }


    @Then("Account on a twitter {string} is opened in a new tab")
    public void accountOnATwitterIsOpenedInANewTab(String arg0) {
        soft.assertEquals(currURL,arg0);
        soft.assertAll();
    }

    @When("User clicks on rss logo")
    public String clicksOnRSS(){
        System.out.println(follow.networks.get(2).getText());
        follow.networks.get(2).click();
        WebDriverWait explicitWait= new WebDriverWait(driver, Duration.ofSeconds(8));
        explicitWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        URLs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(URLs.get(1));
        currURL=driver.getCurrentUrl();
        return currURL;
    }

    @Then("The URL {string} is opened in a new tab")
    public void theURLIsOpenedInANewTab(String arg0) {
        soft.assertEquals(currURL,arg0);
        soft.assertAll();
    }

    @When("User clicks on youtube logo")
    public String clicksOnYoutube(){
        System.out.println(follow.networks.get(3).getText());
        follow.networks.get(3).click();
        WebDriverWait explicitWait= new WebDriverWait(driver, Duration.ofSeconds(8));
        explicitWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        URLs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(URLs.get(1));
        currURL=driver.getCurrentUrl();
        return currURL;
    }

    @Then("Channel on YouTube {string} is opened in a new tab")
    public void channelOnYouTubeIsOpenedInANewTab(String arg0) {
        soft.assertEquals(currURL,arg0);
        soft.assertAll();
    }
}
