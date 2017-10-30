package ru.qa.addressbook.model;

public class ContactData {
    private final String address;
    private final String firstname;
    private final String lastname;

    public ContactData(String address, String firstname, String lastname) {
        this.address = address;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getAddress() {
        return address;
    }



}
