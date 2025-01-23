package org.example.Utilities;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class DataUtility {

    // TODO : reading data from json file

    private static final String TEST_Data_Path = "src/test/resources/Test Data/";

    public static String get_JsonData ( String fileName, String field ) throws FileNotFoundException {
        FileReader reader = new FileReader(TEST_Data_Path +fileName + ".json");

        JsonElement jsonElement = JsonParser.parseReader(reader);
        return jsonElement.getAsJsonObject().get(field).getAsString();

    }

    public static void clickOnElement (WebDriver driver , By locator )
    {
        new WebDriverWait(driver , Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
    }

    //TODO : reading data from properties

    public static String getValue ( String fileName , String key) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(TEST_Data_Path +fileName + ".properties"));
     return    properties.getProperty(key);


    }








}
