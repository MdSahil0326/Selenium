package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class absoluteXpath {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=  new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 Thread.sleep(3000);
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[5]/div/div[2]/div[3]/div[2]")).click();
		 Thread.sleep(3000);
		 String title= driver.getTitle();
		 System.out.println(title);
	     
	     if(title.equals("Demo Web Shop. Build your own computer")){
	    	 System.out.println("Page is correct");
	     		}
	     else{
	    	 System.out.println("Incorrect page");
	    	 }
	     
	     
	     
	}
}
