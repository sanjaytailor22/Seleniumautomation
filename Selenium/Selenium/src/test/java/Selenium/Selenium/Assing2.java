package Selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assing2 {

	public static void main(String[] args)

	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("sanjana");
		driver.findElement(By.name("email")).sendKeys("sanjana@yopmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("sanjana");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement gender=driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select gs= new Select(gender);
		gs.selectByVisibleText("Female");
		
		
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("22-04-1990");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		

	}

}