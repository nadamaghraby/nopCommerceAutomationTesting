package org.example.stepDefs;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D02_loginStepDef {

    P02_login log=new P02_login();
    SoftAssert soft=new SoftAssert();

    @When("user goes to login page")
    public void goLoginPage(){
        log.login.click();
    }
/*
    @And("user login with valid mail and password")
    public void userLoginWithValidMailAndPassword() {
//        Faker fake=new Faker();
//        String mail= fake.internet().safeEmailAddress();
        log.email.sendKeys("nada@example.com");
        log.password.sendKeys("Nadanadoud1");
    }
*/
    @And("user login with valid mail {string} and password {string}")
    public void userLoginWithValidMailAndPassword(String arg0, String arg1) {
        log.email.sendKeys(arg0);
        log.password.sendKeys(arg1);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        log.loginButton.click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
//        Assertions
//        1- URL
        String currURL=driver.getCurrentUrl();
        soft.assertEquals(currURL,"https://demo.nopcommerce.com/");
//        2- My account is displayed
        boolean MyAccount= driver.findElement(By.cssSelector("a[class=\"ico-account\"]")).isDisplayed();
        soft.assertTrue(MyAccount);
        soft.assertAll();
    }
/*
    @And("user login with invalid mail and password")
    public void userLoginWithInvalidMailAndPassword() {
        log.email.sendKeys("nada@gmail.com");
        log.password.sendKeys("9874365dd");
    }
*/
    @And("user login with invalid mail {string} and password {string}")
    public void userLoginWithInvalidMailAndPassword(String arg0, String arg1) {
        log.email.sendKeys(arg0);
        log.password.sendKeys(arg1);
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
//    Assertions
//        1- Message
        String unsuccessfulMsg=driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]")).getText();
        boolean exist =unsuccessfulMsg.contains("Login was unsuccessful.");
        soft.assertTrue(exist);
//        2- Color
        String msgColor=driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]")).getCssValue("color");
        String expectedColor="rgba(228, 67, 75, 1)";
        soft.assertEquals(msgColor,expectedColor);
        soft.assertAll();
    }


}
