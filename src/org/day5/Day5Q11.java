package org.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.homedepot.com/");
		Actions a = new Actions(driver);
		
		WebElement first = driver.findElement(By.xpath("//a[text()='All Departments']"));
		a.moveToElement(first).perform();
		WebElement second = driver.findElement(By.xpath("((//a[text()='Heating & Cooling'])[1]"));
		a.moveToElement(second).perform();
		WebElement third = driver.findElement(By.xpath("//a[@title='Air Conditioners']"));
		a.moveToElement(third);
		WebElement fourth = driver.findElement(By.xpath("//a[@title='Portable Air Conditioners']"));
		a.click(fourth).perform();
	}

}
