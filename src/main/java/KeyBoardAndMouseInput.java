import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardAndMouseInput {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Applications/Dev_Programs/chromedriver-mac-x64/chromedriver");
        //how to set setProperty somewhere to reuse it;

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Lamiya");

        WebElement button = driver.findElement(By.id("button"));
        button.click();


        driver.quit();
    }
}
