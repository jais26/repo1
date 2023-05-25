package facebooklogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver(); //launch chrome
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications"); // to disable notifictions
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
	
		driver.findElement(By.id("email")).sendKeys("jyoti@yopmail.com");
		driver.findElement(By.id("pass")).sendKeys("Test@1283");
		driver.findElement(By.id("loginbutton")).click();

//      WebElement a = driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]"));
//		System.out.println(a.getText());
		 WebElement b = driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]"));
	     System.out.println(b.getText());
		     
		
		
	    }

		}



