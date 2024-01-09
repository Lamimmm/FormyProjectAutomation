import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {

    public static void submitForm(WebDriver driver){
        WebElement firstNameFill = driver.findElement(By.id("first-name"));
        firstNameFill.sendKeys("Lamiya");

        WebElement lastNameFill = driver.findElement(By.id("last-name"));
        lastNameFill.sendKeys("Abbasova");

        WebElement jobTittleFill = driver.findElement(By.id("last-name"));
        jobTittleFill.sendKeys("SDET");

        WebElement education = driver.findElement(By.id("radio-button-1"));
        education.click();

        WebElement sex = driver.findElement(By.id("checkbox-2"));
        sex.click();

        WebElement experience = driver.findElement(By.id("select-menu"));
        experience.click();
        WebElement selectExperience = driver.findElement(By.cssSelector("option[value='3']"));
        selectExperience.click();

        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("01/08/2024");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        WebElement submitButton = driver.findElement(By.cssSelector("a[class='btn btn-lg btn-primary']"));
        submitButton.click();
    }
}
