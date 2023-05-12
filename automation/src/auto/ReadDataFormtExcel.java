package auto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFormtExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Test Data/Testdata.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
      String Abhishek = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
        System.out.println(Abhishek);
	}

}
