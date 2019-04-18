package testng;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlsinputstream {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFCell cell;
	XSSFRow row;
	String path;
	
	public xlsinputstream(String path) throws IOException {
		this.path=path;
		wb=new XSSFWorkbook(path);
		}
	public int getrowcount(String str) {
		sheet=wb.getSheet(str);
		int r=sheet.getLastRowNum()+1;
		return r;
		
	}
	public String getvalue(String str, int rno,int cno) {
		sheet=wb.getSheet(str);
		cell=sheet.getRow(rno-1).getCell(cno-1);
		String ret=String.valueOf(cell);
		return ret;
	}
	
	
	

}
