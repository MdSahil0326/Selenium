package webElement;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class getDomAttribute {

	public static void main(String[] args)throws Exception {
		//
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement src = driver.findElement(By.id("small-searchterms"));
		System.out.println("--------------getDom------------------");
		System.out.println(src.getDomAttribute("value"));
		System.out.println(src.getDomProperty("value"));
		src.sendKeys("camera");
		System.out.println(src.getDomAttribute("value"));
		System.out.println(src.getDomProperty("value"));
		System.out.println(src.getAttribute("value"));
		//role 
		System.out.println("--------------Role------------------");
		System.out.println(src.getAriaRole());
		System.out.println(src.getAccessibleName());
		System.out.println(driver.findElement(By.cssSelector("[value='Search")).getAriaRole());
		System.out.println(driver.findElement(By.cssSelector("[value='Search")).getAccessibleName());
		
		//size
		System.out.println("--------------SIZE------------------");
		System.out.println(src.getSize());
		System.out.println(src.getSize().getHeight());
		System.out.println(src.getSize().getWidth());
		
		//location
		System.out.println("--------------LOCATION------------------");
		System.out.println(src.getLocation());
		System.out.println(src.getLocation().getX());
		System.out.println(src.getLocation().getY());
		
		
		//getrect
		System.out.println("--------------GET RECT------------------");
		System.out.println(src.getRect());
		System.out.println(src.getRect().getHeight());
		System.out.println(src.getRect().getWidth());
		System.out.println(src.getRect().getX());
		System.out.println(src.getRect().getY());
		
		
		//IsDisplayed
		System.out.println("--------------IS DISPLAYED ------------------");
		System.out.println(src.isDisplayed());
		System.err.println(src.isEnabled());
		WebElement tf1 = driver.findElement(By.id("pollanswers-1"));
		tf1.click();
		System.out.println(tf1.isSelected());
		
		
		
		
		
		
		
		
		
		
	}	
}
