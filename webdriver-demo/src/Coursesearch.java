/*import org.openqa.selenium.By;
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
        username.sendKeys("");
        password.sendKeys("");
        WebElement login = driver.findElement(By.className("btn--primary"));
        login.click();
        WebElement logins = driver.findElement(By.className("h-100"));
        logins.click();    
        WebElement course = driver.findElement(By.id("data-courses"));
        course.sendKeys("6217410");

        
        
    }
}*/

/*import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coursesearch {
   public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C://Users//Acer//Downloads//chromedriver_win32//chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://auspark.au.edu/class_search");

    WebElement username = driver.findElement(By.id("Username"));
    WebElement password = driver.findElement(By.id("Password"));
    username.sendKeys("");
    password.sendKeys("");
    WebElement login = driver.findElement(By.className("btn--primary"));
    login.click();
	  	
	   // Find elements using tag name
	   List<WebElement> allInputElements = driver.findElements(By.tagName("input"));
	   if(allInputElements.size() != 0) 
	   {
		   System.out.println(allInputElements.size() + " Elements found by TagName as input \n");
		   for(WebElement inputElement : allInputElements) 
		   {
			   System.out.println(inputElement.getAttribute("placeholder"));
		   }
	   }
   }
}*/


//form-control text-uppercase


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
        password.sendKeys("");
        WebElement login = driver.findElement(By.className("btn--primary"));
        login.click();

        WebElement course = driver.findElement(By.id("input-autocomplete"));
        course.sendKeys("JA0011");

        WebElement Subclick = driver.findElement(By.id("js-autocomplete-list"));
        Subclick.click();
    }
}
