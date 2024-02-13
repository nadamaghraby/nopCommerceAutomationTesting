package org.example.stepDefs;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import static org.example.stepDefs.Hooks.driver;

public class D01_registerStepDef {
    P01_register reg= new P01_register();
    SoftAssert soft=new SoftAssert();
    @When("user clicks to register page")
    public void goRegisterPage(){
//        System.out.println("This is a test before start coding");
        reg.register.click();
    }

    @And("user chooses the gender")
    public void userChoosesTheGender() {
        reg.gender.click();
    }

    @And("user enters the first name")
    public void userEntersTheFirstName() {
        reg.firstName.sendKeys("Nada");
    }
/*
    @And("user enters the first name {string}")
    public void userEntersTheFirstName(String arg0) {
        reg.firstName.sendKeys(arg0);
    }
*/
    @And("user enters the last name")
    public void userEntersTheLastName() {
        reg.lastName.sendKeys("Elmaghraby");
    }
/*
    @And("user enters the last name {string}")
    public void userEntersTheLastName(String arg0) {
        reg.lastName.sendKeys(arg0);
    }
*/
    @And("user chooses date of birth")
    public void userChoosesDateOfBirth() {

        Select selectDay=new Select(reg.selectDay);
        selectDay.selectByValue("14");

        Select selectMonth=new Select(reg.selectMonth);
        selectMonth.selectByValue("2");

        Select selectYear=new Select(reg.selectYear);
        selectYear.selectByValue("2000");
    }

    @And("user enters the email {string} field")
    public void userEntersTheEmailField(String arg0) {
        reg.Email.sendKeys(arg0);

    }
/*
    @And("user enters the email")
    public void userEntersTheEmail() {
        Faker fake=new Faker();
        String email= fake.internet().safeEmailAddress();
        reg.Email.sendKeys(email);
        System.out.println(email);
    }
*/
    @And("user enters the company name")
    public void userEntersTheCompanyName() {
        reg.Company.sendKeys("CU");
    }

    @And("user enters password and confirm it {string} {string}")
    public void userEntersPasswordAndConfirmIt(String arg0, String arg1) {
        reg.password.sendKeys(arg0);
        reg.confirmPassword.sendKeys(arg1);
    }
 /*
    @And("user enters password and confirm it")
    public void userEntersPasswordAndConfirmIt() {
        reg.password.sendKeys("Nadanadoud!");
        reg.confirmPassword.sendKeys("Nadanadoud!");
    }
*/
    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        reg.registerButton.click();
    }

//    mozella.davis@example.com
    @Then("the home is successfully opened")
    public void theHomeIsSuccessfullyOpened() {
//        Assertions
//        1- Success message
        String result=driver.findElement(By.cssSelector("div[class=\"result\"]")).getText();
        boolean exist=result.contains("Your registration completed");
        soft.assertTrue(exist);
//        2- Message Color
        String color=driver.findElement(By.cssSelector("div[class=\"result\"]")).getCssValue("color");
        String expectedColor="rgba(76, 177, 124, 1)";
        soft.assertEquals(color,expectedColor);
        soft.assertAll();
    }

}