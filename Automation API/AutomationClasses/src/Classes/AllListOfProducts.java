package facebooklogin;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllListOfProducts {
	
	// taking global 
	public static boolean isDisplay;
	public static boolean isEnable;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         WebDriver driver = new ChromeDriver(); //to open chrome
         driver.manage().window().maximize(); // to maximise browser
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // aading implicity wait time 
         driver.get("https://www.flipkart.com/");  // site url to revoke browser website
         driver.findElement(By.name("q")).sendKeys("redmi note",Keys.ENTER);  // in search bar after searching any product it will click to search
         WebElement nextButton= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[26]/div/div/nav/a[11]/span"));
        		 if(isEnable(nextButton)) {
        				PrintProductsName(driver);
        			}
        		}      
         
         private static void PrintProductsName(WebDriver driver)
         {
        	 List<WebElement> allProducts = driver.findElements(By.className("//div[@class='_13oc-S']"));
     		allProducts.forEach(name->System.out.println(name.getText()));
     		driver.findElement(By.xpath("//*[@id=\\\"container\\\"]/div/div[3]/div[1]/div[2]/div[26]/div/div/nav/a[11]/span")).click();
     		if(isDisplay && isEnable ) 
     		{
     			PrintProductsName(driver);
     		}
     	}
		
		private static boolean isEnable(WebElement nextButton)
		{
			isDisplay = nextButton.isDisplayed();
			isEnable = nextButton.isEnabled();
			if(isDisplay && isEnable )
			{
				return true;
			}
			    return false;
	    }



		
	}


