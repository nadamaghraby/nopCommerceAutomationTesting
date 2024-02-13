package org.example.stepDefs;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
//Hooks => main steps
public class Hooks {

    public static WebDriver driver;
//    static save the data inside the driver
    @Before
    public void openBrowser(){
        driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.navigate().to("https://demo.nopcommerce.com/");

    }

    @After
    public void quit() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
