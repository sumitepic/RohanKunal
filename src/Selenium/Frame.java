package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	WebDriver driver;

	public Frame(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	public void login(){
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");
		//driver.switchTo().frame("iframeResult");
		System.out.println(driver.findElement(By.xpath("/html/body/h1")).getText());
		driver.switchTo().defaultContent();
	}		
	
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.login();
	}

}
