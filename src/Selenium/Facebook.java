package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Facebook {

	WebDriver driver;
	
	@BeforeClass
	public void Facebook(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void login(){
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("sumit");
		driver.findElement(By.id("pass")).sendKeys("sumit");
		/*WebElement userName= driver.findElement(By.id(POM.userName));
		userName.sendKeys(webuserName);
		
		WebElement login =driver.findElement(By.name(POM.password));
		login.click();*/
	}
	
	public void flipKart(){
		driver.get("https://www.flipkart.com/");
		Actions action = new Actions(driver);
		WebElement fashion= driver.findElement(By.xpath("//*[text()='Fashion']"));
		action.moveToElement(fashion).build().perform();
		fashion.getAttribute("value");	
	}
	
	public void dropDown(){
		WebElement bithday= driver.findElement(By.name("birthday_day"));
		Select select = new Select(bithday);
		select.selectByVisibleText("23");
		select.selectByValue("0");
		select.selectByIndex(12);
	}
	
	
	public static void main(String[] args) {
		Facebook fb = new Facebook();
		//fb.login("", "");
	}
}
