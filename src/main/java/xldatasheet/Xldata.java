package xldatasheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xldata {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
	
		File src=new File("./data/login.xlsx");//specific path
		XSSFWorkbook Wbook = new XSSFWorkbook(src);//work book
		XSSFSheet sheet=Wbook.getSheet("Sheet1");//seshpecific 
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j < 2; j++) {
				/*int rows=sheet.getLastRowNum();
							int coloums=sheet.getRow(0).getLastCellNum();
							Object[][] obj=new Object[rows][coloums];
							for (int i = 1; i <rows; i++) {
								XSSFRow row = sheet.getRow(i);
								for (int j = 0; j < coloums; j++) {
									XSSFCell coloum1=row.getCell(j);
									System.out.println(coloum1);
									obj[i-1][j]=coloum1.getStringCellValue();*/
				String h1 = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(h1);
			}
		}
	}

}
