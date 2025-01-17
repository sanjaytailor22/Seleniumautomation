package Selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assign1 {

	public static void main(String[] args)
	
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		//System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		driver.findElement(By.id("checkBoxOption1")).click();
		
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		//System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		driver.findElement(By.id("checkBoxOption1")).click();
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
