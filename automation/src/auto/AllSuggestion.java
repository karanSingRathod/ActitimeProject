package auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AllSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize(); // to view window in full screen -->> method chaining one method calling another method
		driver.get("https://www.flipkart.com/");  // get () method for getting url
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    
	
		
		
	    
	}

}
