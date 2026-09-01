package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativeXpath_ByIndexing {
		public static void main(String[] args) throws InterruptedException{
			WebDriver driver=  new ChromeDriver();
			driver.manage().window().maximize();
			 driver.get("https://demowebshop.tricentis.com/");
			  Thread.sleep(5000);
		  
		  //driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
		  // method 1 by using the normal indexing 
		  
		  
		  //driver.findElement(By.xpath("(//input[@type=\"radio\"])[last()]")).click();
		  // method 2 by using the last() function to locate the dynamically changing webpage 
		  
		  
		  //driver .findElement(By.xpath("(//a[normalize-space(text())='Books'])[1]")).click();
		  // method 3 by using the normalize-space when the text value contains the spaces in front or the end .
		  
		  //WebElement button1 = driver.findElement(By.xpath("//label[text()='Poor']"));
		  // click only 2nd and 4ht radio button 
		  
		  List <WebElement> Buttons= driver.findElements(By.xpath("(//input[@type='radio'])[position() mod 2=0]"));
		   for(WebElement ele:Buttons ) {
			   ele.click();
			   Thread.sleep(2000);   
		   }
	}
}
