package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Q9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Srini@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345678");
		
	}

}
