package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToOffset {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		 
		 WebElement button= driver.findElement(By.id("btn"));
		 
		 Point offset = button.getLocation();
		 
		 System.out.println(offset.getX());
		 System.out.println(offset.getY());
		 
		 Actions act= new Actions(driver);
		 
		 Thread.sleep(2000);
		 act.moveByOffset(386,189).click().build().perform();
		 
	}

}
