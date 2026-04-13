package de.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTests extends TestBase{

    //before - login,add contact
@BeforeMethod
    public void precondition(){
    click(By.cssSelector("[href='/login']"));
    type(By.name("email"), "kristitomash080@gmail.com");
    type(By.name("password"), "Aa12345!");
    click(By.name("login"));

    click(By.cssSelector("[href='/add']"));
    type(By.xpath("//input[1]"),"Kristina");
    type(By.xpath("//input[2]"),"Tomash");
    type(By.xpath("//input[3]"),"1234567890");
    type(By.xpath("//input[4]"),"Test@gm.com");
    type(By.xpath("//input[5]"),"Berlin");
    type(By.xpath("//input[6]"),"QA");
    click(By.cssSelector(".add_form__2rsm2 button"));
}
@Test
    public void removeContactTest(){
    int sizeBefore = sizeOfContacts();
    //click on card
    click(By.cssSelector(".contact-item_card__2SOIM"));
    //click on Remove button
    click(By.xpath("//button[.='Remove']"));
    int sizeAfter = sizeOfContacts();
    //assert
    Assert.assertEquals(sizeAfter,sizeBefore-1);
}
    public int sizeOfContacts() {
        if (isElementPresent(By.cssSelector(".contact-item_card__2SOIM"))){
            driver.findElements(By.cssSelector(".contact-item_card__2SOIM")).size();
        }
    return 0;

    }


}
