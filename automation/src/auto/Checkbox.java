package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		boolean button = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if (button==true) {
			System.out.println("check box is selected");
			
		} else {
			
			System.out.println("check box is not selected");
		}
		
       Thread.sleep(5000);
       driver.close();
	}


	}


