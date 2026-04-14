package de.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase{


        @BeforeMethod
    public void precondition(){
            app.clickOnLoginLink();
            app.fillLoginRegisterForm(new User()
                    .setEmail("kristitomash080@gmail.com")
                    .setPassword("Aa12345!"));
            app.clickOnLoginButton();
        }
@Test
    public void addContactPositiveTest(){

    app.clickOnAddLink();
    app.fillAddContactForm(
            new Contact()
                    .setName("Kristina")
                    .setLastName("Tomash")
                    .setPhone("1234567890")
                    .setEmail("Test@gm.com")
                    .setAddress("Berlin")
                    .setDescription("QA"));
    app.clickOnSaveButton();
    //assert by name(text)
    Assert.assertTrue(app.verifyByName("Kristina"));

}

    @AfterMethod
    public void postConditions(){
        app.removeContact();


    }


}
