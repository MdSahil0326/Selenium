package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idLocator {
	public static void main(String[] args) throws Exception{
		WebDriver  driver = new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		  Thread.sleep(2000);
		  driver.findElement(By.id("vote-poll-1")).sendKeys("Books");
	}
}
