package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Q10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://adactinhotelapp.com/");
		
		driver.findElement(By.id("username")).sendKeys("Srini");
		driver.findElement(By.id("password")).sendKeys("12345678");
	}
}
