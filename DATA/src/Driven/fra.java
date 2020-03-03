package Driven;

import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class fra {
	
public void launch()throws IOException
{
	FileInputStream fs=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\DATA\\src\\Test data\\fetch.xlsx");
	XSSFWorkbook wb= new XSSFWorkbook(fs);
	XSSFSheet sheet= wb.getSheet("login");
	int count=sheet.getLastRowNum();
	for(int i=0;i<=count;i++)
	{
	XSSFRow row=sheet.getRow(i);
	for(int j=0;j<=1;j++) {
	XSSFCell cell=row.getCell(j);
	System.out.println(cell);
	//System.out.println(row);
	}}
}
	public static void main(String[] args)  throws IOException{
		fra oo=new fra();
		oo.launch();
		// TODO Auto-generated method stub

	}

}
