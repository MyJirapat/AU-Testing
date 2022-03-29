import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clearsearch {
    
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C://Users//Acer//Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://auspark.au.edu/class_search");
        WebElement username = driver.findElement(By.id("Username"));
        WebElement password = driver.findElement(By.id("Password"));
        username.sendKeys("6217410");
        password.sendKeys("");
        WebElement login = driver.findElement(By.className("btn--primary"));
        login.click();
        
        WebElement course = driver.findElement(By.id("input-autocomplete"));
        course.sendKeys("JA0011");
        WebElement Subclick = driver.findElement(By.id("js-autocomplete-list"));
        Subclick.click();
        WebElement clear = driver.findElement(By.xpath("//span[contains(@class,'clear-text visible')]"));
        clear.click();
    
       // driver.find_element_by_xpath("//span[contains(@class,'Trsdu')]")
       // .text
       //"span[class='input_group_button']"
    }
}

