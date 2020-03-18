package pageobjects;

import drivermanager.DynamicDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
    public DynamicDriverManager driverManager;
    private WebDriver driver;

    private int waitIntervalElement = 5;

    public Page(DynamicDriverManager driverManager) {
        this.driverManager = driverManager;
        driver = driverManager.getDriver();
        PageFactory.initElements(driver, this);
    }

    private void waitForElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, waitIntervalElement);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
