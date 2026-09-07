package webElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		WebElement untf = driver.findElement(By.name("email"));
		WebElement pwtf = driver.findElement(By.name("pass"));
		untf.sendKeys("Gmail.com");
		pwtf.sendKeys("123456");
		Thread.sleep(2000);
		// clear
		untf.clear();
		pwtf.clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
	}

}
