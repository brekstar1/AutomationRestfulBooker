package frontend.pageLocators;

import org.openqa.selenium.By;

public class IndexLocators {
    public static final By homeMenuElement = By.xpath("//span[text()='Shady Meadows B&B']");
    public static final By bookNowBannerElement = By.cssSelector(".btn.btn-primary.btn-lg");
    public static final By bookNowNavElement = By.cssSelector(".nav-item:nth-child(2) > a.nav-link");
    public static final By bookRoomOneElement = By.xpath("//div[text()='100']/../a[contains(@class, 'btn')]");
    public static final By bookRoomTwoElement = By.xpath("//div[text()='150']/../a[contains(@class, 'btn')]");
    public static final By bookRoomThreeElement = By.xpath("//div[text()='225']/../a[contains(@class, 'btn')]");
}
