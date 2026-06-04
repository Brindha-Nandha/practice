package com.google.gmail;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.NonNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String parent = driver.getWindowHandle();
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("OrangeHRM, Inc"))));
		WebElement link = driver.findElement(By.linkText("OrangeHRM, Inc"));
				
		link.click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		List<String> list = new ArrayList<>(windows);
		for (String window:list) {
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
			if(driver.getTitle().equals("OrangeHRM")) {
				driver.close();
			}
		}
		
		
		
	}

}
