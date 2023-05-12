package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Independentdependent {

	public static void main(String[] args) {
		ChromeOptions option= new ChromeOptions() ;
		
        option.addArguments("--remote-allow-origins=*");
        
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize(); // to view window in full screen
		driver.get("https://www.flipkart.com");// get () method for getting url
	    driver.findElement(By.className("_3704LK")).sendKeys("samsung note 20 ultra");
	    driver.findElement(By.className("L0Z3Pu")).click();
	    
		
	}

}
home work