package org.day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day9Q9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("TestCase00001");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("login")).click();
		
		Select s = new Select(driver.findElement(By.id("room_type")));
		List<WebElement> opts = s.getOptions();
		for(int i=1;i<opts.size();i++)
		{
			WebElement w = opts.get(i);
			System.out.println(w.getText());
		}
	}


}
