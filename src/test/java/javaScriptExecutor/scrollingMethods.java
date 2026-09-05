package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://doodles.google/");
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//scrollTo is scrollto the position from the Default POSI (0,0)
		 js.executeScript("window.scrollTo(0,500)");
		 
		 
		 Thread.sleep(2000);
		 //scrollBy it will scroll from the current position 
		 js.executeScript("window.scrollBy(0,1000)");
		 
		 
		 js.executeScript("window.scrollIntoView()");
	}

}
