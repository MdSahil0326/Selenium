package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getUrlMethod {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://github.com/");
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		 String url=driver.getCurrentUrl();
		 System.out.println(url);
	}

}
