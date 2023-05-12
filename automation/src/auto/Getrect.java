package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Getrect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.
		manage().window().maximize(); // to view window in full screen
		driver.get("https://www.zomato.com/mumbai");// get () method for getting url
	   int x = driver.findElement(By.className("sc-18n4g8v-0 gAhmYY sc-cKZAiZ hvRBUk")).getRect().getX();
	    int y = driver.findElement(By.className("sc-18n4g8v-0 gAhmYY sc-cKZAiZ hvRBUk")).getRect().getY();
	    int h= driver.findElement(By.className("sc-18n4g8v-0 gAhmYY sc-cKZAiZ hvRBUk")).getRect().getHeight();
	    int w = driver.findElement(By.className("sc-18n4g8v-0 gAhmYY sc-cKZAiZ hvRBUk")).getRect().getWidth();
	    
		System.out.println(" height of search bar  is="+h);    
	    System.out.println("width of search bar is="+w);
	    System.out.println(" xaxia of search bar  is="+x);    
	    System.out.println("of search bar is="+y);    
	    driver.close();
	}

}
