package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisplayEnable {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote--allow-origins=*");
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		boolean button = driver.findElement(By.xpath("//img[@alt='Facebook']")).isEnabled();
		if (button==true) {
			System.out.println("login button is enable");
			
		} else {
			
			System.out.println("login button is disable");
		}
		
       Thread.sleep(5000);
       driver.close();
	}

}
