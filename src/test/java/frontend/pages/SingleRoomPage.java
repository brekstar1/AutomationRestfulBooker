package frontend.pages;

import frontend.pageLocators.SingleRoomLocators;
import frontend.pageLocators.SuiteRoomLocators;
import loggerUtility.LoggerUtility;
import modelObject.frontend.BookingSingleRoomModel;
import org.openqa.selenium.WebDriver;

public class SingleRoomPage extends BasePage{

    public SingleRoomPage(WebDriver driver) {
        super(driver);
    }

    public void makeReservation(BookingSingleRoomModel testData){
        elementHelper.clickJSLocator(SingleRoomLocators.reserveNowButtonXpath);
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

        elementHelper.clickLocator(SingleRoomLocators.reserveNowButtonCss);
        LoggerUtility.infoLog("The user clicks on Reserve now button.");
        elementHelper.clickLocator(SingleRoomLocators.returnHomeButtonXpath);
        LoggerUtility.infoLog("The user clicks on Return home button.");

    }
}
