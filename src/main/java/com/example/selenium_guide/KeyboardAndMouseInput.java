package com.example.selenium_guide;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Demonstrate how to add input to the text field and click submit button
 */
public class KeyboardAndMouseInput {

    public static void main(String[] args) {
        System.setProperty(
                "webdriver.chrome.driver",
                "D:\\course\\selenium\\selenium-guide\\src\\main\\resources\\chromedriver\\chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement name = driver.findElement(By.id("name"));
        name.click(); // activate name field to enter text
        name.sendKeys("Manoj");

        WebElement button = driver.findElement(By.id("button"));
        button.click();

        driver.quit();
    }
}
