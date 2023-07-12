package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EBayTestingApp {
    public static final String SEARCHFIELD = "gh-ac";
    public static final String GDPRBANNER = "gdpr-banner-accept";

    public static final String WWW = "https://www.ebay.com";

    public static final String SEARCHKEYWORD = "laptop";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(WWW);

        WebDriverWait w = new WebDriverWait(driver, 10);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id(GDPRBANNER)));
        synchronized (driver) {
            driver.wait(1000);
        }
        driver.findElement(By.id(GDPRBANNER)).click();
        WebElement searchField = driver.findElement(By.id(SEARCHFIELD));
        searchField.sendKeys(SEARCHKEYWORD);
        searchField.submit();
    }
}