package ru.qa.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;

    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private SessionHelper sessionHelper;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }


    public void init() {

        if (browser == org.openqa.selenium.remote.BrowserType.FIREFOX) {
            wd = new FirefoxDriver();
            //System.setProperty("webdriver.gecko.driver", "c:\\Anton\\Soft\\geckodriver.exe");
        } else if (browser == org.openqa.selenium.remote.BrowserType.CHROME) {
            wd = new ChromeDriver();
        } else if (browser == org.openqa.selenium.remote.BrowserType.IE) {
            wd = new InternetExplorerDriver();
        }
        ;

        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.get("https://demos2.softaculous.com/PHP_Address_Book/");
        //  wd.get("https://www.softaculous.com/demos/PHP_Address_Book");           alternative site
        groupHelper = new GroupHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.login("admin", "pass");
    }


    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }
}
