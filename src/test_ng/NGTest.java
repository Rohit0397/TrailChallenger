package test_ng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NGTest {
    @Test
    public void testMethod() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "/home/appinventiv/Downloads/chromedriver-linux64/chromedriver");

        // Initialize Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com");

        // Perform Selenium actions (e.g., interact with web elements, assert results)
        
        Thread.sleep(6000);
    	driver.manage().window().maximize();

      
    }
}
