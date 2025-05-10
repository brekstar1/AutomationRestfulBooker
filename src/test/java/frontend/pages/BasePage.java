package frontend.pages;

import helpMethods.ElementHelper;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    protected ElementHelper elementHelper;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }
}
