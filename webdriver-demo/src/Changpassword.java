import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Changpassword {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C://Users//Acer//Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://auspark.au.edu/Account/Login?ReturnUrl=%2F");
    }
}

