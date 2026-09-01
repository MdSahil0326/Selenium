package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=  new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		  Thread.sleep(3000);
		  //driver.findElement(By.cssSelector("input[type=submit]")).click();
		  //driver.findElement(By.cssSelector("input.button-1.search-box-button")).click();
		  driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Books");
		  
	    
		  

}
}