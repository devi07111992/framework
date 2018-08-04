package week6day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelNormal {
	@Test
	//public void readExcel() {
	//using dataprovider
	public void readExcel() throws IOException
	{
		//open Excel from path
		XSSFWorkbook wBook= new XSSFWorkbook("./data/Login.xlsx");
		
		//go to sheet(if we know the sheetname use getSheet
		XSSFSheet sheet=wBook.getSheet("Sheet1");
		
		
		//Find the Row Count 
		   int rowCount=sheet.getLastRowNum();
		   
		   //Colum Count 
		  short columCount= sheet.getRow(0).getLastCellNum();
		  //Read the Data
		  //we dnt want header we need the row from data so use int i =1
		  
		 for(int i=1;i<=rowCount;i++)
		 {
			 //go to the row
		XSSFRow row	= sheet.getRow(i);
		for(int j=0;j<columCount;j++)
		{
			XSSFCell cell=row.getCell(j);
			String data=cell.getStringCellValue();
			System.out.println(data);
		
		
		}
		 }
		 wBook.close();
		 
	}

}

