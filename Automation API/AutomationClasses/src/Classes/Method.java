package facebooklogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method extends Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		String url = "https://rahulshettyacademy.com/seleniumPractise/#/";
		String searchItem = "Brocolli";
		Method obj = new Method();
		obj.openWebsite(driver, url);
		obj.searchItem(driver,searchItem);
		obj.addToCart(driver);
		obj.viewCart(driver);
		obj.checkout(driver);
	}

	


}
