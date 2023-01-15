package homework_ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefoxtesting {

    public static void main(String[] args) {

        String baseURL = "https://courses.ultimateqa.com/users/sign_in"; //Store base url
        System.setProperty("WebDriver.gecko.driver", "src/drivers/geckodriver.exe"); //setting web driver

        WebDriver driver = new FirefoxDriver(); // create object
        driver.get(baseURL); //open base url

        //driver.manage().window().maximize(); // Maximise windows

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //timeout session

        String title = driver.getTitle(); // get the page title
        System.out.println("title of the page:" + title); // print out the title

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
