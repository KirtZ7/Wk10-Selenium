package homework_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrometest {
    public static void main(String[] args) {

        String baseURL = "https://www.saucedemo.com/"; //Store base url
        System.setProperty("WebDriver.chrome.driver", "src/drivers/chromedriver.exe"); // setting Web driver

        WebDriver driver = new ChromeDriver(); //Create object of chrome Web Driver
        driver.get(baseURL); //method to open URL

        //driver.manage().window().maximize(); // Maximise windows

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //timeout session

        String title = driver.getTitle(); // get the page title
        System.out.println("title of the page:"+ title); // print out the title

        String url = driver.getCurrentUrl(); // get current URL
        System.out.println("Current URL:" + url);//print current URL

        String pageSource = driver.getPageSource(); // get page source
        System.out.println("Page source:" + pageSource); //print page source

        driver.findElement(By.id("user-name")).click(); // click on username field
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user"); //enter username field

        driver.findElement(By.id("password")).click(); // click on password field
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce"); //enter password in field

        driver.findElement(By.id("login-button")).click();//click the login button

        //driver.quit(); //close webpage

    }
}