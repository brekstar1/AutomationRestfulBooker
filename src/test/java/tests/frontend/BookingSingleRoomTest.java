package tests.frontend;

import frontend.pages.IndexPage;
import frontend.pages.SingleRoomPage;
import loggerUtility.LoggerUtility;
import org.testng.annotations.Test;
import sharedData.Hooks;
import suites.AtfSuite;

public class BookingSingleRoomTest extends Hooks {

    @Test(groups = {AtfSuite.FE_SUITE})
    public void testMethod(){

        LoggerUtility.infoLog("=== Step 1 Selecting Single Room ===");
        IndexPage indexPage = new IndexPage(driverService.getDriver());
        indexPage.clickNavBarBooking();
        indexPage.clickSingleBookNowButton();
        SingleRoomPage singleRoomPage = new SingleRoomPage(driverService.getDriver());
        singleRoomPage.makeReservation();

        //move test data in Json file and implement auto pull from it

        //implement check date if "unavailable", if not click&hold select date range(3 days)
        //if "unavailable" click next (month) and retry

        //implement allure report with auto-delete old report
        //implement git actions

        //implement 1 more backend test
        //try to make an IndexPage check for img / no of elements

        //try and make an "uncompleted" test to take in consideration site server error

    }
}
