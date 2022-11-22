package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Q1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("iphone");
		WebElement btn = driver.findElement(By.id("nav-search-submit-button"));
		btn.click();
	}
}
