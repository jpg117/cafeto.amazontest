package cafeto.amazontest;

import org.junit.Test;
import static org.junit.Assert.*;

public class AWSLoginTests {

    @Test
    public void loginAsAValidUser() {
        POAmazonMain mainPage =  new POAmazonMain();
        mainPage.goToAmazonMain();
        mainPage.goToAmazonWSLogin();
        //assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}
