import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

// @author Jirapat Suwanjunee 6217410
public class GradeEstimationII {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C://Users//Acer//Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://auspark.au.edu/grade_estimation");

        WebElement username = driver.findElement(By.id("6217410"));
        WebElement password = driver.findElement(By.id(""));
        username.sendKeys("6217410");
        password.sendKeys("");
        WebElement login = driver.findElement(By.className("btn--primary"));
        login.click();

        driver.findElement(By.cssSelector("label[for='ITX2007-A']")).click();   
        driver.findElement(By.cssSelector("label[for='ITX4104-B']")).click();  
        driver.findElement(By.cssSelector("label[for='ITX4301-C']")).click();  
        driver.findElement(By.cssSelector("label[for='ITX4306-D']")).click();  
        driver.findElement(By.cssSelector("label[for='FT4133-F']")).click();  
        driver.findElement(By.cssSelector("label[for='ITX4103-C+']")).click();  

        WebElement g = driver.findElement(By.className("js-grade"));
        g.click();

        //Selecting the second checkbox
        //driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']")).click();		
        //Selecting the last check box
        //driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']")).click();
    }
    
}
