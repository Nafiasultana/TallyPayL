import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    public static void main(String[] args) {
        //Browser driver exe
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the webpage
        driver.get("http://10.9.0.77:5333/#/login");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Wait for page elements to load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Enter username
        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys("your_username");

        // Enter password
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("your_password");

        // Login button
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
        loginButton.click();

        // Wait for OTP input field
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Enter OTP
        WebElement otpInput = driver.findElement(By.id("otp"));
        otpInput.sendKeys("your_otp");

        // Submit button for OTP
        WebElement submitButton = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        submitButton.click();

        // Wait for the login process to complete
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Close the browser
        driver.quit();
    }
}
