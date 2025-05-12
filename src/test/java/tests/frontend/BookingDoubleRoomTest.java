package tests.frontend;

import frontend.pages.DoubleRoomPage;
import frontend.pages.IndexPage;
import loggerUtility.LoggerUtility;
import org.testng.annotations.Test;
import sharedData.Hooks;
import suites.AtfSuite;

public class BookingDoubleRoomTest extends Hooks {

    @Test(groups = {AtfSuite.FE_SUITE})
    public void testMethod(){

        LoggerUtility.infoLog("=== Step 1 Selecting Single Room ===");
        IndexPage indexPage = new IndexPage(driverService.getDriver());
        indexPage.clickNavBarBooking();
        indexPage.clickDoubleBookNowButton();
        DoubleRoomPage doubleRoomPage = new DoubleRoomPage(driverService.getDriver());
        doubleRoomPage.makeReservation();
    }
}
