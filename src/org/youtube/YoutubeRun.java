package org.youtube;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeRun {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\workplace\\eclipse-wrokspace\\Flipkart_Project\\Driver\\chromedriver.exe");
		
		
		for(int i=0;i<5;i++) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://www.youtube.com/shorts/rBlc8T-wccU");
		driver.get("https://www.youtube.com/shorts/TAp7ppiLlGw");
		Thread.sleep(5000);
		WebElement video = driver.findElement(By.xpath("(//button[@aria-label='Play'])[1]"));
		video.click();
		Thread.sleep(32000);
driver.quit();
		}
	
		
}
	}

