package auto;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPoUp {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/fileUpload.html");
		//driver.findElement(By.id("d1")).sendKeys("C:\\Users\\admin\\eclipse-workspace\\automation\\automation\\Test Data");
		File f = new File("./Test Data/@KARAN RATHOD.docx");
		String path = f.getAbsolutePath();
		driver.findElement(By.id("d1")).sendKeys(path);
		Thread.sleep(5000);
		driver.close();
		
	}
}

