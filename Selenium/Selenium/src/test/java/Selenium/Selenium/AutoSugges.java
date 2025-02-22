package Selenium.Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugges 
{

	public static void main(String[] args)

	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// Wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("Aus");

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
			

		for (WebElement option : options) {
			if (option.getText().equals("Austria"))
			{
				option.click();

			}
		}

	}

}
