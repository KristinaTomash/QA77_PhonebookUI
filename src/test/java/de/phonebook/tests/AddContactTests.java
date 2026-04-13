package de.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase{


        @BeforeMethod
    public void precondition(){
            clickOnLoginLink();
            fillLoginRegisterForm("kristitomash080@gmail.com", "Aa12345!");
            clickOnLoginButton();
        }
@Test
    public void addContactPositiveTest(){

    clickOnAddLink();
    fillAddContactForm("Kristina", "Tomash", "1234567890",
            "Test@gm.com", "Berlin", "QA");
    clickOnSaveButton();
    //assert by name(text)
    Assert.assertTrue(verifyByName("Kristina"));

}

    @AfterMethod
    public void postConditions(){
        removeContact();


    }


}
