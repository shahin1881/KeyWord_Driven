import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
 static XSSFWorkbook workbook;
 static XSSFSheet Sheet;
 
 public static void setExcelFile(String path,String SheetName) throws Exception 
 {
	 FileInputStream fis=new FileInputStream(path);
	 workbook=new XSSFWorkbook(fis);
	 Sheet=workbook.getSheet(SheetName);
	
	 }
 public static String getCellData(int row,int column)
 {
	 Cell cell=Sheet.getRow(row).getCell(column);
	 String CellData=cell.getStringCellValue();
     return CellData;
 }
 
}
