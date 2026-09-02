package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathBy_StartsWith {
public static void main(String[] args)throws Exception {
 WebDriver driver= new ChromeDriver();
 driver.get("https://www.amazon.in/");
 driver.manage().window().maximize();
 Thread.sleep(2000);
 driver.findElement(By.name("field-keywords")).sendKeys("Mobile");
 driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute' and @id='nav-search-submit-button']")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//span[starts-with(text(), 'OnePlus Nord CE6 | 8GB+128GB')]/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::input[@type='submit']")).click();
 Thread.sleep(3000);
 driver.findElement(By.xpath("//*[@id='nav-cart-count-container']/span[2]")).click();
 String text=driver.findElement(By.xpath("//*[@id=\"sc-active-14add8c6-8ef8-404f-b13a-0c0bc95eaa35\"]/div[4]/div/div[2]/ul/li/span/a/span[1]/h3/span/span[2]")).getText();
 System.out.println(text);
}
}
