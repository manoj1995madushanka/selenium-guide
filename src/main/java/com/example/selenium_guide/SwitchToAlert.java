package com.example.selenium_guide;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) {
        System.setProperty(
                        "webdriver.chrome.driver",
                        "D:\\course\\selenium\\selenium-guide\\src\\main\\resources\\chromedriver\\chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.quit();

    }
}
