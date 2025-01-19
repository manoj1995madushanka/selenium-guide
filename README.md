# Selenium Guide

## Examples Provided to Automate the [Formy Project](https://formy-project.herokuapp.com/) Site

### Switching Between Windows Using Selenium

```java
// Switch to a specific window by its name
Driver.switchTo().window("windowName");

// Switch to a specific frame by its name
Driver.switchTo().frame("frameName");

// Switch to an alert dialog
Driver.switchTo().alert();
```

## Add implicit wait
```java
driver.manage().timeouts().implicitlyWait(Timeout,TimeUnit.SECONDS);
```

## Explicit waits
#### Wait for a specific amount of time for a certain condition to be true

```java
WebDriverWait wait = new WebDriverWait(driver,10)
WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("element")))
```

