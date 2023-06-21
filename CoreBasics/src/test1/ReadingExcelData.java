package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Printing all the data available in TsrtcTestdata workbook
		
		//Get control of the workbook --> Access to all the sheets in workbook (webpage)
		//Shift focus to the requried sheet  (specific table)
		
		//Shift the focus to the rows and iterate thru all the rows using a loop
		//Sift your foucs to single row
		
		//Get all the columns data and iterate thru all the columns using a loop
		//shift focus to the required cell
		//get the data
	
		//next line
		String Testname = "StateVal";
		ArrayList<String>Testdata = new ArrayList();
		Testdata =	GetTestcaseData(Testname);
		
		for(String s:Testdata)
			System.out.println(s);

	}
	
	public static ArrayList<String> GetTestcaseData(String TcName) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\vjred\\Desktop\\AutomationTraining\\TsrtcTestData.xlsx");
		
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		System.out.println(wbook.getNumberOfSheets());
		
		XSSFSheet sheet =	wbook.getSheet("Sheet1");
		
		Iterator<Row> Rows = sheet.iterator();	
		
		String celldata;
		
		ArrayList<String> TestcaseData = new ArrayList();
		
		while(Rows.hasNext())  // Iterating thru all the rows in the sheet
		{
			
			Row specificRow = Rows.next();
			
			if(specificRow.getCell(0).getStringCellValue().equalsIgnoreCase(TcName))
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
