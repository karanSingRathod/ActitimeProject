//WAS to write the data in the excel sheet
package auto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("./Test Data/Testdata.xlsx");
Workbook wb = WorkbookFactory.create(fis);
wb.getSheet("Sheet1").getRow(1).getCell(2).setCellValue("virat");
FileOutputStream fos=new FileOutputStream("./Test Data/Testdata.xlsx");
wb.write(fos);
	}

}
