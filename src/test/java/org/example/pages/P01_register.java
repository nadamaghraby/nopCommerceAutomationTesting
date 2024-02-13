package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.stepDefs.Hooks.driver;
public class P01_register extends P00{
/* //    nonPageFactory
void function to return the webelement then at stepdefs class make object from this class
and use it in the stepdefs functions and apply actions
    public WebElement registerPage(){
        return driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
    }
    */
//    pageFactory => Constructor class
//    Constructor
    @FindBy(css="a[href=\"/register?returnUrl=%2F\"]")
    public WebElement register;
    @FindBy(id ="gender-female")
    public WebElement gender;
    @FindBy(id="FirstName")
    public WebElement firstName;
    @FindBy(id="LastName")
    public WebElement lastName;

    @FindBy(css = "select[name=\"DateOfBirthDay\"]")
    public WebElement selectDay;

    @FindBy(css = "select[name=\"DateOfBirthMonth\"]")
    public WebElement selectMonth;

    @FindBy(css = "select[name=\"DateOfBirthYear\"]")
    public WebElement selectYear;

    @FindBy(id = "Email")
    public WebElement Email;

    @FindBy(id = "Company")
    public WebElement Company;

    @FindBy(id = "Newsletter")
    public WebElement News;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPassword;

    @FindBy(id = "register-button")
    public WebElement registerButton;
}
