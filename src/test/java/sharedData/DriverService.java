package sharedData;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class DriverService {
    private WebDriver driver;

    public void prepareDriver(){
        driver = new ChromeDriver();
        driver.get("https://automationintesting.online");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void quitDriver(){
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
