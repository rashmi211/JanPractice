package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RS_Parameterization {
	public static String getdata(int i,int j) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("D:\\ProjectOnGit\\APIAutomation\\Jan2024\\src\\test\\resources\\Test Data.xlsx");
	
		String testdata=WorkbookFactory.create(file).getSheet("SwagLab").getRow(i).getCell(j).getStringCellValue();
	
		return testdata;

	
	}

}
