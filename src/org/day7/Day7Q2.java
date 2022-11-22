package org.day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day7Q2 {
    public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver","D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("http://toolsqa.com/");
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	
    	WebElement scrolldown = driver.findElement(By.xpath("//div[text()='Articles']"));
    	js.executeScript("arguments[0].scrollIntoView(true)",scrolldown);
    	
	}
}
