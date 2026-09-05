package Dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.locators.RelativeLocator;


public class SelectDd {
public static void main(String[] args) throws Exception {

	WebDriver driver= new ChromeDriver();
	 
	 driver.manage().window().maximize();
	  
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 
	 driver.get("https://demoapps.qspiders.com/ui/dropdown");
	 
	 WebElement countrycode = driver.findElement(By.id("country_code"));
	  WebElement country = driver.findElement(By.id("select3"));
	  WebElement state = driver.findElement(By.id("select5"));
	  WebElement city = driver.findElement(RelativeLocator.with(By.tagName("select")).toRightOf(state));
	  	 
	 	
	 	Select s1 =new Select(countrycode);
	 	s1.selectByContainsVisibleText("+91");
	 	Thread.sleep(3000);
	 	Select s2 = new Select(country);
	 	s2.selectByContainsVisibleText("India");
	 	Thread.sleep(3000);
	 	
	 	Select s3 = new Select(state);
	 	s3.selectByContainsVisibleText("Karnataka");
	 	Thread.sleep(3000);
	 	
	 	Select s4=new Select(city);
	 	s4.selectByContainsVisibleText("Bellary");
	 	
	
}
}
