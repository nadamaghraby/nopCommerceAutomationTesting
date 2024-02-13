package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.example.stepDefs.Hooks.driver;

public class D05_hoverCategoriesStepDef {
    P03_homePage hover=new P03_homePage();
    SoftAssert soft=new SoftAssert();
    WebElement randCategory;
    WebElement randSubCategory;
    String subCatTitle;
    Actions action = new Actions(driver);

    @When("User hover on a random category and get their subcategories")
    public WebElement userHoverOnARandomCategoryAndGetTheirSubcategories() {
        for(int i=0;i<3; i++){
                WebElement element=hover.categories.get(i);
                hover.mainCategories.add(element);
        }
        for(int i=0; i<3; i++){
            WebElement subElement=hover.subCategories.get(i);
            hover.subCategoriesComputers.add(subElement);
        }
        for(int i=3; i<6; i++){
            WebElement subElement=hover.subCategories.get(i);
            hover.subCategoriesElectronics.add(subElement);
        }
        for(int i=6; i<9; i++){
            WebElement subElement=hover.subCategories.get(i);
            hover.subCategoriesApparel.add(subElement);
        }
        int min = 0; // Minimum value of range
        int max =  hover.mainCategories.size()-1; // Maximum value of range => 2
        int random_int_for_cat = (int)Math.floor(Math.random() * (max - min+1)+min);
        randCategory= hover.mainCategories.get(random_int_for_cat);
        action.moveToElement(randCategory).perform();
//        Sub Categories
        int random_int_for_subCat = (int)Math.floor(Math.random() * (max - min+1)+min);
//        switch ()

        if (Objects.equals(randCategory.getText(), "Computers")) {
            randSubCategory = hover.subCategoriesComputers.get(random_int_for_subCat);
        }
        else if (Objects.equals(randCategory.getText(), "Electronics")) {
                randSubCategory=hover.subCategoriesElectronics.get(random_int_for_subCat);
            }
            else {
                randSubCategory=hover.subCategoriesApparel.get(random_int_for_subCat);
            }

        return randSubCategory;
    }

    @And("User selects random subcategory, get the text, and clicks on it")
    public String userSelectsRandomSubcategoryGetTheTextAndClicksOnIt() {
//        subCatTitle=randSubCategory.getText();
//        System.out.println(subCatTitle);
        /*
        WebDriverWait explicitlyWait=new WebDriverWait(driver, Duration.ofSeconds(15));
        randSubCategory=explicitlyWait.until(ExpectedConditions.elementToBeClickable(randSubCategory)); */
        action.moveToElement(randSubCategory).perform();
        String subTitle=randSubCategory.getText();
        System.out.println(subTitle);
        subCatTitle=subTitle.toLowerCase().trim();
        randSubCategory.click();
        return subCatTitle;
    }

    @Then("The subcategory title contains the page title")
    public void theSubcategoryTitleContainsThePageTitle() {
        String txt=hover.pageTitle.getText();
        String title=txt.toLowerCase().trim(); // trim() is used to remove any extra whitespace at the beginning or end of a string
        soft.assertEquals(title,subCatTitle);
        /*
        ArrayList<String> urls= new ArrayList<>(driver.getWindowHandles());
        System.out.println(urls);
        driver.switchTo().window(urls.get(1));
        */
        soft.assertAll();
    }
}
