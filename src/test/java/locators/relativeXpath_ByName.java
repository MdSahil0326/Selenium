package locators;
	import org.openqa.selenium.By;
	//import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

	public class relativeXpath_ByName {

		public static void main(String[] args) throws InterruptedException{
			WebDriver driver=  new ChromeDriver();
			 driver.get("https://www.instagram.com/?hl=en");
			 driver.manage().window().maximize();
			 Thread.sleep(3000);
			 driver.findElement(By.name("email")).sendKeys("123002312");
			 driver.findElement(By.name("pass")).sendKeys("123456");
			 driver.findElement(By.xpath("//span[text()='Log in']")).click();
			 Thread.sleep(3000);
			 String text=driver.findElement(By.cssSelector("div[class='x78zum5 xdt5ytf']")).getText();
			 System.out.println(text);
			 Thread.sleep(3000);
}
}