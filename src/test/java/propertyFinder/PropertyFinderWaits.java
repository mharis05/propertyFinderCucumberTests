package propertyFinder;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * PropertyFinderWaits.java
 * Purpose: Contains implementation of an implicit wait used throughout the suite.
 *
 * @author Haris Saleem
 */


public class PropertyFinderWaits {

    //Declared as static so that we can call the wait from anywhere in the project
    public static void waitForSeconds(WebDriver driver, int i) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
