package Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropDown {
	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.com/");
		//identify the search text field 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Hotwheels");
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.cssSelector("[role='gridcell']"));
		Thread.sleep(2000);
		 for(WebElement ele: suggestions) {
			 //System.out.println(ele.getText());
			 if (ele.getText().contains("hotwheels f1"));
			 ele.click();
		 }
}}
