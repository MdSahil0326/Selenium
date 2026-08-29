package locators;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkTextLocator {
	public static void main(String[] args) throws Exception{
		WebDriver  driver = new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("Build your own expensive computer")).click();
		  String title=driver.getTitle();
		  
		  if (title.equals("Demo Web Shop. Build your own expensive computer")){
			  System.out.println("web page is valid");
			  
		  }
		  else
			  System.out.println("Invalid page ");
	}
}
