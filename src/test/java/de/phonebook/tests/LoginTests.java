package de.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginRegisteredUserPositiveTest(){
        clickOnLoginLink();
        fillLoginRegisterForm(new User()
                .setEmail("kristitomash080@gmail.com")
                .setPassword("Aa12345!"));
        clickOnLoginButton();
        Assert.assertTrue(isSignOutButtonPresent());

    }

    @Test
    public void loginRegisteredUserWithoutEmailNegativeTest(){
        clickOnLoginLink();
        fillLoginRegisterForm(new User()
                .setPassword("Aa12345!"));
        clickOnLoginButton();
        Assert.assertTrue(isAlertPresent());

    }

}
