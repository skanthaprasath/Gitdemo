package excel_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class poi_excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File myFile = new File("./Test-data/Read-data.xlsx");
        FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook wbook= new XSSFWorkbook(fis);
		XSSFSheet sheet = wbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(0);
		String value = cell.getStringCellValue();
		System.out.println(value);
		wbook.close();
	}

}
 