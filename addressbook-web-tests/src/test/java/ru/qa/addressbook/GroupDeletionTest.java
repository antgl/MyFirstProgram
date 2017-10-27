package ru.qa.addressbook;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {

    @Test
    public void GroupDeletionTest() {
        gotoGroupPage();
        selectGroup();
        deleteSelectedGroups();
        returnToGroupPage();
    }

}
