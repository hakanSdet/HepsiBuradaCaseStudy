package com.HepsiBurada.Pages;

import com.HepsiBurada.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this );
    }

    @FindBy(xpath = "//*[.='Hesabım']")
    public static WebElement myAccount;

    @FindBy(xpath = "//*[@value]")
    public static WebElement searchBox;

    @FindBy(css = "#SearchBoxOld div.SearchBoxOld-buttonContainer")
    public static WebElement search;

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