package com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-1 - Project Name: com-nopcommerce
 * BaseUrl =
 * https://demo.nopcommerce.com/login?returnUrl=%2F
 * 1. Setup chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */

public class LogInTestWithChromeBrowser {

    public static void main(String[] args) {

        //Base URL
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";

        //Set up the Chrome browser
        WebDriver driver = new ChromeDriver();

        //Opening the URL in the browser
        driver.get(baseUrl);

        //Maximise browser
        driver.manage().window().maximize();

        //Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Get title of page
        String title = driver.getTitle();
        System.out.println("Title of page is: " + title);

        //Get current URL
        String current = driver.getCurrentUrl();
        System.out.println("Current URL is: " + current);

        //Get page source
        String pageSource = driver.getPageSource();
        System.out.println("The page source is:" + pageSource);

        //Find email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        //Type email address in the email field
        emailField.sendKeys("mukz123@gmail.com");

        //find password field element
        WebElement passwordField = driver.findElement(By.id("Password"));
        //Type password in password field
        passwordField.sendKeys("Mogambo123");

        //Close the browser
        driver.close();


    }

}
