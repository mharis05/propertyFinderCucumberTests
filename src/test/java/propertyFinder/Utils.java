package propertyFinder;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Utils {

    private static FileWriter writer;
    private static Random random = new Random();

    // Write into a CSV file: We can send the file name as a parameter to this method as well.
    // I have used simple for loop, we could use a for each but since we need to process two lists
    // side by side, and the same
    public static void writeToCSV(List<String> listOfValues, List<String> listOfPrices) throws IOException {

        writer = new FileWriter("C:\\Test\\output.csv");
        writer.append("ListingName");
        writer.append(',');
        writer.append("Price");
        writer.write(System.getProperty("line.separator"));

        for (int i = 0; i < listOfValues.size(); i++) {
            writer.append(listOfValues.get(i));
            writer.append(',');
            writer.append(listOfPrices.get(i));
            writer.write(System.getProperty("line.separator"));
            writer.flush();
        }
    }

    public static void writeToTxt(Map<String, String> listOfValues, String filename) throws IOException {

        writer = new FileWriter("C:\\Test\\" + filename);
        writer.append("Values");
        writer.write(System.getProperty("line.separator"));

        for (Map.Entry<String, String> entry : listOfValues.entrySet()) {
            writer.append(entry.getKey());
            writer.append(entry.getValue());
            writer.write(System.getProperty("line.separator"));
            writer.flush();
        }

    }

    public static void captureScreenshot(WebDriver driver) {
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotFile, new File("C:\\Test\\screenshot" + random.nextInt() + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
