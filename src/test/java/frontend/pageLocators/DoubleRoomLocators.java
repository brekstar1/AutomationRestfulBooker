package frontend.pageLocators;

import org.openqa.selenium.By;

public class DoubleRoomLocators {
    public static final By reserveNowButtonXpath = By.xpath("//button[text()='Reserve Now']");
    public static final By reserveNowButtonCss = By.cssSelector("button.btn.btn-primary");
    public static final By firstNameElement = By.xpath("//input[@placeholder='Firstname']");
    public static final By lastNameElement = By.xpath("//input[@placeholder='Lastname']");
    public static final By emailElement = By.xpath("//input[@placeholder='Email']");
    public static final By phoneNumberElement = By.xpath("//input[@placeholder='Phone']");
    public static final By returnHomeButtonXpath = By.xpath("//a[text()='Return home']");
}
