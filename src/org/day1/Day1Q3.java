package org.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Day1Q3 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.get("http://greenstech.in/selenium-course-content.html");
	}
}
