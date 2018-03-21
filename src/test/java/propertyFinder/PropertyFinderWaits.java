package propertyFinder;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PropertyFinderWaits {

    //Declared as static so that we can call the wait from anywhere in the project
    public static void waitForSeconds(WebDriver driver, int i) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
