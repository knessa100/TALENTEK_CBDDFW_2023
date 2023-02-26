package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Config {
    // initialize the Driver
    public static WebDriver driver;

    // Setup browser type
    public static WebDriver setupBrowser (String driverType){
        if (driverType.equalsIgnoreCase("ch")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (driverType.equalsIgnoreCase("ff")) {
            WebDriverManager.firefoxdriver().setup();
            driver= new FirefoxDriver();
        } else if (driverType.equalsIgnoreCase("Safari")) {
            WebDriverManager.safaridriver();
        }
        driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }
}
