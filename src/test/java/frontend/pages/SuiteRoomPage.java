package frontend.pages;

import frontend.pageLocators.SuiteRoomLocators;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;

public class SuiteRoomPage extends BasePage{
    public SuiteRoomPage(WebDriver driver) {
        super(driver);
    }

    public void makeReservation(){
        elementHelper.clickJSLocator(SuiteRoomLocators.reserveNowButtonXpath);
        LoggerUtility.infoLog("The user clicks on Reserve now button.");
        elementHelper.fillLocator(SuiteRoomLocators.firstNameElement,"Andrei");
        LoggerUtility.infoLog("The user fills First Name with value: Andrei");
        elementHelper.fillLocator(SuiteRoomLocators.lastNameElement,"Matei");
        LoggerUtility.infoLog("The user fills Last Name with value: Matei");
        elementHelper.fillLocator(SuiteRoomLocators.emailElement,"test123@test.com");
        LoggerUtility.infoLog("The user fills Email with value: test123@test.com");
        elementHelper.fillLocator(SuiteRoomLocators.phoneNumberElement,"08493847819");
        LoggerUtility.infoLog("The user fills Email with value: 08493847819");

        //need to implement selector for other days as the current day remains unavaible after the first reservation

        elementHelper.clickLocator(SuiteRoomLocators.reserveNowButtonCss);
        LoggerUtility.infoLog("The user clicks on Reserve now button.");
        elementHelper.clickLocator(SuiteRoomLocators.returnHomeButtonXpath);
        LoggerUtility.infoLog("The user clicks on Return home button.");

    }
}
