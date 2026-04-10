package de.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{
    @Test(enabled = false)
    public void newUserRegisterPositiveTest(){
            //generate email
//        int i = (int) ((System.currentTimeMillis()/1000)%3600);
//        type(By.name("email"), "kristitomash080"+ i+"@gmail.com");

        //click on Login link
        click(By.cssSelector("[href='/login']"));
        //enter email
        //focus
        type(By.name("email"), "kristitomash080@gmail.com");
        //enter password
        //focus
        type(By.name("password"), "Aa12345!");
        //click on Register button
        click(By.name("registration"));
        //assert SignOut is present
        Assert.assertTrue(isElementPresent(By.xpath("//*[.='Sign Out']")));
    }
    @Test
    public void existedUserRegisterNegativeTest(){
        //click on Login link
        click(By.cssSelector("[href='/login']"));
        //enter email
        //focus
        type(By.name("email"), "kristitomash080@gmail.com");
        //enter password
        //focus
        type(By.name("password"), "Aa12345!");
        //click on Register button
        click(By.name("registration"));
        //assert SignOut is present
        Assert.assertTrue(isAlertPresent());

    }
}
