package cafeto.amazontest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by jgarcia on 5/23/2017.
 */


public class WebDriverManager {
    private static WebDriver driver;

    private WebDriverManager() {
    }

    public static WebDriver getDriver() {

        if (driver != null)
            return driver;

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver(chromeOptions);
        return driver;
    }

    public static void quitDriver() {

        if (driver == null)
            return;

        driver.quit();
        driver = null;
    }
}
