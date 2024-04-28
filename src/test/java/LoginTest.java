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
        WebElement usernameInput = driver.findElement(By.xpath("//input[@placeholder='Enter username']"));
        usernameInput.isDisplayed();
        usernameInput.isEnabled();
        usernameInput.sendKeys("rudhvi89");

        // Enter password
        WebElement passwordInput = driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
        passwordInput.isDisplayed();
        passwordInput.isEnabled();
        passwordInput.sendKeys("Lulu007!!!!!!!!!");

        // Login button
        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='LOGIN']"));
        loginButton.isDisplayed();
        loginButton.isEnabled();
        loginButton.click();

        // Wait for OTP input field
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Enter OTP
        WebElement otpInput = driver.findElement(By.xpath("//form[@class='login-form']//input[@placeholder='Enter OTP']"));
        otpInput.isDisplayed();
        otpInput.isEnabled();
        otpInput.sendKeys("123456");

        // Submit button for OTP
        WebElement submitButton = driver.findElement(By.xpath("//button[normalize-space()='SUBMIT']"));
        submitButton.isDisplayed();
        submitButton.isEnabled();
        submitButton.click();

        // Wait for the login process to complete
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement Homepage = driver.findElement(By.id("Homepage"));
        String Activvalues = Homepage.getText();
        String Expectedvalues = "Home Page";

        // Accounts
        WebElement Accounts = driver.findElement(By.xpath("//button[normalize-space()='ACCOUNTS']"));
        Accounts.isDisplayed();
        Accounts.isEnabled();
        Accounts.click();

        // Give Wallet Number
        WebElement otpInput = driver.findElement(By.xpath("//form[@class='login-form']//input[@placeholder='Enter OTP']"));
        otpInput.isDisplayed();
        otpInput.isEnabled();
        otpInput.sendKeys("01959508016");

        // Wait for the login process to complete
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement Accountsdetails = driver.findElement(By.id("Accountsdetails"));
        String values = Accountsdetails.getText();
        String givenvalues = "Accountsdetails";

        // Close the browser
        driver.quit();
    }
}