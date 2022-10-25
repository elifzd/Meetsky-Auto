package com.meetsky.pages;

import com.meetsky.utilities.ConfigurationReader;
import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

    public TaskPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id="user")
    public WebElement inputUsername;

    @FindBy(id="password")
    public WebElement inputPassword;

    @FindBy(id="submit-form")
    public WebElement loginButton;

    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("meetsky.url"));
        inputUsername.sendKeys(ConfigurationReader.getProperty("meetsky.username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("meetsky.password"));
        loginButton.click();
    }



}
