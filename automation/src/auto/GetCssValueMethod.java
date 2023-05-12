//write a script to get css value from the amazon app.
package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetCssValueMethod {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize(); // to view window in full screen -->> method chaining one method calling another method
		driver.get("https://www.amazon.in/");// get () method for getting url
		String color = driver.findElement(By.id("nav-logo-sprites")).getCssValue("color");
        System.out.println(color);
        driver.close();
        
	
	}
	
   
}     
