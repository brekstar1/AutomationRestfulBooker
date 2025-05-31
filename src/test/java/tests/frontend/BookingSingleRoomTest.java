package tests.frontend;

import frontend.pages.IndexPage;
import frontend.pages.SingleRoomPage;
import loggerUtility.LoggerUtility;
import modelObject.frontend.BookingSingleRoomModel;
import org.testng.annotations.Test;
import sharedData.Hooks;
import suites.AtfSuite;

public class BookingSingleRoomTest extends Hooks {

    @Test(groups = {AtfSuite.FE_SUITE})
    public void testMethod(){

        LoggerUtility.infoLog("=== Step 1 Selecting Single Room ===");
        BookingSingleRoomModel bookingSingleRoomModel = new BookingSingleRoomModel("src/test/resources/testData/BookingSingleData.json");
        IndexPage indexPage = new IndexPage(driverService.getDriver());
        indexPage.clickNavBarBooking();
        indexPage.clickSingleBookNowButton();
        SingleRoomPage singleRoomPage = new SingleRoomPage(driverService.getDriver());
        singleRoomPage.makeReservation(bookingSingleRoomModel);

        //implement check date if "unavailable", if not click&hold select date range(3 days)
        //if "unavailable" click next (month) and retry

        //implement allure report with auto-delete old report
        //implement git actions
    }
}
