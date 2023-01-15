package homework_ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiTesting {
    static String browser = "Chrome";
    static String baseURL = "https://courses.ultimateqa.com/users/sign_in";
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

        driver.get(baseURL); //method to open URL
        driver.manage().window().maximize(); // Maximise windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //timeout session

        String title = driver.getTitle(); // get the page title
        System.out.println("title of the page:"+ title); // print out the title

        String url = driver.getCurrentUrl(); // get current URL
        System.out.println("Current URL:" + url);//print current URL



        driver.findElement(By.id("user[email]")); //click on username field
        WebElement usernameEmail = driver.findElement(By.id("user[email]"));
        usernameEmail.sendKeys("kirtz_777@hotmail.co.uk"); //enter username

        driver.findElement(By.id("user[password]")); //click on password field
        WebElement password = driver.findElement(By.id("user[password]"));
        password.sendKeys("Test1234"); //enter password

        driver.findElement(By.cssSelector(".button.button-primary.g-recaptcha")).click();// click on sign in

        //driver.quit(); //close the tab

    }
}
