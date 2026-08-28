package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandleMethod {
	public static void main(String[] args) {
		
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	String p= driver.getWindowHandle();
	System.out.println(p);
	}

}
