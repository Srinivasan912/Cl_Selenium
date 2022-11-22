package org.day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7Q4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.greenstechnologys.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
    	
    	WebElement scrolldown = driver.findElement(By.xpath("//span[text()='Greens technology Perumbakkam']"));
    	js.executeScript("arguments[0].scrollIntoView(true)",scrolldown);
	}
}
