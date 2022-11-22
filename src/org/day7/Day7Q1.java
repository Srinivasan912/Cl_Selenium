package org.day7;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7Q1 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\workplace\\eclipse-wrokspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com ");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
	TakesScreenshot ts =(TakesScreenshot) driver;
	File scr = ts.getScreenshotAs(OutputType.FILE);
	long img = System.currentTimeMillis();
	File des = new File("D:\\workplace\\eclipse-wrokspace\\Selenium\\ScreenShot\\image"+img+".png");
	FileUtils.copyFile(scr, des);
	
			
}

}
