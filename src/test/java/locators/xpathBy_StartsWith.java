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
 driver.findElement(By.xpath("//span[starts-with(text(), 'OnePlus Nord CE6')]")).click();
}
}
