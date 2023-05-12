package auto;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MI {
	public static void main(String[] args) throws IOException {
		GenericMethod g = new GenericMethod();
		String data = g.readDataFromPropertyFile("password");
		System.out.println(data);
		String un = g.readDataFromPropertyFile("username");
        String url = g.readDataFromPropertyFile("url");
        System.out.println(un);
        System.out.println(url);
        WebDriver driver = new ChromeDriver();
        driver.get(url);
	}



	

}

