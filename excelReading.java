package FileHandling;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class excelReading {

	public void f1() throws BiffException, IOException{
		Workbook book = Workbook.getWorkbook(new File("Book1.xls"));
		Sheet sheet = book.getSheet("First");
		
		for (int i = 0; i < sheet.getRows(); i++) {
			for (int j = 0; j < sheet.getColumns(); j++) {
				System.out.println(sheet.getCell(j,i).getContents());
			}
		}
		
	}
	
	public void xlsWrite() throws BiffException, IOException, RowsExceededException, WriteException{

		Workbook kunal = Workbook.getWorkbook(new File("Book2.xls"));
		WritableWorkbook book = Workbook.createWorkbook(new File("Book2.xls"),kunal);
		WritableSheet sheet = book.getSheet(0);
		Label label = new Label(5, 5, "Kunal");
		sheet.addCell(label);
		book.write();
		
		book.close();
		kunal.close();
	}
	
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		excelReading Reading = new excelReading();
		Reading.xlsWrite();
	}
	
}
