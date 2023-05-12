package auto;
import java.util.List;

import org.openqa.selenium.By;
//WAST print all the option present in anna's kitchen resto????
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.get("file:///C:/Users/admin/OneDrive/Desktop/Anna's%20kitchen.html");
       WebElement menu = driver.findElement(By.id("Hotelmenu"));
       Select s = new Select(menu) ;
       List<WebElement> alloption = s.getOptions();
       int count = alloption.size();
       for (int i = 0; i <count; i++) {
    	   String option = alloption.get(i).getText();
	       System.out.println(option);	
	}
       driver.close();
	}
	

}
