package homework_Herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefoxtest {

    public static void main(String[] args) {

        String baseURL = "https://the-internet.herokuapp.com/login"; //Store base url
        System.setProperty("WebDriver.gecko.driver", "src/drivers/geckodriver.exe"); //setting web driver

        WebDriver driver = new FirefoxDriver(); // create object
        driver.get(baseURL); //open base url

        //driver.manage().window().maximize(); // Maximise windows

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //timeout session

        String title = driver.getTitle(); // get the page title
        System.out.println("title of the page:"+ title); // print out the title

        String url = driver.getCurrentUrl(); // get current URL
        System.out.println("Current URL:" + url);//print current URL

        String pageSource = driver.getPageSource(); // get page source
        System.out.println("Page source:" + pageSource);

        driver.findElement(By.id("username")).click(); //click on username field
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("tomsmith"); //enter username in the field

        driver.findElement(By.id("password")).click();//click on password field
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!"); // enter password in the field

        driver.findElement(By.className("radius")).click();

        //driver.quit(); //close browser

    }
}
