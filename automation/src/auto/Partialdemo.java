package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Partialdemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option =new ChromeOptions();	
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option); // lauch the browser 
		driver.manage().window().maximize();  // maximize the browser 
		driver.get("https://www.facebook.com"); // get () for getting url
		driver.findElement(By.partialLinkText("Create")).click();
		Thread.sleep(3000);
		driver.findElement(By.name(""));
		
	}

}