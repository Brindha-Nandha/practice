package itestListenersDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(itestListenersDemo.ItestListnerClass.class)
public class OrangeHRM {

	WebDriver driver = new ChromeDriver();

	

	@BeforeClass
	void setUP() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test(priority = 1)
	public void testLogo() {
		
		WebElement logo = driver.findElement(By.xpath("//*[contains(@alt,'company')]"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(logo));
		boolean status = logo.isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	@Test(priority=2)
	void testURL() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	}
	
	@Test(priority = 3,dependsOnMethods= {"testURL"})
	void testHomePageTitle() {
		Assert.assertEquals(driver.findElements(By.xpath("//title[text()='OrangeHRM']")), "OrangeHRM");
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}
