package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Q8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page ");
		
		driver.findElement(By.name("username")).sendKeys("srini");
		driver.findElement(By.name("password")).sendKeys("12345678");
	}
}
