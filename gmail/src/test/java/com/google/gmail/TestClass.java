package com.google.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		WebElement element = driver.findElement(By.xpath(""));
		driver.getCurrentUrl();
		if(driver.getTitle().contains("OpenCart")) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		driver.quit();
	}

}
