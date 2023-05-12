//WAST read the multiple data from the excel sheet
package auto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintDataOnConsoleFromExcelFile {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("./Test Data/Testdata.xlsx");
       Workbook wb = WorkbookFactory.create(fis);// create () load the file
         int lastrow = wb.getSheet("Sheet1").getLastRowNum();
       
		for (int i = 0; i <=lastrow; i++)
		{
       String data = wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
		System.out.println(data);
	
		}
	}
//WAST read the multiple data from the excel sheet 
}
