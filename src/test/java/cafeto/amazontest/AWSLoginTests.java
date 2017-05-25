package cafeto.amazontest;

import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class AWSLoginTests {

    @Test
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

    @Ignore
    public void loginAsValidUserWithPhoneNumber() {
        POAmazonMain mainPage =  new POAmazonMain();
        mainPage.goToAmazonMain();
        mainPage.goToAmazonWSLogin();
        mainPage.selectOldUser();
        mainPage.typeUsername("3147679806");
        mainPage.typePassword("testcafeto123");
        mainPage.clickLoginButton();
        //assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test
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

    @Test
    public void loginAsNewUser() {
        POAmazonMain mainPage =  new POAmazonMain();
        mainPage.goToAmazonMain();
        mainPage.goToAmazonWSLogin();
        mainPage.selectNewUser();
        mainPage.typeUsername("correofalso@dominio.com");
        mainPage.clickLoginButton();
        //assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @After
    public void teardown() {
        WebDriverManager.quitDriver();
    }
}
