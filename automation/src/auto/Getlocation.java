//

package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Getlocation {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(option);
		driver.
		manage().window().maximize(); // to view window in full screen
		driver.get("https://www.facebook.com/");// get () method for getting url
	    int xaxis = driver.findElement(By.name("login")).getLocation().getX();
	    int yaxis = driver.findElement(By.name("login")).getLocation().getY();
	    System.out.println("xaixs of login button is="+xaxis);    
	    System.out.println("yaixs of login button is="+yaxis);    
	    driver.close();
	}
	

}
