// WAST multiple option and deselect all the option in an's kitchen.
package auto;
//WAST get all selected  option and printed on the console 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectAll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/Anna's%20kitchen.html");
		WebElement menu = driver.findElement(By.id("Hotelmenu"));
		   Select s= new Select(menu);
		   s.selectByIndex(0);
		   s.selectByValue("idl");
		   Thread.sleep(3000);
		   s.selectByVisibleText("Mendu vada");
		   Thread.sleep(3000);
		   s.selectByValue("chic");
		   Thread.sleep(3000);
		   driver.close();
		  s.deselectAll();
		   driver.close();
	}

}
