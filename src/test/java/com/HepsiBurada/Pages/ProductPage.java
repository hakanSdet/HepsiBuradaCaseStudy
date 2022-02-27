package com.HepsiBurada.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(id = "i0")
    public WebElement firstProduct;

    @FindBy(id ="merchantTabTrigger")
    public WebElement allSeller;

    @FindBy(xpath = "//*[@id=\"merchant-list\"]//tr[3]/td[4]/form/button")
    public WebElement firstSeller;

    @FindBy(xpath = "//*[@id=\"merchant-list\"]//tr[4]/td[4]/form/button")
    public WebElement secondSeller;

    @FindBy(css = ".checkoutui-Modal-2iZXl")
    public WebElement closeSign;

    @FindBy(xpath = "//*[@id=\"merchant-list\"]//tr[3]//div/a[2]")
    public WebElement expectedProduct1;

    @FindBy(xpath = "//*[@id=\"merchant-list\"]//tr[4]//div/a[2]")
    public WebElement expectedProduct2;







}
