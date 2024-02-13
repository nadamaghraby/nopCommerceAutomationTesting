package org.example.pages;

import org.openqa.selenium.support.PageFactory;
import static org.example.stepDefs.Hooks.driver;
public class P00 {

    public P00(){
        PageFactory.initElements(driver, this);
    }
}
