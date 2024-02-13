package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.stepDefs.Hooks.driver;

public class P02_login extends P00{
    @FindBy(css="a[href=\"/login?returnUrl=%2F\"]")
    public WebElement login;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id="Password")
    public WebElement password;

    @FindBy(css="button[class=\"button-1 login-button\"]")
    public WebElement loginButton;

}
