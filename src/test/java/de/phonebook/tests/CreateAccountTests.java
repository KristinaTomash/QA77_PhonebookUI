package de.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test(enabled = false)
    public void newUserRegisterPositiveTest(){

        clickOnLoginLink();
        fillLoginRegisterForm(new User()
                .setEmail("kristitomash080@gmail.com")
                .setPassword("Aa12345!"));
        clickOnRegistrationButton();
        Assert.assertTrue(isSignOutButtonPresent());
    }

    @Test
    public void existedUserRegisterNegativeTest(){
        clickOnLoginLink();
        fillLoginRegisterForm(new User()
                .setEmail("kristitomash080@gmail.com")
                .setPassword("Aa12345!"));
        clickOnRegistrationButton();
        Assert.assertTrue(isAlertPresent());

    }
}


//generate email
//        int i = (int) ((System.currentTimeMillis()/1000)%3600);
//        type(By.name("email"), "kristitomash080"+ i+"@gmail.com");
