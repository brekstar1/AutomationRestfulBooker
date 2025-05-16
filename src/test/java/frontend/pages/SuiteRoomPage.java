package frontend.pages;

import frontend.pageLocators.SuiteRoomLocators;
import loggerUtility.LoggerUtility;
import modelObject.frontend.BookingSuiteRoomModel;
import org.openqa.selenium.WebDriver;

public class SuiteRoomPage extends BasePage{
    public SuiteRoomPage(WebDriver driver) {
        super(driver);
    }

    public void makeReservation(BookingSuiteRoomModel testData){
        elementHelper.clickJSLocator(SuiteRoomLocators.reserveNowButtonXpath);
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

        elementHelper.clickLocator(SuiteRoomLocators.reserveNowButtonCss);
        LoggerUtility.infoLog("The user clicks on Reserve now button.");
        elementHelper.clickLocator(SuiteRoomLocators.returnHomeButtonXpath);
        LoggerUtility.infoLog("The user clicks on Return home button.");

    }
}
