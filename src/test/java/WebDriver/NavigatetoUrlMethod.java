package WebDriver;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatetoUrlMethod {
	public static void main(String[] args)throws Exception {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to(new URL("https://www.flipkart.com/"));
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
		
	}
}
