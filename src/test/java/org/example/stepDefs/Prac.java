package org.example.stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.stylesheets.LinkStyle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class Prac {
    WebDriver driver;
    @BeforeMethod
    public void open() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @Test
    public void test() throws InterruptedException {
        driver.findElement(By.id("small-searchterms")).sendKeys("book");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        List<WebElement> pagesSlider=driver.findElements(By.cssSelector("div[class=\"pager\"]>ul>li<a"));
        boolean slctd=pagesSlider.get(0).isSelected();
        System.out.println(slctd);

        /*driver.findElements(By.cssSelector("[class=\"button-2 add-to-wishlist-button\"]")).get(2).click();
        Thread.sleep(4000);
//        WebDriverWait explicitWait= new WebDriverWait(driver,Duration.ofSeconds(8));
//        explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class=\"bar-notification success\"]")));
        String msg=driver.findElement(By.cssSelector("[class=\"bar-notification success\"]>p")).getText();
//        System.out.println(msg);
        WebElement msgBar=driver.findElement(By.cssSelector("[class=\"bar-notification success\"]"));
        WebDriverWait expWait=new WebDriverWait(driver,Duration.ofSeconds(8));
        expWait.until(ExpectedConditions.invisibilityOf(msgBar));
        driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]")).click();
        String txt=driver.findElement(By.cssSelector("span[class=\"wishlist-qty\"]")).getText();
        txt = txt.replaceAll("\\p{P}","");
//        System.out.println(txt);
        int num=Integer.valueOf(txt);
        if (num>0){
            System.out.println(num);
        }*/

  /*      List <WebElement> networks=driver.findElements(By.cssSelector("ul[class=\"networks\"]>li"));
        networks.get(0).click();
        WebDriverWait explicitWait= new WebDriverWait(driver,Duration.ofSeconds(8));
        explicitWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> URLs= new ArrayList<>(driver.getWindowHandles());
        System.out.println(URLs);
        driver.switchTo().window(URLs.get(1));
        System.out.println(driver.getCurrentUrl());
*/
    /*
        List<WebElement> sliderOptions=driver.findElement(By.cssSelector("div[class=\"nivo-controlNav\"]")).findElements(By.tagName("a"));
        System.out.println(sliderOptions.get(0).getText());
        System.out.println(sliderOptions.get(1).getText());
        String URL1=driver.getCurrentUrl();
        System.out.println(URL1);
        Actions actions = new Actions(driver);
        actions.moveToElement(sliderOptions.get(0)).perform();
        Thread.sleep(5000);
        sliderOptions.get(0).click();
        Thread.sleep(5000);
        String URL=driver.getCurrentUrl();
        System.out.println(URL);
        */
//        Actions actions = new Actions(driver);
//        // Click on a category (e.g., 'Computers')
//        WebElement categoryComputers = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(), 'Computers')]"));
//        actions.moveToElement(categoryComputers).perform();
//        // Click on a subcategory (e.g., 'Notebooks')
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
//        WebElement subcategoryNotebooks = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='top-menu']//a[contains(text(), 'Notebooks')]")));
//        subcategoryNotebooks.click();
    }
  /*      Actions action = new Actions(driver);
        List<WebElement> categories = driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a"));
        for (WebElement categoryElement : categories) {
            String categoryName = categoryElement.getText();
            action.moveToElement(categoryElement).perform();
            List<WebElement> subCategoryElement= categoryElement.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li/ul/li/a"));
            System.out.println(categoryElement.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li/ul/li/a")));
*/
            /*
            if (subCategoryElement.size()==3) {
                // Category has subcategories
                System.out.println(categoryName + " has subcategories.");
                // Perform actions for categories with subcategories
            } else {
                // Category does not have subcategories
                System.out.println(categoryName + " does not have subcategories.");
                // Perform actions for categories without subcategories
            }
*/





   /*     driver.findElement(By.cssSelector("a[href=\"http://elementalselenium.com/\"]")).click();
        System.out.println(driver.getCurrentUrl());
    */
//        List<WebElement> subCategories=driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul>li>a"));
//        System.out.println(subCategories.get(0).getText());
//        driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href=\"/computers\"]")).click();
    // 1- Create object from Actions class (in Selenium)
        /*
        WebElement category = driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href=\"/computers\"]"));
//        System.out.println(category.getText());
        List<WebElement> subCategories=driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul>li>a"));
        int min = 0; // Minimum value of range
        int max =  2; // Maximum value of range
        int random_int_for_subCat = (int)Math.floor(Math.random() * (max - min+1)+min);
        WebElement randSubCategory=subCategories.get(random_int_for_subCat);
//        action.moveToElement(randSubCategory).perform();
        System.out.println(randSubCategory.getText());

//        ArrayList<String> subCategoriesNames=new ArrayList<>();
////        System.out.println("fe eh?????");
        /*
        for (WebElement subcategory : subCategories){
//            subCategoriesNames.add(subcategory.getText());
            System.out.println(subcategory.getText());
        }
*/
//        System.out.println(subCategoriesNames);

        /*
        ArrayList<String> tabs=new ArrayList<>();
        tabs.add("Nada");
        tabs.add("nadoud");
        tabs.add("nody");
        System.out.println(tabs);

/*
        WebDriverWait exp= new WebDriverWait(driver, Duration.ofSeconds(8));
        exp.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> urls= new ArrayList<>(driver.getWindowHandles());
//        urls => [tab1, tab2]
        System.out.println(urls);
        driver.switchTo().window(urls.get(1));
*/

/*
// 2- categories
         List<WebElement> categories=driver.findElements(By.cssSelector( "ul[class=\"top-menu notmobile\"]>li>a"));
         List<WebElement> mainCategories = new ArrayList<>();
         for(int i=0;i<3; i++){
            WebElement element=categories.get(i);
            mainCategories.add(element);
        }

        for (WebElement mainCategory : mainCategories) {
            System.out.println(mainCategory.getText());
        }
*/
    @AfterMethod
    public void quit() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
//        driver.close();
}
