package takeScreenShot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeElementScreenShot {
	public static void main(String[] args) throws Exception{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.id("nav-logo-sprites"));
		
		File src =ele.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/amazon1.jpg");
		FileHandler.copy(src, dest);

}}
