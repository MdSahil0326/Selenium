package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinkText {
	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 Thread.sleep(3000);
		 driver.findElement(By.partialLinkText("awesome")).click();//only partial  name can be passed it take the first come first serve 
	}
}
