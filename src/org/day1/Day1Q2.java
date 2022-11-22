package org.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Q2 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.get("http://gmail.com/");
		
		driver.get("http://www.flipkart.com/");
		
		driver.get("http://greenstech.in/selenium-course-content.html");
	}
}
