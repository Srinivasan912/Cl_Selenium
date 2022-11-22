package org.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q13 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.snapdeal.com/");
		Actions a = new Actions(driver);
		// Mobile & Tablet not found so, i choose Mobile & Accessories
		WebElement first = driver.findElement(By.xpath("//span[text()='Mobile & Accessories']"));
		a.moveToElement(first).perform();
		//newly lanuch covers not found so, i choose Plain Back Covers
		WebElement second = driver.findElement(By.xpath("//span[text()='Plain Back Covers']"));
		a.click(second).perform();
		}
}
