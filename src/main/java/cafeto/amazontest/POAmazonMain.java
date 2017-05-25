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
    WebElement usernameTextBox;
    WebElement passwordTextBox;
    WebElement oldUserRadioButton;
    WebElement newUserRadioButton;
    WebElement loginButton;

    //Locator
    By myAccountDropDownLoc = By.xpath("//*[@id=\"aws-nav-header-right\"]/div[2]/span");
    By accountSettOptLoc = By.xpath("//*[@id=\"aws-nav-dropdown-account\"]/ul/li[3]/a");
    By usernameTextBoxLoc = By.xpath("//*[@id=\"ap_email\"]");
    By passwordTextBoxLoc = By.xpath("//*[@id=\"ap_password\"]");
    By oldUserRadioButtonLoc = By.xpath("//*[@id=\"ap_signin_existing_radio\"]");
    By newUserRadioButtonLoc = By.xpath("//*[@id=\"ap_signin_create_radio\"]");
    By loginButtonLoc = By.xpath("//*[@id=\"signInSubmit-input\"]");

    WebDriverWait wait;

    public POAmazonMain() {
        driver = WebDriverManager.getDriver();
        wait = new WebDriverWait(driver,10);
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

    public void typeUsername(String username){
        wait.until(ExpectedConditions.elementToBeClickable(usernameTextBoxLoc));
        usernameTextBox = driver.findElement(usernameTextBoxLoc);
        usernameTextBox.sendKeys(username);
    }

    public void typePassword(String password){
        wait.until(ExpectedConditions.elementToBeClickable(passwordTextBoxLoc));
        passwordTextBox = driver.findElement(passwordTextBoxLoc);
        passwordTextBox.sendKeys(password);
    }

    public void selectOldUser(){
        wait.until(ExpectedConditions.elementToBeClickable(oldUserRadioButtonLoc));
        oldUserRadioButton = driver.findElement(oldUserRadioButtonLoc);
        oldUserRadioButton.click();
    }

    public void selectNewUser(){
        wait.until(ExpectedConditions.elementToBeClickable(newUserRadioButtonLoc));
        newUserRadioButton = driver.findElement(newUserRadioButtonLoc);
        newUserRadioButton.click();
    }

    public void clickLoginButton(){
        wait.until(ExpectedConditions.elementToBeClickable(loginButtonLoc));
        loginButton = driver.findElement(loginButtonLoc);
        loginButton.click();
    }
}
