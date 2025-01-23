import io.qameta.allure.Description;
import org.example.Utilities.DataUtility;
import org.example.pages.p01_LoginPAge;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class TC01_LoginTest {

    private WebDriver driver;


    @BeforeMethod
    public void setupdriver () throws IOException {

        driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(DataUtility.getValue("data","loginm"));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
@Description("mmmmm")
    @Test
    public void validLogin () throws IOException {

     new p01_LoginPAge(driver)
         .enterMailOfUserName(DataUtility.getValue("data","mm") )
       .enterPassword("admin")  .clickOnSignIN();

        Assert .assertEquals(driver.getCurrentUrl(),"https://ashraaf7.github.io/AA-Practice-Test-Automation/Pages/main.html");

    }

@AfterMethod
    public void quit (){
        driver.quit();
}














}
