package org.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Q6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Srinivasan");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("12345678");
		
		String email1 = email.getAttribute("value");
		System.out.println(email1);
		String pass1 = pass.getAttribute("value");
		System.out.println(pass1);
	}
}
