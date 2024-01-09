import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollElement {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Applications/Dev_Programs/chromedriver-mac-x64/chromedriver");
        //how to set setProperty somewhere to reuse it?

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");



        WebElement nameInput = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(nameInput);
        nameInput.sendKeys("Lamiya");

        WebElement dateInput = driver.findElement(By.id("date"));
        actions.moveToElement(dateInput);
        dateInput.sendKeys("03.13.1996");


    }}
