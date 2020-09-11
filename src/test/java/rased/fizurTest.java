package rased;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fizurTest {
	
	@Test
	public void lbrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.close();
		
	}
	
	@Test
	public void lbrowser1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Assert.assertTrue(driver.getTitle().contains("Practice Page"));
		driver.close();
		
		
	}
	
	
	@Test
	public void lbrowser2()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='radio1']")).isSelected());
		driver.close();
		
		
		
	}
	@Test
	public void check()
	{
		System.out.println("Facing Problem");
	}
	
	@BeforeTest
	public void ss()
	{
		System.out.println("This is the First");
	}
	
	@AfterTest
	public void sa()
	{
		System.out.println("This is the Last");
	}
}
