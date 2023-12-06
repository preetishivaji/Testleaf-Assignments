package week3.day2;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("bags");
		driver.findElement(By.className("ic-search")).click();
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='price  ']"));
		System.out.println(price.size());
		List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']"));
		List<String> brandlist = new ArrayList<String>();
		for(int i=0;i<brand.size();i++)
		{
			
			brandlist.add(brand.get(i).getText());
		}
		System.out.println(brandlist);
		
		List<WebElement> bagnames = driver.findElements(By.xpath("//div[@class='nameCls']"));
		List<String> bagname = new ArrayList<String>();
		for(int i=0;i<bagnames.size();i++)
		{
			bagname.add(bagnames.get(i).getText());
		}
		System.out.println(bagname);

	}

}
