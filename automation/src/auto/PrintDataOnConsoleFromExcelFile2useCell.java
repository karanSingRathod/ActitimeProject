package auto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintDataOnConsoleFromExcelFile2useCell {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("./Test Data/Testdata.xlsx");
Workbook wb = WorkbookFactory.create(fis);// create () load the file
int lastCell= wb.getSheet("Sheet1").getRow(1).getLastCellNum();// getLastCellNum is starting form 1
System.out.println(lastCell);
for (int i = 0; i <=lastCell; i++)
   {
	String data = wb.getSheet("Sheet1").getRow(i).getCell(1+1).getStringCellValue();
	System.out.println(data);
		
	}
 }
}




