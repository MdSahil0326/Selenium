package WebDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandleMethod {
	public static void main(String[] args)throws Exception {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	String p= driver.getWindowHandle();//only used to get the parent session id 
	System.out.println(p);
	Thread.sleep(5000);
	Set<String> all_id = driver.getWindowHandles();// give all the tab / windows session id present in browser 
	System.out.println(all_id);
	driver.quit();

	}
}
