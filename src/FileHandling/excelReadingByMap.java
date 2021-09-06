package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class excelReadingByMap {
	
	Map<String,List<String>> map = new LinkedHashMap<>();
	
	
	@BeforeClass
	public void f1() throws BiffException, IOException{
		List<String> list =null;
		Workbook book = Workbook.getWorkbook(new File("Book1.xls"));
		Sheet sheet = book.getSheet(0);
		
		for (int i = 0; i < sheet.getRows(); i++) {
			list = new ArrayList<String>();
			for (int j = 1; j < sheet.getColumns(); j++) {
				System.out.println(sheet.getCell(j,i).getContents());
				list.add(sheet.getCell(j,i).getContents());
			}
			map.put(sheet.getCell(0,i).getContents(),list );
		}
		
	}
	
	
	public void dataPrintFromExcelByMap(String key){
		System.err.println("Map"+map.get("userNameElement").get(1));
		WebElement element =null;
		if(map.get("userNameElement").get(0).equalsIgnoreCase("xpath")){
			element= xpathMethod(map.get(key).get(1));
		}else if(map.get("userNameElement").get(0).equalsIgnoreCase("id")){
			element= xpathMethod(map.get(key).get(1));
		}else if(map.get("userNameElement").get(0).equalsIgnoreCase("name")){
			element= xpathMethod(map.get(key).get(1));
		}
	}
	
	
	public WebElement xpathMethod(String xpath) {
		WebDriver driver = null;
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	
	public WebElement allList(String xpath) {
		WebDriver driver = null;
		WebElement element = driver.findElement(By.xpath("//*[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']"));
		List<WebElement> list=element.findElements(By.tagName("li"));
		System.out.println(list.size());
		
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}
		
		return element;
	}
}
