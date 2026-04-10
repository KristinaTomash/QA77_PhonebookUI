package de.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginRegisteredUserPositiveTest(){
        //click on Login link
        click(By.cssSelector("[href='/login']"));
        //enter email
        //focus
        type(By.name("email"), "kristitomash080@gmail.com");
        //enter password
        //focus
        type(By.name("password"), "Aa12345!");
        //click on Login button
        click(By.name("login"));
        //assert SignOut is present
        Assert.assertTrue(isElementPresent(By.xpath("//*[.='Sign Out']")));

    }
}
