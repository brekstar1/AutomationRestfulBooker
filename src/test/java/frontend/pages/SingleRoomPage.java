package frontend.pages;

import frontend.pageLocators.SingleRoomLocators;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;

public class SingleRoomPage extends BasePage{

    public SingleRoomPage(WebDriver driver) {
        super(driver);
    }

    public void makeReservation(){
        elementHelper.clickJSLocator(SingleRoomLocators.reserveNowButtonXpath);
        LoggerUtility.infoLog("The user clicks on Reserve now button.");
        elementHelper.fillLocator(SingleRoomLocators.firstNameElement,"Andrei");
        LoggerUtility.infoLog("The user fills First Name with value: Andrei");
        elementHelper.fillLocator(SingleRoomLocators.lastNameElement,"Matei");
        LoggerUtility.infoLog("The user fills Last Name with value: Matei");
        elementHelper.fillLocator(SingleRoomLocators.emailElement,"test123@test.com");
        LoggerUtility.infoLog("The user fills Email with value: test123@test.com");
        elementHelper.fillLocator(SingleRoomLocators.phoneNumberElement,"08493847819");
        LoggerUtility.infoLog("The user fills Email with value: 08493847819");

        //need to implement selector for other days as the current day remains unavaible after the first reservation

        elementHelper.clickLocator(SingleRoomLocators.reserveNowButtonCss);
        LoggerUtility.infoLog("The user clicks on Reserve now button.");
        elementHelper.clickLocator(SingleRoomLocators.returnHomeButtonXpath);
        LoggerUtility.infoLog("The user clicks on Return home button.");

    }
}
