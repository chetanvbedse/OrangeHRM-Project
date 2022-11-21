package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	
	
	public static String readData(int row, int column, String Sheetname) throws IOException
	{
		 
		        String path = System.getProperty("user.dir")+"\\OrangeHRM.xlsx";

		        File src = new File(path);
		
//     To load that perticular location
				
				FileInputStream fis = new FileInputStream(src);
		        
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				
				XSSFSheet sh = wb.getSheet(Sheetname);
				
//                String s  =  sh.getRow(row).getCell(column).getStringCellValue();
//                
//                System.out.println(s);

				DataFormatter df = new DataFormatter();
				
				String formattedvalue = df.formatCellValue(sh.getRow(row).getCell(column));
			
	//			System.out.println(formattedvalue);
		        return formattedvalue ;
		        
		        
	}
	
	
	
	
	
	
	
                
	
}
