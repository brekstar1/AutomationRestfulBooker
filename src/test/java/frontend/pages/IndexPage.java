package frontend.pages;

import frontend.pageLocators.IndexLocators;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;

public class IndexPage extends BasePage{

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    public void clickNavBarBooking(){
        elementHelper.clickLocator(IndexLocators.bookNowNavElement);
        LoggerUtility.infoLog("The user clicks on Navigation Bar Booking button.");
    }

    public void clickSingleBookNowButton(){
        elementHelper.clickJSLocator(IndexLocators.bookRoomOneElement);
        LoggerUtility.infoLog("The user click on Book now button.");
    }
}
