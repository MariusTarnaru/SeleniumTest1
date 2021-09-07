This is my firs Automation Testing project.

Test with Cucumber - Selenium with the page:

https://formy-project.herokuapp.com/form
and Chrome browser
using Cucumber
and Selenium WebDriver

-------------------- Used -----------------------------

    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        driver.get("https://formy-project.herokuapp.com/form");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        
        driver.findElement(By.id("first-name")).sendKeys("******");
        
        Select  fromMenuSelect = new Select(driver.findElement(By.id("select-menu")));
                fromMenuSelect.selectByIndex(2);
        driver.findElement(By.id("datepicker")).sendKeys("09/07/2021");
        
        driver.findElement(new By.ByXPath("//a[contains(text(),'Submit')]")).click();
                driver.manage().deleteAllCookies();


Thank's !   ;)
