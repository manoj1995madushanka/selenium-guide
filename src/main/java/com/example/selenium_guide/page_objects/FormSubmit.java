package com.example.selenium_guide.page_objects;

import com.example.selenium_guide.page_objects.pages.ConfirmationPage;
import com.example.selenium_guide.page_objects.pages.FormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormSubmit {
    public static void main(String[] args) {
        System.setProperty(
                "webdriver.chrome.driver",
                "D:\\course\\selenium\\selenium-guide\\src\\main\\resources\\chromedriver\\chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        formPage.submitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitForAlertBanner(driver);

        // Assert result
        assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));

        driver.quit();
    }
}
