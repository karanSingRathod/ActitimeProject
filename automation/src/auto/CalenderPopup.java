package auto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s= new Select(month);
		s.selectByVisibleText("Aug");
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s1= new Select(year);
		s1.selectByVisibleText("1947");
		driver.findElement(By.linkText("15")).click();
		driver.findElement(By.name("alternative_number")).sendKeys("98765432110");
		Thread.sleep(5000);
		driver.close();
		
		
	}}


