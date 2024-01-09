import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

    public static void main(String[]args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Applications/Dev_Programs/chromedriver-mac-x64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileUploadPlace = driver.findElement(By.id("file-upload-field"));
        fileUploadPlace.sendKeys("Screenshot 2023-12-21 at 12.54.25 PM.png");

      //  Thread.sleep(3000);

        WebElement resetButton = driver.findElement(By.cssSelector("button[class='btn btn-warning btn-reset']"));
        resetButton.click();

        driver.quit();

    }

}
