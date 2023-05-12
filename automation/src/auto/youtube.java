package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class youtube {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option =new ChromeOptions();	
	option.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(option); // lauch the browser 
	driver.manage().window().maximize();  // maximize the browser 
	driver.get("https://www.youtube.com/results?search_query=varisu+song"); // get () for getting url
	driver.findElement(By.className("search_query")).sendKeys("ranjithame ");// navigation to demo app
	
	driver.close();  // close Browser 
	
}
}
