import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginStep {
    private static WebDriver driver = new ChromeDriver();
    private WebElement alertSuccess;
    @io.cucumber.java.en.Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
        //1. Open the Chrome browser
       // System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\Testing\\Selenium\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    }

    @And("I enter the username as admin and password as admin")
    public void iEnterTheUsernameAsAdminAndPasswordAsAdmin() {
        driver.get("https://formy-project.herokuapp.com/form");
        driver.manage().window().maximize();
        driver.findElement(By.id("first-name")).sendKeys("Marius");
        driver.findElement(By.id("last-name")).sendKeys("Paul");
        driver.findElement(By.id("job-title")).sendKeys("JAVA Developer");
    }

    @Then("I should see the userform page submitting")
    public void iShouldSeeTheUserformPage() {
        driver.findElement(new By.ByXPath("//a[contains(text(),'Submit')]")).click();
        // driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        // driver.close();
    }
}
