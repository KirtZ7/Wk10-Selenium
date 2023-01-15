package homework_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edgetest {

    public static void main(String[] args) {

        String baseURL ="https://www.saucedemo.com/"; //base url we are opening
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

        driver.findElement(By.id("user-name")).click(); // click on username field
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user"); //enter username field

        driver.findElement(By.id("password")).click(); // click on password field
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        //driver.quit(); //close webpage

    }
}
