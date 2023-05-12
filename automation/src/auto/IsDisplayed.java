package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsDisplayed {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote--allow-origins=*");
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("//img[@alt='Facebook']");
		driver.findElement(By.xpath("//img[@alt='Facebook']")). 

	}

}

