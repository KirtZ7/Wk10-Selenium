package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;


public class EdgeTest {

    public static void main(String[] args) {

        String baseURL ="https://demo.nopcommerce.com/"; //base url we are opening
        System.getProperty("WebDriver.edge.driver", "src/drivers/msedgedriver.exe"); //set web driver

        WebDriver driver = new EdgeDriver(); //create object
        driver.get(baseURL); //method to open url

        //driver.manage().window().maximize(); // Maximise windows

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //timeout session

        String title = driver.getTitle(); // get the page title
        System.out.println("title of the page:" + title); // print out the title

        String url = driver.getCurrentUrl(); // get current URL
        System.out.println("Current URL:" + url);//print current URL

        String pageSource = driver.getPageSource(); // get page source
        System.out.println("Page source:" + pageSource); //print page source

        driver.findElement(By.className("ico-login")).click(); //Click on Login link

        WebElement emailIdField = driver.findElement(By.id("Email")); // goto email ID field
        emailIdField.sendKeys("Kirtz_777@hotmail.co.uk"); // Enter Email ID

        WebElement passwordField = driver.findElement(By.id("Password")); // goto password field
        passwordField.sendKeys("123456789"); //Enter the password

        //driver.findElement(By.className("button-1 login-button")).click(); // click on login


        //driver.quit(); //close browser

    }
}
