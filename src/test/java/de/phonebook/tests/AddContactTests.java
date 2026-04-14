package de.phonebook.tests;

import de.phonebook.core.TestBase;
import de.phonebook.model.Contact;
import de.phonebook.model.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase {


        @BeforeMethod
    public void precondition(){
            app.getUser().clickOnLoginLink();
            app.getUser().fillLoginRegisterForm(new User()
                    .setEmail("kristitomash080@gmail.com")
                    .setPassword("Aa12345!"));
            app.getUser().clickOnLoginButton();
        }
@Test
    public void addContactPositiveTest(){

    app.getContact().clickOnAddLink();
    app.getContact().fillAddContactForm(
            new Contact()
                    .setName("Kristina")
                    .setLastName("Tomash")
                    .setPhone("1234567890")
                    .setEmail("Test@gm.com")
                    .setAddress("Berlin")
                    .setDescription("QA"));
    app.getContact().clickOnSaveButton();
    //assert by name(text)
    Assert.assertTrue(app.getContact().verifyByName("Kristina"));

}

    @AfterMethod
    public void postConditions(){
        app.getContact().removeContact();


    }


}
