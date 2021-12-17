package com.calender;

//import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCalender {

	ChromeDriver driver = null;

	@Before
	public  void setUp() throws Exception {
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Snehal\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			
	}

	@Test
	public void testalert() {
		driver.findElement(By.id("name")).sendKeys("abcd");
		driver.findElement(By.id("alertbtn")).click();
		Alert alert=driver.switchTo().alert();
		String title = alert.getText();
		System.out.println(title);
		
	}

}
