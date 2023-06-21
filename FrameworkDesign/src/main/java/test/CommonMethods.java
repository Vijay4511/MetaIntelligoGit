package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CommonMethods {
	
	public ArrayList<String> getTestcasedata(String Modulename, String Tcname) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\vjred\\Desktop\\AutomationTraining\\SignupData.xlsx");
		
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		System.out.println(wbook.getNumberOfSheets());
		
		XSSFSheet sheet =	wbook.getSheet(Modulename);
		
		Iterator<Row> Rows = sheet.iterator();	
		
		String celldata;
		
		ArrayList<String> TestcaseData = new ArrayList();
		
		while(Rows.hasNext())  // Iterating thru all the rows in the sheet
		{
			Row specificRow = Rows.next();
			
			if(specificRow.getCell(0).getStringCellValue().equalsIgnoreCase(Tcname))
			{
				Iterator<Cell> Cells =specificRow.cellIterator();
				
				while(Cells.hasNext())
				{
					Cell specificCell =	Cells.next();
					
					celldata = specificCell.getStringCellValue();
					TestcaseData.add(celldata);
				}
				break;
			}
		
		}
		
		return TestcaseData;
		
	}

}
