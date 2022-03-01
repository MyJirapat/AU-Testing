import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Changpassword {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C://Users//Acer//Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://auspark.au.edu");

        WebElement username = driver.findElement(By.id("Username"));
        WebElement password = driver.findElement(By.id("Password"));
        username.sendKeys("");
        password.sendKeys("");
        WebElement login = driver.findElement(By.className("btn--primary"));
        login.click();

        WebElement changePassword = driver.findElement(By.className("p-0"));
        changePassword.click();

        WebElement currentPassword = driver.findElement(By.id("Username"));
        WebElement newPassword = driver.findElement(By.id("Password"));
        //WebElement confirmPassword = driver.findElement(By.id("ConfirmNewPassword"));
        currentPassword.sendKeys("Username");
        newPassword.sendKeys("Password");
        //confirmPassword.sendKeys("11111");
        
        //WebElement confirm = driver.findElement(By.id("btn--primary"));
        //confirm.click();

    }
}

