package Create_Store;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class checkxl {
	@DataProvider(name="data")
	public Object[][] testdata() throws EncryptedDocumentException, IOException{
		FileInputStream fs = new FileInputStream(
			    System.getProperty("user.dir") + "\\src\\test\\resources\\Data\\TestData.xlsx"
			);
		Workbook w=WorkbookFactory.create(fs);
		Sheet s=w.getSheet("Sheet1");
		int rowsize=s.getPhysicalNumberOfRows();
		int cellsize=s.getRow(0).getPhysicalNumberOfCells();
		Object[][] d=new Object[rowsize-1][cellsize];

		for (int i = 0; i < rowsize - 1; i++) {  
			for (int j = 0; j < cellsize; j++) {  
				d[i][j] = s.getRow(i + 1).getCell(j).getStringCellValue();  
			}  
		}
		return d;
		
	}
	@Test(dataProvider = "data")
	public void test(String value) {
		System.out.println(value);
	}
}
