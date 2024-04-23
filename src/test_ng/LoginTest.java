package test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/home/appinventiv/Downloads/chromedriver-linux64/chromedriver");

        // Initialize ChromeDriver
        driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();
    }
    
    @Test(priority =1)
    public void unsuccessfulLoginTest() throws InterruptedException {
        // Navigate to the login page
        driver.get("http://dev.trailchallenger.support/login");
     // Add a delay of 5 seconds after opening the URL
        Thread.sleep(5000);

        // Find username and password input fields
        WebElement usernameInput = driver.findElement(By.xpath("//input[@autocomplete='username']"));
        WebElement passwordInput = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='btn btn-secondary px-4']"));

        // Enter incorrect username and password
        usernameInput.sendKeys("trailchallenger12@yopmail.com");
     // Add a delay of 2 seconds after opening the URL
        Thread.sleep(2000);
        passwordInput.sendKeys("12345678");
     // Add a delay of 2 seconds after opening the URL
        Thread.sleep(2000);

        // Click on the login button
        loginButton.click();
     // Add a delay of 3 seconds after opening the URL
        Thread.sleep(3000);

        // Verify that login is unsuccessful by checking for an error message
        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='ng-tns-c37-2 ng-star-inserted ng-trigger ng-trigger-flyInOut ngx-toastr toast-error']"));
        Assert.assertTrue(errorMessage.isDisplayed(), "Login unsuccessful");
    }
    
    @Test(priority = 2)
    public void successfulLoginTest() throws InterruptedException {
        // Navigate to the login page
        driver.get("http://dev.trailchallenger.support/login");
     // Add a delay of 5 seconds after opening the URL
        Thread.sleep(5000);


        // Find username and password input fields
        WebElement usernameInput = driver.findElement(By.xpath("//input[@autocomplete='username']"));
        WebElement passwordInput = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='btn btn-secondary px-4']"));

        // Enter username and password
        usernameInput.sendKeys("trailchallenger@yopmail.com");
     // Add a delay of 2 seconds after opening the URL
        Thread.sleep(2000);
        passwordInput.sendKeys("12345678");
     // Add a delay of 2 seconds after opening the URL
        Thread.sleep(2000);

        // Click on the login button
        loginButton.click();
     // Add a delay of 3 seconds after opening the URL
        Thread.sleep(3000);


        // Verify that login is successful by checking for a welcome message or Dashboard element
        WebElement welcomeMessage = driver.findElement(By.id("welcome-message"));
        Assert.assertTrue(welcomeMessage.isDisplayed(), "Login successful");
    }


    @AfterClass
    public void tearDown() {
        // Close the browser window
        driver.quit();
    }
}

