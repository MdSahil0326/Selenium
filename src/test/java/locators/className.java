package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class className {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=  new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		  Thread.sleep(3000);
		  driver.findElement(By.className("button-1 search-box-button")).sendKeys("books");
		 
	}

}
