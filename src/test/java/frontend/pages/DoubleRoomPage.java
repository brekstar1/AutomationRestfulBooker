package frontend.pages;

import frontend.pageLocators.DoubleRoomLocators;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;

public class DoubleRoomPage extends BasePage{

    public DoubleRoomPage(WebDriver driver) {
        super(driver);
    }

    public void makeReservation(){
        elementHelper.clickJSLocator(DoubleRoomLocators.reserveNowButtonXpath);
        LoggerUtility.infoLog("The user clicks on Reserve now button.");
        elementHelper.fillLocator(DoubleRoomLocators.firstNameElement,"Andrei");
        LoggerUtility.infoLog("The user fills First Name with value: Andrei");
        elementHelper.fillLocator(DoubleRoomLocators.lastNameElement,"Matei");
        LoggerUtility.infoLog("The user fills Last Name with value: Matei");
        elementHelper.fillLocator(DoubleRoomLocators.emailElement,"test123@test.com");
        LoggerUtility.infoLog("The user fills Email with value: test123@test.com");
        elementHelper.fillLocator(DoubleRoomLocators.phoneNumberElement,"08493847819");
        LoggerUtility.infoLog("The user fills Email with value: 08493847819");

        //need to implement selector for other days as the current day remains unavaible after the first reservation

        elementHelper.clickLocator(DoubleRoomLocators.reserveNowButtonCss);
        LoggerUtility.infoLog("The user clicks on Reserve now button.");
        elementHelper.clickLocator(DoubleRoomLocators.returnHomeButtonXpath);
        LoggerUtility.infoLog("The user clicks on Return home button.");
    }
}
