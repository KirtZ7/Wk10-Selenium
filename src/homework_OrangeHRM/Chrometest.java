package homework_OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Chrometest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe"); //setting Web Driver
        String baseURL ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"; //base URL
        WebDriver driver = new ChromeDriver(); //create object of Chrome web driver
        driver.get(baseURL); //open url

        // Wait for the page to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("OrangeHRM"));

        String title = driver.getTitle(); // get the page title
        System.out.println("title of the page:"+ title); // print out the title

        String url = driver.getCurrentUrl(); // get current URL
        System.out.println("Current URL:" + url);//print current URL

        String pageSource = driver.getPageSource(); // get page source
        System.out.println("Page source:" + pageSource); //print page source

        // Wait for the element to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
        driver.findElement(By.name("username")).click();// click on username field
        WebElement username = driver.findElement(By.name("username")); // goto user ID field
        username.sendKeys("Admin"); // enter username in the field

        // Wait for the element to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
        driver.findElement(By.name("password")).click(); // click on password field
        WebElement password = driver.findElement(By.name("password")); // goto password field
        password.sendKeys("admin123");//enter password in password field

        driver.quit(); //close browser
    }
}
