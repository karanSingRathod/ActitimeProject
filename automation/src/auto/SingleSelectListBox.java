package auto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectListBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize(); 
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       driver.get("https://www.facebook.com/login/");
       driver.findElement(By.linkText("Sign up for Facebook")).click();
       driver.findElement(By.name("firstname")).sendKeys("Karan");
       driver.findElement(By.name("lastname")).sendKeys("Rathod");
       driver.findElement(By.name("reg_email__")).sendKeys("8669518762");
      
        
       
       
	}
}
