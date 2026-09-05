package Dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A1 {
	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
		WebElement filter = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		
		Select s1= new Select(filter);
		s1.selectByVisibleText("Price (low to high)");
        String product1 = driver.findElement(By.xpath("//div[@data-test=\"inventory-item-name\" and text()='Sauce Labs Bike Light']")).getText();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		String product = driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
		 
		if(product.equals(product1)) {
			System.out.println("Added to Cart");
		}
		else
			System.out.println("Not added to Cart ");
	}

}
