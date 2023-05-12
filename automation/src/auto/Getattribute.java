package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Getattribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize(); // to view window in full screen
		driver.get("https://www.amazon.in/");// get () method for getting url
		String value = driver.findElement(By.xpath("//a[.='Amazon miniTV']")).getAttribute("data-csa-c-id");
		System.out.println( value);
		driver.close();
		

	}

}
