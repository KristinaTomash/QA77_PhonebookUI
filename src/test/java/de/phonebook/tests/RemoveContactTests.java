package de.phonebook.tests;

import de.phonebook.core.TestBase;
import de.phonebook.model.Contact;
import de.phonebook.model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTests extends TestBase {


@BeforeMethod
    public void precondition(){
    app.getUser().clickOnLoginLink();
    app.getUser().fillLoginRegisterForm(new User()
            .setEmail("kristitomash080@gmail.com")
            .setPassword("Aa12345!"));
    app.getUser().clickOnLoginButton();

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
}
@Test
    public void removeContactTest(){
    int sizeBefore = app.getContact().sizeOfContacts();
    app.getContact().removeContact();
    app.getContact().pause(1000);
    int sizeAfter = app.getContact().sizeOfContacts();
    //assert
    Assert.assertEquals(sizeAfter,sizeBefore-1);
}


}
