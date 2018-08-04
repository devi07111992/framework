package week6day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	//public void readExcel() {
	//using dataprovider
	public Object[][] readExcel(String fileName)throws IOException
	{
		//open Excel from path
		//XSSFWorkbook wBook= new XSSFWorkbook("./data/Login.xlsx");
		//System.out.println(System.getProperty("user.dir")+"/data/"+filename+".xlsx");
		XSSFWorkbook wBook= new XSSFWorkbook("./data/"+fileName+".xlsx");
		//go to sheet(if we know the sheetname use getSheet
		//XSSFSheet sheet=wBook.getSheet("Sheet1");
		//go to sheet(if we dnt know the sheetname use getSheetAt(Index)0 so it will take always first sheet in the excel sheet
		XSSFSheet sheet=wBook.getSheetAt(0);
		//Find the Row Count 
		   int rowCount=sheet.getLastRowNum();
		   //Colum Count 
		  short columCount= sheet.getRow(0).getLastCellNum();
		  //Read the Data
		  Object[][] data=new Object[rowCount][columCount];
		  //we dnt want header we need the row from data so use int i =1
		 for(int i=1;i<=rowCount;i++)
		 {
			 //go to the row
		XSSFRow row	= sheet.getRow(i);
		for(int j=0;j<columCount;j++)
		{
			try {
				XSSFCell cell=row.getCell(j);
				data[i-1][j]=cell.getStringCellValue();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				data[i-1][j]="";
			}
			
		
		
		}
		 }
		 wBook.close();
		 return data;
	}

}

