package ru.qa.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("Managers", "Managers", "Managers"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
