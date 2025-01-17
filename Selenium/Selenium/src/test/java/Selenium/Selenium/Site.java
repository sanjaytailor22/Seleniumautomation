package Selenium.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Site 
{

	public static void main(String[] args) throws Exception 
	{
		//Browser Open
				//ChromeDriver driver=new ChromeDriver ();
				WebDriver driver = new ChromeDriver ();
				
				driver.manage().window().maximize();
				
				//Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				
				/*
				driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
				driver.findElement(By.xpath("//a[@value='JAI']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[@value='TIR']")).click(); */
				
				WebElement Sd = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
				
				Thread.sleep(1000);
								
				Select dropdown=new Select (Sd);
						
				System.out.println(dropdown.getFirstSelectedOption().getText());
				
				dropdown.selectByValue("AED");
				System.out.println(dropdown.getFirstSelectedOption().getText());
				
				//pasenger dropdown
				
				driver.findElement(By.id("divpaxinfo")).click();
				
				//driver.findElement(By.xpath("span[@id='hrefIncAdt']")).click();
				
				Thread.sleep(2000);
				
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				
				for(int i=1; i<5; i++)
				
				{
				
					driver.findElement(By.id("hrefIncAdt")).click();
					i++;
				}
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				
				driver.findElement(By.id("btnclosepaxoption")).click();
				
				//City Selection
				
				driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
				driver.findElement(By.xpath("//a[@value='JAI']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
	
	            //driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_destinationStation1_CTXTaction'] //a[@value='BLR'])").cl
			
				//driver.findElement(By.linkText("Amritsar (ATQ)")).click();
	                  
	}
	
	

}
