package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://doodles.google/");
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scrollTo is scroll to the position from the Default POSI (0,0)
		 js.executeScript("window.scrollTo(0,500)");
		 
		 
		 Thread.sleep(2000);
		 //scrollBy it will scroll from the current position 
		 js.executeScript("window.scrollBy(0,1000)");
		 
		// Scroll down by 500px
//		 js.executeScript("window.scrollBy(0, 500);");

		 // Scroll to top
//		 js.executeScript("window.scrollTo(0, 0);");
		 
		 
		 Thread.sleep(3000);
		 //scrollIntoView(true) goes to the element  
		 WebElement element = driver.findElement(By.id("monthDropdown"));
		 js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
	}

}
