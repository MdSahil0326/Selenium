package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickAndHold {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		 WebElement button = driver.findElement(By.id("circle"));
		 Actions act= new Actions(driver);
		 Thread.sleep(2000);
		 act.moveToElement(button).clickAndHold().perform();
		 Thread.sleep(5000);
		 act.moveToElement(button).release().perform();
		 
	}
}
