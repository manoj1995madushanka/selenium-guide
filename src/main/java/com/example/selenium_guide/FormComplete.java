package com.example.selenium_guide;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormComplete {
    public static void main(String[] args) {
        System.setProperty(
                "webdriver.chrome.driver",
                "D:\\course\\selenium\\selenium-guide\\src\\main\\resources\\chromedriver\\chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        submitForm(driver);

        waitForAlertBanner(driver);

        // Assert result
        assertEquals("The form was successfully submitted!", getAlertBannerText(driver));

        driver.quit();
    }

    private static void submitForm(WebDriver driver) {
        // Text inputs
        driver.findElement(By.id("first-name")).sendKeys("Manoj");
        driver.findElement(By.id("last-name")).sendKeys("Madushanka");
        driver.findElement(By.id("job-title")).sendKeys("SSE");

        // Radio button
        driver.findElement(By.id("radio-button-2")).click();

        // Check box
        driver.findElement(By.id("checkbox-2")).click();

        // Dropdown
        driver.findElement(By.cssSelector("option[value='1']")).click();

        // Date picker
        driver.findElement(By.id("datepicker")).sendKeys("05/28/2025");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        // Click submit
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }

    private static void waitForAlertBanner(WebDriver driver) {
        // Confirm form is submitted successfully
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
    }

    private static String getAlertBannerText(WebDriver driver) {
        return driver.findElement(By.className("alert")).getText();
    }
}
