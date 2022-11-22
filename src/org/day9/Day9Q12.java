package org.day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day9Q12 {
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
			if(i%2==0)
			s.selectByIndex(i);			
		}
		int total = opts.size();
		List<WebElement> allselect = s.getAllSelectedOptions();
		int allsize = allselect.size();
		System.out.println("Number Of Options Not Selected:");
		System.out.println(total-allsize);
	}
}
