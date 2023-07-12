package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FacebookTestingApp {

    public static final String WWW = "https://www.facebook.com";
    public static final String COOKIES = "//button[contains(@data-testid,\"cookie-policy-manage-dialog-accept-button\")]";
    public static final String REGISTER = "//a[contains(@data-testid,\"open-registration-form-button\")]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(WWW);
        while(!driver.findElement(By.xpath(COOKIES)).isDisplayed());
        driver.findElement(By.xpath(COOKIES)).click();
        while(!driver.findElement(By.xpath(REGISTER)).isDisplayed());
        driver.findElement(By.xpath(REGISTER)).click();
        while(!driver.findElement(By.name("firstname")).isDisplayed());
        driver.findElement(By.name("firstname")).sendKeys("Test firstname");
        driver.findElement(By.name("lastname")).sendKeys("Test firstname");
        driver.findElement(By.name("reg_email__")).sendKeys("test@test.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("password");
        Select selectMonth = new Select(driver.findElement(By.name("birthday_month")));
        selectMonth.selectByIndex(0);
        Select selectDay = new Select(driver.findElement(By.name("birthday_day")));
        selectDay.selectByIndex(0);
        Select selectYear = new Select(driver.findElement(By.name("birthday_year")));
        selectYear.selectByValue("2000");
        driver.findElements(By.name("sex")).get(1).click();
        while(!driver.findElement(By.name("reg_email_confirmation__")).isDisplayed());
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("test@test.com");
        //driver.findElement(By.name("websubmit")).click();
    }
}
