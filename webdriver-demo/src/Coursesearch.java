import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coursesearch {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C://Users//Acer//Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://auspark.au.edu/class_search");

        WebElement username = driver.findElement(By.id("Username"));
        WebElement password = driver.findElement(By.id("Password"));
        username.sendKeys("6217410");
        password.sendKeys("3112542My");
        WebElement login = driver.findElement(By.className("btn--primary"));
        login.click();

        WebElement logins = driver.findElement(By.className("h-100"));
        logins.click();

        
        WebElement course = driver.findElement(By.id("data-courses"));
        course.sendKeys("6217410");

        
        
    }
}
