
package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class minimizeWindowMethod  {
	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();//always has to be the first line
		driver.manage().window().maximize();
		 driver.get("https://github.com/");
		Thread.sleep(2000);
		
		
		driver.manage().window().minimize();
		 
		 
		 Thread.sleep(3000);
		 driver.quit();
		 
	}

}
