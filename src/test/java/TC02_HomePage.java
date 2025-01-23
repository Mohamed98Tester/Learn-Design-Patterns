import org.example.pages.p01_LoginPAge;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC02_HomePage {

private WebDriver driver;

    @BeforeMethod
    public void setupdriver (){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ashraaf7.github.io/AA-Practice-Test-Automation/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void logoutTC (){

        new p01_LoginPAge(driver)
                .enterMailOfUserName("admin")
                .enterPassword("admin").clickOnSignIN()
                .clickOnLogout();

        Assert.assertNotEquals(driver.getCurrentUrl(),"https://ashraaf7.github.io/AA-Practice-Test-Automation/Pages/main.html");

    }

    @AfterMethod
    public void quit (){
        driver.quit();
    }













}
