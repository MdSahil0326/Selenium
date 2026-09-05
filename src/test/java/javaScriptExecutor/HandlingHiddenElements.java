package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHiddenElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/");
		WebElement ele = driver.findElement(By.xpath("//a[@href='/men-sweaters']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",ele);
		
		/*elements are hidden they are only visible only when we hover it so we should stop the 
		javaScript execution by using the "ctrl+\" and inspect the element and  then with  the
		 help of javaScriptExecutor we can click on the hidden element but we cant do with the help of not methods as they are 
		visible in HTML DOM */
		
		
	
		
	

}
}