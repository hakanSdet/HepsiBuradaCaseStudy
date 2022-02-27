package com.HepsiBurada.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage extends BasePage{

    @FindBy(id = "myAccount")
    public WebElement signIn;

    @FindBy(id="login")
    public WebElement login;

    @FindBy(id ="txtUserName")
    public WebElement userNameInput;

    @FindBy(css = "#txtPassword")
    public WebElement passwordInput;

    @FindBy(xpath ="//*[@type='submit']")
    public WebElement submit;





}
