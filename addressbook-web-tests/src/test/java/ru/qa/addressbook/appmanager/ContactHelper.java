package ru.qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.qa.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {
    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void initContactCreation() {
        click(By.linkText("Добавить контакт"));
    }

    public void fillContactAddress(ContactData contactData) {    //???
        type(By.name("address"), contactData.getAddress());
    }

    public void gotoNextPage() {
        click(By.xpath(".//*[@id='content']/form/input[1]")); //???
    }

    public void fillContactInfo(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void returnMainPage() {
        click(By.linkText("Главная"));
    }
}
