package org.day5;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q17 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		Actions a = new Actions(driver);
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		WebElement first = driver.findElement(By.xpath("//div[text()='Fashion']"));
		a.moveToElement(first).perform();		
		WebElement second = driver.findElement(By.xpath("//a[text()='Women Footwear']"));
		a.moveToElement(second).perform();
		WebElement thrid = driver.findElement(By.xpath("//a[text()='Women Flats']"));
		a.click(thrid).perform();
		}
}
