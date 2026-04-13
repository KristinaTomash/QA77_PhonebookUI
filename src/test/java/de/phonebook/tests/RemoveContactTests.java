package de.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTests extends TestBase{

    //before - login,add contact
@BeforeMethod
    public void precondition(){
    clickOnLoginLink();
    fillLoginRegisterForm("kristitomash080@gmail.com", "Aa12345!");
    clickOnLoginButton();

    clickOnAddLink();
    fillAddContactForm("Kristina", "Tomash", "1234567890", "Test@gm.com", "Berlin", "QA");
    clickOnSaveButton();
}
@Test
    public void removeContactTest(){
    int sizeBefore = sizeOfContacts();
    //click on card
    removeContact();
    pause(1000);
    int sizeAfter = sizeOfContacts();
    //assert
    Assert.assertEquals(sizeAfter,sizeBefore-1);
}

public void  pause(int millis){
    try {
        Thread.sleep(millis);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}

    public int sizeOfContacts() {
        if (isElementPresent(By.cssSelector(".contact-item_card__2SOIM"))){
            return driver.findElements(By.cssSelector(".contact-item_card__2SOIM")).size();
        }
    return 0;

    }


}
