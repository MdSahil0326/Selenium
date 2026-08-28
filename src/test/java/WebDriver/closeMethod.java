package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeMethod {
	public static void main(String[] args) throws Exception{
		WebDriver driver=new ChromeDriver();
		 driver.get("https://github.com/");
		 
		 Thread.sleep(2000);
		 
		 driver.close();
	}

}
