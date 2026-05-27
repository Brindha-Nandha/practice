package com.google.gmail;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DynamicTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> pages= driver.findElements(By.xpath("//ul[@class='pagination']/li"));
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='productTable']//tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='productTable']//th"));
		for(int i = 1;i<=pages.size();i++) {
			int pagenum = Integer.parseInt(pages.get(i).getText());
			if(pagenum>1) {
				driver.findElement(By.xpath("//ul[@class='pagination']/li["+i+"]/a")).click();
			}
			for(int k = 1;i<=rows.size()-1;k++) {
				for(int j=1;j<=columns.size()-1;j++) {
					WebElement data = driver.findElement(By.xpath("//table[@id='productTable']//tr["+k+"]/td["+j+"]"));
					System.out.println(data.getText() + "\t");
					
				}
				driver.findElement(By.xpath("//table[@id='productTable']//tr["+k+"]/td/input[@type='checkbox']")).click();
			}
			
		}	}

}
