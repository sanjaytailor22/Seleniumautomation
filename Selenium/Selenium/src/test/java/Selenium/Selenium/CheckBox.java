package Selenium.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBox 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		
		
		
		// Wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		System.out.println("Check box is selected?" +" " + driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).click();
		
		System.out.println("Check box is selected?" +" " + driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
		
		
		System.out.println("Total check box" + " " + driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		

	}

}
