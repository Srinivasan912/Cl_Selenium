package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Q6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("signin-block")).click();
		driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']")).click();
		driver.findElement(By.id("mobileNoInp")).sendKeys("9876543210");
		driver.findElement(By.id("otpContainer")).click();
}
}
