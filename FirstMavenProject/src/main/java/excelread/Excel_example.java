package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_example {
	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static XSSFSheet s;
	
	public static String getdata(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\User\\Downloads\\Sample.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Halo");
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		return c.getStringCellValue();
		
		
	}
	public static String getintegerdata(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\User\\Downloads\\Sample.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Halo");
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		int x=(int) c.getNumericCellValue();
		return String.valueOf(x);
		
	}

}
