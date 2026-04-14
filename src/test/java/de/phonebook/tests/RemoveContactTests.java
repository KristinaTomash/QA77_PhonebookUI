package de.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTests extends TestBase{


@BeforeMethod
    public void precondition(){
    app.clickOnLoginLink();
    app.fillLoginRegisterForm(new User()
            .setEmail("kristitomash080@gmail.com")
            .setPassword("Aa12345!"));
    app.clickOnLoginButton();

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
}
@Test
    public void removeContactTest(){
    int sizeBefore = app.sizeOfContacts();
    app.removeContact();
    app.pause(1000);
    int sizeAfter = app.sizeOfContacts();
    //assert
    Assert.assertEquals(sizeAfter,sizeBefore-1);
}


}
