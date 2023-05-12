package auto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GenericMethod {

	public  String readDataFromPropertyFile(String key) throws IOException {
         FileInputStream fis = new FileInputStream("./Test Data/actitime.property.txt");
         Properties p= new Properties();
         p.load(fis);
         String value = p.getProperty(key);
		return value;
	}

}
