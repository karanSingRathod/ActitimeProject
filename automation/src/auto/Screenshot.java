//WAST take the screenshot instagram page ?
package auto;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(5000);
	TakesScreenshot t= (TakesScreenshot)driver;//up casting
    File src = t.getScreenshotAs(OutputType.FILE);
    File dest = new File("./Test Data/ScreenShot/ss.png");
	Files.copy(src, dest);

	}

}
