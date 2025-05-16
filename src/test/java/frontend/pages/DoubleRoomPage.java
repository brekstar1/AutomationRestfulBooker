package frontend.pages;

import frontend.pageLocators.DoubleRoomLocators;
import frontend.pageLocators.SuiteRoomLocators;
import loggerUtility.LoggerUtility;
import modelObject.frontend.BookingDoubleRoomModel;
import org.openqa.selenium.WebDriver;

public class DoubleRoomPage extends BasePage{

    public DoubleRoomPage(WebDriver driver) {
        super(driver);
    }

    public void makeReservation(BookingDoubleRoomModel testData){
        elementHelper.clickJSLocator(DoubleRoomLocators.reserveNowButtonXpath);
        LoggerUtility.infoLog("The user clicks on Reserve now button.");
        elementHelper.fillLocator(SuiteRoomLocators.firstNameElement,testData.getFirstnameValue());
        LoggerUtility.infoLog("The user fills First Name with value: " + testData.getFirstnameValue());
        elementHelper.fillLocator(SuiteRoomLocators.lastNameElement,testData.getLastnameValue());
        LoggerUtility.infoLog("The user fills Last Name with value: " + testData.getLastnameValue());
        elementHelper.fillLocator(SuiteRoomLocators.emailElement,testData.getEmailValue());
        LoggerUtility.infoLog("The user fills Email with value: " + testData.getEmailValue());
        elementHelper.fillLocator(SuiteRoomLocators.phoneNumberElement,testData.getPhoneValue());
        LoggerUtility.infoLog("The user fills Phone number with value: " + testData.getPhoneValue());

        //need to implement selector for other days as the current day remains unavaible after the first reservation

        elementHelper.clickLocator(DoubleRoomLocators.reserveNowButtonCss);
        LoggerUtility.infoLog("The user clicks on Reserve now button.");
        elementHelper.clickLocator(DoubleRoomLocators.returnHomeButtonXpath);
        LoggerUtility.infoLog("The user clicks on Return home button.");
    }
}
