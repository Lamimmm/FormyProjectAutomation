import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickers {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "/Applications/Dev_Programs/chromedriver-mac-x64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateFilled = driver.findElement(By.id("datepicker"));
        dateFilled.sendKeys("03/03/26");
        dateFilled.sendKeys(Keys.RETURN);


        driver.quit();


    }
}
