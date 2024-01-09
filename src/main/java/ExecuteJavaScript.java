import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteJavaScript {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Applications/Dev_Programs/chromedriver-mac-x64/chromedriver");
        //how to set setProperty somewhere to reuse it?

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();

        WebElement closeButton = driver.findElement(By.id("close-button"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click;", closeButton);
        closeButton.click();

        driver.quit();

    }}
