package org.day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9Q1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.findElement(By.xpath("//div[text()='Elements']")).click();
		
		
	}

}
