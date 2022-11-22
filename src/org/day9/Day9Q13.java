package org.day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day9Q13 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://output.jsbin.com/osebed/2");
	
		Select s = new Select(driver.findElement(By.id("fruits")));
		List<WebElement> opts = s.getOptions();
		for(int i=0;i<opts.size();i++)
		{
			s.selectByIndex(i);			
		}
		WebElement firstSelect = s.getFirstSelectedOption();
		System.out.println(firstSelect.getText());
	}
}	
