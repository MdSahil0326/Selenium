package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		 WebElement button = driver.findElement(By.id("btn_a"));
		 
		 Actions act= new Actions(driver);
		 Thread.sleep(2000);
		 act.contextClick(button).perform();
		 Thread.sleep(2000);
		 WebElement button1 = driver.findElement(By.cssSelector("[class='py-1 ps-1 hover:bg-orange-300']"));
		 act.click(button1).perform();
				 
	}


}
