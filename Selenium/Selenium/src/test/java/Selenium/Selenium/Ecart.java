package Selenium.Selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecart {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		String[] item= {"Tomato","Cauliflower","Carrot","Cucumber"};

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#");
		
		Thread.sleep(4000);
		List<WebElement> vegii=driver.findElements(By.cssSelector("h4.product-name"));
		
			List vegitable = Arrays.asList(item);
			int y = 0; 
		for(int i=0; i<vegii.size() && y < item.length; i++)
		{
			String[] vname = vegii.get(i).getText().split("-");
			String name = vname[0].trim();
			if (vegitable.contains(name)) {
				y++;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();

			}

		}
		

	}

}
