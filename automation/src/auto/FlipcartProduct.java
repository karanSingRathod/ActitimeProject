///write a script to auto mate the following scenario
//launch browser 
//maximize
//navigation to filpkart
// handle popup
//enter oneplus10R in search text field 
// click on search icon 
//get the first product name/price and print on console
//therad
//close the browser
package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipcartProduct {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize(); // to view window in full screen
		driver.navigate().to("https://www.flipkart.com/");// get () method for getting url
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(by.)
		
	

	}

}
