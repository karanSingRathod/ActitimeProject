package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Getsize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize(); // to view window in full screen
		driver.get("https://www.zomato.com/mumbai");// get () method for getting url
		Thread.sleep(3000);
	    int height = driver.findElement(By.className("sc-kOnlKp harIEx")).getSize().getHeight();
	    int width = driver.findElement(By.className("sc-kOnlKp harIEx")).getSize().getWidth();
	    System.out.println(" height of search bar  is="+height);    
	    System.out.println("width of search bar is="+width);    
	    driver.close();


	}

}
