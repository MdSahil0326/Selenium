package locators;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class tagName {
public static void main(String[] args)throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	int count= links.size();
	System.out.println(count);
	for(WebElement ele : links) {
		System.out.print(ele.getText());
	}
	driver.quit();
}
}
