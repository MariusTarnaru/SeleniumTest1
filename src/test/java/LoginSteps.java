import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class LoginSteps {

    private static WebDriver driver = new ChromeDriver();

    @io.cucumber.java.en.Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
        //1. Open the Chrome browser
        // System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\Testing\\Selenium\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    }

    @And("I enter the username and rest of fields")
    public void iEnterTheUsernameAnRestOfFields() throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/form");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(By.id("first-name")).sendKeys("Marius");
        //Thread.sleep(2000);
        driver.findElement(By.id("last-name")).sendKeys("Paul");
        Thread.sleep(2000);
        driver.findElement(By.id("job-title")).sendKeys("JAVA Developer");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-1")).click();
        //Thread.sleep(1000);
        Select fromMenuSelect = new Select(driver.findElement(By.id("select-menu")));
        fromMenuSelect.selectByIndex(2);
        //Thread.sleep(1000);
        driver.findElement(By.id("datepicker")).sendKeys("09/07/2021");

    }

    @Then("I should see the user form page submitting")
    public void iShouldSeeTheUserformPage() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Thread.sleep(3000);
        driver.findElement(new By.ByXPath("//a[contains(text(),'Submit')]")).click();
        driver.manage().deleteAllCookies();
        // driver.close();
    }
}
