package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Q7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.cleartrip.com/trains");
		
		driver.findElement(By.id("from_station")).sendKeys("Chennai Egmore");
		driver.findElement(By.id("to_station")).sendKeys("Kanyakumari");
		driver.findElement(By.id("trainFormButton")).click();
	
	
	}
}
