package WebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPositionMehtod {
	public static void main(String[] args) throws Exception{
	 WebDriver driver= new ChromeDriver();
	 driver.get("https://github.com/");
	 
//	 driver.manage().window().maximize();
	 //driver.manage().window().fullscreen();
	 //driver.manage().window().minimize();
	 
	 //this prints the top left corner coordinates
	 //Point position = driver.manage().window().getPosition();
	 driver.manage().window().setPosition(new Point(10, 40));
	 
	 //System.out.println(position);
	 
	 Thread.sleep(2000);
	 driver.quit();
	 
	}

}
