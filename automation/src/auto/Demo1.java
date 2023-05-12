package auto;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize(); // to view window in full screen
		driver.get("https://www.netflix.com/in/");// get () method for getting url
	
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(4000);
		driver.close();
	
	}

}