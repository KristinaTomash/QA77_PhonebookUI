package de.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase{


        @BeforeMethod
    public void precondition(){
            clickOnLoginLink();
            fillLoginRegisterForm(new User()
                    .setEmail("kristitomash080@gmail.com")
                    .setPassword("Aa12345!"));
            clickOnLoginButton();
        }
@Test
    public void addContactPositiveTest(){

    clickOnAddLink();
    fillAddContactForm(
            new Contact()
                    .setName("Kristina")
                    .setLastName("Tomash")
                    .setPhone("1234567890")
                    .setEmail("Test@gm.com")
                    .setAddress("Berlin")
                    .setDescription("QA"));
    clickOnSaveButton();
    //assert by name(text)
    Assert.assertTrue(verifyByName("Kristina"));

}

    @AfterMethod
    public void postConditions(){
        removeContact();


    }


}
