package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Q2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.redbus.in/ ");
		
		driver.findElement(By.id("src")).sendKeys("Chennai");
		driver.findElement(By.id("dest")).sendKeys("Kanyakumari");
	}
}
