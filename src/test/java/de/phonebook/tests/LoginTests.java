package de.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginRegisteredUserPositiveTest(){
        app.clickOnLoginLink();
        app.fillLoginRegisterForm(new User()
                .setEmail("kristitomash080@gmail.com")
                .setPassword("Aa12345!"));
        app.clickOnLoginButton();
        Assert.assertTrue(app.isSignOutButtonPresent());

    }

    @Test
    public void loginRegisteredUserWithoutEmailNegativeTest(){
        app.clickOnLoginLink();
        app.fillLoginRegisterForm(new User()
                .setPassword("Aa12345!"));
        app.clickOnLoginButton();
        Assert.assertTrue(app.isAlertPresent());

    }

}
