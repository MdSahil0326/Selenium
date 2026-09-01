package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class relativeXpath_Contains {

		public static void main(String[] args) throws InterruptedException{
			WebDriver driver=  new ChromeDriver();
			 driver.get("https://demowebshop.tricentis.com/");
			 driver.manage().window().maximize();
			 driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
			 Thread.sleep(3000);
			 driver.findElement(By.name("Email")).sendKeys("abc@gmail.com");
			 driver.findElement(By.name("Password")).sendKeys("123456");
			 driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			 Thread.sleep(3000);
			 String text=driver.findElement(By.xpath("//span[contains(text(),'Login was')]")).getText();
			 System.out.println(text);
			 Thread.sleep(3000);
}
}


