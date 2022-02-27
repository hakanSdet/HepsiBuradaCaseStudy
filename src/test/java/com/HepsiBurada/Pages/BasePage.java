package com.HepsiBurada.Pages;

import com.HepsiBurada.Utilities.Driver;
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

    @FindBy(id = "shoppingCart")
    public static WebElement MyCart;



    }

