package org.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Actions a = new Actions(driver);
		
		WebElement drag = driver.findElement(By.id("credit2"));
		WebElement drop = driver.findElement(By.id("bank"));
		WebElement drag1 = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		WebElement drop1 = driver.findElement(By.id("amt7"));
		WebElement drag2 = driver.findElement(By.id("credit1"));
		WebElement drop2 = driver.findElement(By.id("loan"));
		WebElement drop3 = driver.findElement(By.id("amt8"));
		
		a.dragAndDrop(drag, drop).dragAndDrop(drag1, drop1).dragAndDrop(drag2 , drop2).dragAndDrop(drag1, drop3).perform();
		
		
		
	}
	

}
