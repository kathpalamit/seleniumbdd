package com.mindtube.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSel {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/amkumar/dev/code/Amit-code/selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
        driver.findElement(By.id("MainContent_txtUserName")).sendKeys("test@test.com");
        driver.findElement(By.id("MainContent_txtPassword")).sendKeys("test");
        driver.findElement(By.id("MainContent_btnLogin")).click();

        String msg = driver.findElement(By.id("conf_message")).getText();
        System.out.println(msg);
        
    }
}
