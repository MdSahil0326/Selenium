package locators;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class fluentWait {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		 driver.get("https://www.shoppersstack.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//button[@name='loginBtn']")).click();
		 driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("psai77273@gmail.com");
		 driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Love@3439");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 driver.findElement(By.xpath("//img[@alt='Apple AirPods (2nd Generation)']")).click();
		 driver.findElement(By.xpath("//input[@name='Check Delivery']")).click();
		 driver.findElement(By.xpath("//input[@name='Check Delivery']")).sendKeys("583123");
		 WebElement ref = driver.findElement(By.xpath("//button[@name='Check']"));
		  
	    FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver);
	    wait.pollingEvery(Duration.ofMillis(200));
	    wait.ignoring(TimeoutException.class);
	    wait.withMessage("Element is not Clickable");
	    wait.withTimeout(Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(ref));
	    ref.click();
	    
	    
	}


}
