package ru.qa.addressbook.tests;

import org.testng.annotations.Test;
import ru.qa.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {
    @Test
    public void testContactCreation() {
        ContactData contactData = new ContactData("London", "John", "Black");
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactAddress(contactData);
        app.getContactHelper().gotoNextPage();
        app.getContactHelper().fillContactInfo(contactData);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnMainPage();
    }
}
