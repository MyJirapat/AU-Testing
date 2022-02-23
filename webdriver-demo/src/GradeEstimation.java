import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class GradeEstimation {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C://Users//Acer//Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://auspark.au.edu/grade_estimation");

        WebElement username = driver.findElement(By.id("Username"));
        WebElement password = driver.findElement(By.id("Password"));
        username.sendKeys("6217410");
        password.sendKeys("3112542My");
        WebElement login = driver.findElement(By.className("btn--primary"));
        login.click();

        WebElement g = driver.findElement(By.className("js-grade"));
        g.click();



        //WebElement subjectcode = driver.findElement(By.id("name"));
        //WebElement grade = driver.findElement(By.id("data-grade"));
        
        //subjectcode.sendKeys("ITX2007");
        //grade.sendKeys("C");

        //Selecting the first checkbox
driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).click();

//Selecting the second checkbox
driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']")).click();
		
//Selecting the last check box
driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']")).click();

       

        

    
    }
}
