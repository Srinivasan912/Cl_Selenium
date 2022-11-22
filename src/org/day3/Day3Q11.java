package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Q11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.findElement(By.id("firstName")).sendKeys("Srini");
		driver.findElement(By.id("lastName")).sendKeys("Vasan");
		driver.findElement(By.id("username")).sendKeys("Srini123");
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("12345678");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
	}

}