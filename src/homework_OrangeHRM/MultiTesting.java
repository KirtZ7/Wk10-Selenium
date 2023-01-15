package homework_OrangeHRM;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiTesting {

    static String browser = "Chrome";
    static String baseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    static WebDriver driver;
    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) { //Chrome testing
            System.getProperty("WebDriver.chrome.driver", "src/drivers/chromedriver.exe"); //setting web driver
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Firefox")) { //fire fox testing
            System.setProperty("WebDriver.gecko.driver", "src/drivers/geckodriver.exe"); //setting web driver
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) { //Edge testing
            System.getProperty("WebDriver.edge.driver", "src/drivers/msedgedriver.exe"); //setting web driver
            driver = new EdgeDriver();

        } else {
            System.out.println("No valid browsers");
        }

        driver.get(baseURL); //open base url

        //driver.manage().window().maximize(); // Maximise windows

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //timeout session

        String title = driver.getTitle(); // get the page title
        System.out.println("title of the page:"+ title); // print out the title

        String url = driver.getCurrentUrl(); // get current URL
        System.out.println("Current URL:" + url);//print current URL

        String pageSource = driver.getPageSource(); // get page source
        System.out.println("Page source:" + pageSource);

        driver.findElement(By.name("username")).click();// click on username field
        WebElement username = driver.findElement(By.name("username")); // goto email ID field
        username.sendKeys("Admin"); // enter username in the field

        driver.findElement(By.name("password")).click(); // click on password field
        WebElement password = driver.findElement(By.name("password")); // goto password field
        password.sendKeys("admin123");//enter password in password field

        //driver.quit(); //close browser
    }
}
