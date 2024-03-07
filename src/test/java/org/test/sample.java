package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class sample extends BaseClass{

	public static void main(String[] args) {
		
		browserLaunch("chrome");
		
		maximizie();
		
		implicitlyWait(20);
				
		driver.get("https://www.facebook.com/");
	
		String currentUrl = getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = getTitle();
		System.out.println(title);
		
		WebElement txtUsername = driver.findElement(By.id("email"));
		sendkeys(txtUsername, "anand");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		sendkeys(txtPassword, "8878");
	
		WebElement btnlogin = driver.findElement(By.name("login"));
		click(btnlogin);

		quit();
	
	}
}
