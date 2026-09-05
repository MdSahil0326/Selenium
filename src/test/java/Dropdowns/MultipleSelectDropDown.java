package Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectDropDown {
	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		 //identify the element 
		 WebElement ref = driver.findElement(By.id("select-multiple-native"));
		 Select s= new Select(ref);
		 
		 
		 //selection 
		 s.selectByIndex(0);
		 Thread.sleep(2000);
		 s.selectByValue("Mens Casual Premium Slim Fit T-Shirts ");
		 s.selectByVisibleText("Mens Cotton Jacket...");
		 s.selectByContainsVisibleText("Mens Casual Slim Fit...");
		 Thread.sleep(5000);
		 
		 //retrival
		 List<WebElement> alloptions = s.getOptions();
		 for(WebElement ele : alloptions) {
			 System.out.println(ele.getText());
		 }
		 
		 System.out.println();
		 //only selected options 
		  List<WebElement> selected = s.getAllSelectedOptions();
		  for(WebElement ele: selected) {
			  System.out.println("Selected options  = "+ele.getText());
		  }
		  s.deselectByIndex(0);
		  s.deselectByValue("Mens Casual Premium Slim Fit T-Shirts ");
		  s.deselectByVisibleText("Mens Cotton Jacket...");
		  s.deSelectByContainsVisibleText("Mens Casual Slim Fit...");
		  
		 
		 
		 
		 
		 
	}

}
