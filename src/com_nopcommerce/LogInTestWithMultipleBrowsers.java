package com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

/**
 * Project-1 - Project Name: com-nopcommerce
 * BaseUrl =
 * https://demo.nopcommerce.com/login?returnUrl=%2F
 * 1. Setup edge browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class LogInTestWithMultipleBrowsers {

    //Static variables
    static String browser = "Edge";
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
    static WebDriver driver;

    public static void main(String[] args) {

        //If condition for launch for selected browser
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Incorrect browser name!!");
        }
        //Open URL in browser
        driver.get(baseUrl);
        //Maximise browser window
        driver.manage().window().maximize();
        //Giving implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Get title of page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        //Get current URL
        String current = driver.getCurrentUrl();
        System.out.println("Current URL is: " + current);

        //Get page source
        String pageSource = driver.getPageSource();
        System.out.println("Page source is: " + pageSource);

        //Find email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        //Type email address in email field
        emailField.sendKeys("mukz123@gmail.com");

        //Find password field
        WebElement passwordField = driver.findElement(By.id("Password"));
        //Type password in password field
        passwordField.sendKeys("Mogambo123");

        //closing the driver
        driver.close();

    }

}


