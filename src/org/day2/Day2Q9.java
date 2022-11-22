package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Q9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Srini");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Vasan");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Chengalpattu");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("srini@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("12345678");
			}
}
