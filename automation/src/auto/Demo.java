package auto;
// thread is a class to call static method

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");		
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.youtube.com/");
		Thread.sleep(4000);
		driver.close();
	}
// LISTNER IMPLEMENTION CLASS 
	//decleration 
	//
}
