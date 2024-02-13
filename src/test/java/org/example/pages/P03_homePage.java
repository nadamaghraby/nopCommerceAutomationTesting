package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class P03_homePage extends P00 {
    @FindBy(id = "customerCurrency")
    public WebElement selectCurrency;

    @FindBy(css = "option[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]")
    public WebElement EURO;

    @FindBy(css= "span[class=\"price actual-price\"]")
    public List<WebElement> itemPrices;
    @FindBy(id = "small-searchterms")
    public WebElement searchBar;

    @FindBy(css = "button[type=\"submit\"]")
    public WebElement searchButton;
    @FindBy(css = "div[class=\"pager\"]>ul>li>a")
    public List<WebElement> pagesSlider; //contains individual page and next page icons

    @FindBy(css = "h2[class=\"product-title\"]>a")
    public List<WebElement> products;

    @FindBy(css = "div[class=\"picture\"]")
    public WebElement productClick;
    @FindBy(css = "div[class=\"sku\"]>span[class=\"value\"]")
    public WebElement productSku;
    @FindBy(css = "ul[class=\"top-menu notmobile\"]>li>a")
    public List<WebElement> categories;

    public List<WebElement> mainCategories = new ArrayList<>();
    @FindBy(css = "ul[class=\"top-menu notmobile\"]>li>ul>li>a")
    public List<WebElement> subCategories;
    public List<WebElement> subCategoriesComputers = new ArrayList<>();
    public List<WebElement> subCategoriesElectronics = new ArrayList<>();
    public List<WebElement> subCategoriesApparel = new ArrayList<>();
    @FindBy(tagName = "h1")
    public WebElement pageTitle;
    @FindBy(css = "div[class=\"nivo-controlNav\"]")
    public WebElement slider;
    public List<WebElement> sliderOptions= new ArrayList<>();

    @FindBy(css = "ul[class=\"networks\"]>li>a")
    public List<WebElement> networks;

    @FindBy(css="[class=\"button-2 add-to-wishlist-button\"]")
    public List<WebElement> wishlistButtons;

    @FindBy(css = "[class=\"bar-notification success\"]>p")
    public WebElement successMsg;
//    success msg appears
    @FindBy(css = "[class=\"bar-notification success\"]")
    public WebElement msgBar;
//    get css value => background-color
//    (r, g, b , a) => rgba(75, 176, 122, 1)

    @FindBy(css = "span[class=\"wishlist-label\"]")
    public WebElement wishlistTab;

    @FindBy(css = "span[class=\"wishlist-qty\"]")
    public WebElement productsNo;
}
