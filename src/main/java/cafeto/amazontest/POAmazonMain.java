package cafeto.amazontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by jgarcia on 5/23/2017.
 */
public class POAmazonMain {

    WebDriver driver;

    //Page elements
    WebElement myAccountDropDown;
    WebElement accountSettOpt;

    //Locator
    By myAccountDropDownLoc = By.xpath("//*[@id=\"aws-nav-header-right\"]/div[2]/span");
    By accountSettOptLoc = By.xpath("//*[@id=\"aws-nav-dropdown-account\"]/ul/li[3]/a");

    WebDriverWait wait;

    public POAmazonMain() {
        driver = WebDriverManager.getDriver();
        wait = new WebDriverWait(driver,2);
    }

    public void goToAmazonMain(){
        driver.get("https://aws.amazon.com/");
        wait.until(ExpectedConditions.elementToBeClickable(myAccountDropDownLoc));
    }

    public void goToAmazonWSLogin(){

        myAccountDropDown = driver.findElement(myAccountDropDownLoc);
        Actions builder = new Actions(driver);
        builder.moveToElement(myAccountDropDown).perform();

        wait.until(ExpectedConditions.elementToBeClickable(accountSettOptLoc));
        accountSettOpt = driver.findElement(accountSettOptLoc);
        accountSettOpt.click();
    }
}
