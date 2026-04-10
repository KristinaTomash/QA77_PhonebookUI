package de.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase{
        //before -log in
        @BeforeMethod
    public void precondition(){
            click(By.cssSelector("[href='/login']"));
            type(By.name("email"), "kristitomash080@gmail.com");
            type(By.name("password"), "Aa12345!");
            click(By.name("login"));
}
@Test
    public void addContactPositiveTest(){
    //click on Add link
    click(By.cssSelector("[href='/add']"));
    //enter name
    type(By.xpath("//input[1]"),"Kristina");
    //enter Lastname
    type(By.xpath("//input[2]"),"Tomash");
    //enter phone
    type(By.xpath("//input[3]"),"1234567890");
    //enter email
    type(By.xpath("//input[4]"),"Test@gm.com");
    //enter address
    type(By.xpath("//input[5]"),"Berlin");
    //enter description
    type(By.xpath("//input[6]"),"QA");
    //save button
    click(By.cssSelector(".add_form__2rsm2 button"));
}


    //assert by name(text)


}
