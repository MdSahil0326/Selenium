package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollToOffset {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://www.amazon.in/");
		 Thread.sleep(2000);
		 WebElement element = driver.findElement(By.xpath("//span[text()='Popular smartphone brands']"));
		 Thread.sleep(2000);
		 Actions act= new Actions(driver);
		 Thread.sleep(2000);
		 //act.scrollByAmount(0,1500).perform();
		 //it performs the scroll to (int x offset , int y offset);
		 act.scrollToElement(element).perform();
	}


}
