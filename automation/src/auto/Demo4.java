package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
        
		ChromeOptions option =new ChromeOptions();	
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option); // lauch the browser 
		driver.manage().window().maximize();  // maximize the browser 
		driver.get("https://demo.actitime.com/login.do"); // get () for getting url
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
	}

}
