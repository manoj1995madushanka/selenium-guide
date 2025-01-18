package com.example.selenium_guide;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteJS {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(
                "webdriver.chrome.driver",
                "D:\\course\\selenium\\selenium-guide\\src\\main\\resources\\chromedriver\\chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();

        Thread.sleep(1000);
        WebElement closeButton = driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("arguments[0].click();", closeButton);
        Thread.sleep(1000);

        driver.quit();
    }
}
