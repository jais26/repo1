package facebooklogin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Test {
	
	

	public void openWebsite(WebDriver driver, String url) 
	{
		driver.get(url);  // this will call URL from main method
	}

	protected void searchItem(WebDriver driver, String itemName) 
	{
	  driver.findElement(By.xpath("//input[@type='search'] ")).sendKeys(itemName,Keys.ENTER);	
	}
	
	public void addToCart(WebDriver driver) 
	{
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/div[3]/button")).click();
	}
	
	public void viewCart(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img")).click();	
	}
	
	public void checkout(WebDriver driver)
	{
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();     
	}
}
