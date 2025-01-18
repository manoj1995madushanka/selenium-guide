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