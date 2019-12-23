package excelRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ReadTest 
{
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException
	{
	WritableWorkbook wb=Workbook.createWorkbook(new File("D:\\test Sheet.xls"));
	WritableSheet ws=wb.createSheet("test Sheeet", 0);
	Label label=new Label(0, 0, "employee");
	
	
	
	}
}
