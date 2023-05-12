package auto;
import java.util.List;

// write a script to print all the link present in amazon
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//findElelement method 
public class HandlingMultipleElements {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize(); // to view window in full screen -->> method chaining one method calling another method
		driver.get("https://www.amazon.in/");// get () method for getting url
		
          List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
          System.out.println(alllinks);
          int count= alllinks.size();
		for (int i = 0; i < count; i++) {
			String text = alllinks.get(i).getText();
			System.out.println(text);
			
		}
		driver.close();
	}

}
