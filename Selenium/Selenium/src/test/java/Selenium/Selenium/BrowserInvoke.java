package Selenium.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInvoke {

	public static void main(String[] args) {
				
		//Browser Open
		//ChromeDriver driver=new ChromeDriver ();
		WebDriver driver = new ChromeDriver ();
		
		//Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Login Functionality
		//driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("Password");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//Forget Password
		driver.findElement(By.linkText("Forgot your password?")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(""); 
		driver.findElement(By.xpath("//form/input[1]")).sendKeys("Sanjay");
		driver.findElement(By.xpath("//form/input[2]")).sendKeys("sanjay.tailor@serosoft.in");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9424834275");
		
		

	}

}
