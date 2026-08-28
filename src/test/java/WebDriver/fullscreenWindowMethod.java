
package WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fullscreenWindowMethod  {
	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();//always has to be the first line
		 driver.get("https://github.com/");
		 
		driver.manage().window().fullscreen();
		 
		 Thread.sleep(3000);
		 driver.quit();
		 
	}

}
