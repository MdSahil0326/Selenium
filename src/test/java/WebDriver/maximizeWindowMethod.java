package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeWindowMethod  {
	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();//always has to be the first line
		
		driver.manage().window().maximize();//always has to be the 2nd line in the code 
		
		driver.get("https://github.com/");
		 Thread.sleep(3000);
		 driver.quit();
		 
	}

}
