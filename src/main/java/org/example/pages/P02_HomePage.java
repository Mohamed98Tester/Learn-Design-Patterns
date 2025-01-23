package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_HomePage   {

private  WebDriver driver ;

 public P02_HomePage (WebDriver driver) {

     this .driver = driver ;

 }

private final By logout = By.cssSelector("[onclick=\"logout()\"]");


 public void clickOnLogout (){

     driver.findElement(logout).click();
 }

















}
