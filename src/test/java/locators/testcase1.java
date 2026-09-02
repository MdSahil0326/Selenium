package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {
	public static void main(String[] args)throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@role='button']")).click();
		int count= links.size();
		System.out.println(count);
		Thread.sleep(5000);
		for(WebElement ele : links) {
			String text=ele.getText();
			System.out.print(text);
		}
		Thread.sleep(2000);
		for(WebElement ele1 :links) {
			if(ele1.getText().equals("Gift Cards")) {
				ele1.click();
			}
		}
}}
