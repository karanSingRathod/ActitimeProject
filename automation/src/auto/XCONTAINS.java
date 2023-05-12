package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XCONTAINS {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize(); // to view window in full screen
		driver.get("https://www.amazon.in/");// get () method for getting url
		
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung s22 ultra");
	    
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    Thread.sleep(5000);
	    
	   String product=driver.findElement(By.xpath(//span[contains(.,(//span[contains(text(),'Samsung Galaxy S22 5G (Phantom Black, 8GB, 128GB Storage))])[3])).getText();
	    System.out.println(product);.sleep(5000);
	    driver.close();

	}

}
