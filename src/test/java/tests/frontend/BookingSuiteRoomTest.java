package tests.frontend;

import frontend.pages.IndexPage;
import frontend.pages.SuiteRoomPage;
import loggerUtility.LoggerUtility;
import org.testng.annotations.Test;
import sharedData.Hooks;
import suites.AtfSuite;

public class BookingSuiteRoomTest extends Hooks {

    @Test(groups = {AtfSuite.FE_SUITE})
    public void testMethod() {

        LoggerUtility.infoLog("=== Step 1 Selecting Single Room ===");
        IndexPage indexPage = new IndexPage(driverService.getDriver());
        indexPage.clickNavBarBooking();
        indexPage.clickSuiteBookNowButton();
        SuiteRoomPage suiteRoomPage = new SuiteRoomPage(driverService.getDriver());
        suiteRoomPage.makeReservation();
    }
}
