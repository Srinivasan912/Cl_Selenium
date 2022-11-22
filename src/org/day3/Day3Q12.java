package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Day3Q12 {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
	
		driver.get("https://www.snapdeal.com/");
		
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		driver.findElement(By.xpath("//span[@class='newUserRegister']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//button[@id='checkUser']")).click();
		
	}
	

}
