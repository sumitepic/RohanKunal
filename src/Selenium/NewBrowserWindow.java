package Selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewBrowserWindow {
	
	WebDriver driver;
	
	reporting report = new reporting();
	@Test
	public void login(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		try{
		report.header();
		driver.get("http://www.flipkart.com");

		report.datalog("browser open", "", "");
		Set<String> window=driver.getWindowHandles();
		Object[] o1=window.toArray();
		for (int i = 0; i < o1.length; i++) {
			driver.switchTo().window(o1[i].toString());
			if(driver.getCurrentUrl().equals("")){
				System.out.println(driver.getTitle());
				break;	
			}
			
		}
		report.datalog("Tab switch", "", "");
		
		driver.switchTo().window(o1[1].toString());
		System.out.println(driver.getCurrentUrl());
		}
		catch (Exception e) {
			report.datalog("Test fail", "", "");
			e.printStackTrace();
			
		}finally {
			report.tableEnd();	
		}
		
	}
	

}
