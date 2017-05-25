package cafeto.amazontest;

import org.junit.Test;
import static org.junit.Assert.*;

public class AWSLoginTests {

    //@Test
    public void goToLoginForm() {
        POAmazonMain mainPage =  new POAmazonMain();
        mainPage.goToAmazonMain();
        mainPage.goToAmazonWSLogin();
        //assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test
    public void loginAsValidUserWithUserName() {
        POAmazonMain mainPage =  new POAmazonMain();
        mainPage.goToAmazonMain();
        mainPage.goToAmazonWSLogin();
        mainPage.selectOldUser();
        mainPage.typeUsername("juanpablogarcia78@hotmail.com");
        mainPage.typePassword("testcafeto123");
        mainPage.clickLoginButton();
        //assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    //@Test
    public void loginAsInvalidUser() {
        POAmazonMain mainPage =  new POAmazonMain();
        mainPage.goToAmazonMain();
        mainPage.goToAmazonWSLogin();
        mainPage.selectOldUser();
        mainPage.typeUsername("correofalso@dominio.com");
        mainPage.typePassword("testcafeto123");
        mainPage.clickLoginButton();
        //assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    //@Test
    public void loginAsNewUser() {
        POAmazonMain mainPage =  new POAmazonMain();
        mainPage.goToAmazonMain();
        mainPage.goToAmazonWSLogin();
        mainPage.selectNewUser();
        mainPage.typeUsername("correofalso@dominio.com");
        mainPage.clickLoginButton();
        //assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}
