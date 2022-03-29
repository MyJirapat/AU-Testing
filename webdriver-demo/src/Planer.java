import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Planer {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C://Users//Acer//Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://auspark.au.edu/Planner");

        WebElement username = driver.findElement(By.id("Username"));
        WebElement password = driver.findElement(By.id("Password"));
        username.sendKeys("6217410");
        password.sendKeys("");
        WebElement login = driver.findElement(By.className("btn--primary"));
        login.click();
        WebElement Addplan = driver.findElement(By.xpath("//a[@href='/Planner/NewPlan']"));
        Addplan.click();
    }   
}


//https://auspark.au.edu/Advising