package webElement;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submitButton {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
//		WebElement stf = driver.findElement(By.id("small-searchterms"));
//		Thread.sleep(2000);
//		stf.sendKeys("CPU");
//		Thread.sleep(2000);
//		stf.submit();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.className("ico-login")).getText());
		
		
	}
	

}
