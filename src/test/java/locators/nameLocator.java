package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameLocator {
	public static void main(String[] args) throws Exception{
		WebDriver  driver = new ChromeDriver();
		 driver.get("https://www.instagram.com/?hl=en");
		  Thread.sleep(2000);
		  driver.findElement(By.name("email")).sendKeys("Books");
	}
}
