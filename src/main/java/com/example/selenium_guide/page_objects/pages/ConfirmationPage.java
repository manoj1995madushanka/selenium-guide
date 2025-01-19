package com.example.selenium_guide.page_objects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConfirmationPage {
    public void waitForAlertBanner(WebDriver driver) {
        // Confirm form is submitted successfully
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
    }

    public String getAlertBannerText(WebDriver driver) {
        return driver.findElement(By.className("alert")).getText();
    }
}
