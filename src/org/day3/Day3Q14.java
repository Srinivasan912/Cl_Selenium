package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Q14 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.swiggy.com/");
		
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.id("mobile")).sendKeys("9876543210");
		driver.findElement(By.id("name")).sendKeys("Srinivasan");
		driver.findElement(By.id("email")).sendKeys("srini@gmail.com");
		driver.findElement(By.id("password")).sendKeys("9876543210");
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		
	}
}
