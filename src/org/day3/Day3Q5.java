package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Q5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.findElement(By.xpath("//div[@id='heading20']")).click();
		driver.findElement(By.xpath("//a[text()='CTS Interview Question ']")).click();
	}	
}
