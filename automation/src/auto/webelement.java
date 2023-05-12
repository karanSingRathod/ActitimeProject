//write a script to click on shaadi link present in demo application
package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class webelement {
public static void main(String[] args) throws InterruptedException {
ChromeOptions option =new ChromeOptions();	
option.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver(option); // lauch the browser 
driver.manage().window().maximize();  // maximize the browser 
driver.get("file:///C:/Users/admin/OneDrive/Documents/demo.html"); // get () for getting url
driver.findElement(By.id("kg3")).click();// navigation to demo app
Thread.sleep(5000);   // wait for 5sec 
driver.close();  // close Browser 
	
}
}
//write a script to click on shaadi link present in demo application