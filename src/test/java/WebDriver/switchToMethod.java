package WebDriver;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchToMethod {
	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String parent = driver.getWindowHandle();
		Thread.sleep(10000);
		
		Set<String> all_ids = driver.getWindowHandles();
		
		all_ids.remove(parent);
		
		for(String id : all_ids) {
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
		}
		driver.quit();
	}
}
