package test_ng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NGTest {
    @Test
    public void testMethod() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "/home/appinventiv/Downloads/chromedriver-linux64/chromedriver");

        // Initialize Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("http://dev.trailchallenger.support/");

        // Perform Selenium actions (e.g., interact with web elements, assert results)
        
        Thread.sleep(5000);
    	driver.manage().window().maximize();
    	
    	// Comment
    	Thread.sleep(3000);
    	
    	// Get the WebElement corresponding to the Email Address(TextField)		
        WebElement emailField = driver.findElement(By.xpath("//input[@autocomplete=\"username\"]"));		
        emailField.sendKeys("trailchallenger@yopmail.com");
        
        Thread.sleep(3000);

        // Get the WebElement corresponding to the Password Field		
        WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname=\"password\"]"));							
        passwordField.sendKeys("12345678");
        
        Thread.sleep(2000);
        
        // Clicking on Login button to Login the panel
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='btn btn-secondary px-4']"));
        loginButton.click();

      
    }
}
