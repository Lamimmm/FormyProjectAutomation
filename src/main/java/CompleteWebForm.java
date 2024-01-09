import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class CompleteWebForm {

    public static void main(String[]args){


        System.setProperty("webdriver.chrome.driver", "/Applications/Dev_Programs/chromedriver-mac-x64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");


         FormPage formPage = new FormPage();
         formPage.submitForm(driver);

         ConfirmationPage confPage = new ConfirmationPage();
         confPage.waitForAlertBanner(driver);

         Assert.assertEquals("The form was successfully submitted!",confPage.getAllerBannerText(driver));

        driver.quit();
    }


}
