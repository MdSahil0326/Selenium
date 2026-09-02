package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class relativeLocator {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=  new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.instagram.com/?hl=en");
		  Thread.sleep(3000);
		  WebElement ref = driver.findElement(By.xpath("//input[@type='password']"));
		  driver.findElement(RelativeLocator.with(By.tagName("input")).above(ref)).sendKeys("12345656");
} 
	}
