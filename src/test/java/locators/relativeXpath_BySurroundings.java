package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativeXpath_BySurroundings {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=  new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
		  Thread.sleep(5000);
		  //driver.findElement(By.xpath("//label[text()='Poor']/..//input[@type='radio']"));
         driver.findElement(By.xpath("//a[text()='Simple Computer']/../..//input[@value='Add to cart']")).click();
}
}