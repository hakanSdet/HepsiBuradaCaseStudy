package com.HepsiBurada.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyCartPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"onboarding_item_list\"]/div[4]//span[2]")
    public WebElement actualProduct1;

    @FindBy(xpath = "//*[@id=\"onboarding_item_list\"]/div[3]//span[2]")
    public WebElement actualProduct2;

}
