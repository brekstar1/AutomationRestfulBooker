package helpMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementHelper {

    private WebDriver driver;
    public ElementHelper(WebDriver driver) {
        this.driver = driver;
    }

    private void waitForVisibleLocator(By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void clickLocator(By locator){
        waitForVisibleLocator(locator);
        driver.findElement(locator).click();
    }

    public void clickJSLocator(By locator) {
        waitForVisibleLocator(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(locator));
    }

    public void fillLocator(By locator, String value) {
        waitForVisibleLocator(locator);
        driver.findElement(locator).sendKeys(value);
    }
}
