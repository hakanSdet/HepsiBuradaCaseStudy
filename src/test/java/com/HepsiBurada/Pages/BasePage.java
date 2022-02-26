package com.HepsiBurada.Pages;

import com.HepsiBurada.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public  class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this );
    }

    @FindBy(css = "#button-cart")
    public WebElement addChartLocator;

    @FindBy(css="#cart-total")
    public WebElement itemsLocator;

    @FindBy(xpath = "//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")
    public WebElement viewChartLocator;

    @FindBy(xpath = "//a[contains(text(),'Estimate')]")
    public WebElement estimateShippingTaxesLocator;

    @FindBy(id = "input-country")
    public WebElement selectCountry;

    @FindBy(id = "input-zone")
    public WebElement selectRegion;

    @FindBy(id = "input-postcode")
    public WebElement postCode;

    @FindBy(xpath = "//*[@id='button-quote']")
    public WebElement buttonQuote;





    public WebElement navigateToMenu (String menu){

       WebElement menuLocator = Driver.get().findElement(By.xpath("//a[text() = '"+menu+"']"));

        return menuLocator;
    }

}