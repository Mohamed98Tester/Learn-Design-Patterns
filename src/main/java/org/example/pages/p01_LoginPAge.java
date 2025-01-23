package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class p01_LoginPAge {


private WebDriver driver;


  private final By userName = By.id("inputUsername"); // locator for user name
 private final By password =By.id("inputPassword"); // locator for password
 private final By loginButton =By.id("loginButton"); // locator for sign in

    // locator

    public  p01_LoginPAge (WebDriver driver )   { // initlising  driver

        this.driver =driver;

    }
        public p01_LoginPAge enterMailOfUserName (String mailOfUserName){

        driver.findElement(userName).sendKeys(mailOfUserName);
        return this ;

    }
public p01_LoginPAge enterPassword ( String passwordText){

        driver.findElement(password).sendKeys(passwordText);
        return this;
}
    public P02_HomePage clickOnSignIN (){
        driver.findElement(loginButton).click();
        return new P02_HomePage(driver);    // for switch driver to another page (home page)

}















}
