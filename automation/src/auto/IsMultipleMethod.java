package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/Anna's%20kitchen.html");
		WebElement menu = driver.findElement(By.id("Hotelmenu"));
		Select s= new Select(menu);
		Thread.sleep(3000);
	    if (s.isMultiple()== true) {
			System.out.println("multiple option selected");
		} else {
           System.out.println("multiple option is not selected");
		}
	    Thread.sleep(3000);	
		driver.close();	
		}

	}


