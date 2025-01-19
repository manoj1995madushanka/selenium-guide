package com.example.selenium_guide.page_objects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {
    public void submitForm(WebDriver driver) {
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
}
