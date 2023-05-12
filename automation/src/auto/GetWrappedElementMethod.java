//WAST to 
package auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	       driver.get("file:///C:/Users/admin/OneDrive/Desktop/Anna's%20kitchen.html");
	       WebElement menu = driver.findElement(By.id("Hotelmenu"));
	       Select s = new Select(menu) ;
	       String option = s.getWrappedElement().getText();
	       System.out.println(option);
	       driver.close();
	}

}

