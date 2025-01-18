package com.example.selenium_guide;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This is show how to switch different tabs in the browser
 */
public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(
                "webdriver.chrome.driver",
                "D:\\course\\selenium\\selenium-guide\\src\\main\\resources\\chromedriver\\chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        String originalHandle = driver.getWindowHandle(); // driver get focus to original window even new tab is open

        for (String handle1 : driver.getWindowHandles()) {
            Thread.sleep(2000);
            System.out.println(handle1);
            driver.switchTo().window(handle1);
        }

        Thread.sleep(2000);
        driver.switchTo().window(originalHandle);


        driver.quit();
    }
}
