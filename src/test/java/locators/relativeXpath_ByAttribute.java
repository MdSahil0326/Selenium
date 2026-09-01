package locators;

import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativeXpath_ByAttribute {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=  new ChromeDriver();
		 driver.get("https://www.lenskart.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@class='aa-Input']")).sendKeys("Sunglass",Keys.ENTER);
		 Thread.sleep(3000);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 String title= driver.getTitle();
		 System.out.println(title);
	     
	     if(title.equals("Check Out All Sunglasses Promotions at Lenskart for Great Savings")){
	    	 System.out.println("Page is correct");
	     		}
	     else{
	    	 System.out.println("Incorrect page");
	    	 }
	     
	     
	     
	}

}
