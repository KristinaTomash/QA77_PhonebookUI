package de.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTests extends TestBase{


@BeforeMethod
    public void precondition(){
    clickOnLoginLink();
    fillLoginRegisterForm(new User()
            .setEmail("kristitomash080@gmail.com")
            .setPassword("Aa12345!"));
    clickOnLoginButton();

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
}
@Test
    public void removeContactTest(){
    int sizeBefore = sizeOfContacts();
    removeContact();
    pause(1000);
    int sizeAfter = sizeOfContacts();
    //assert
    Assert.assertEquals(sizeAfter,sizeBefore-1);
}


}
