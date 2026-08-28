package WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSizeMehtod  {
	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();//always has to be the first line
		 driver.get("https://github.com/");
		 
		 
		  
		  driver.manage().window().setSize(new Dimension(999,499));
		  Thread.sleep(3000);
		  Dimension size = driver.manage().window().getSize();
		  System.out.println("Height--> "+size.getHeight());
		  System.out.println("Width:--> "+size.getWidth());
		  
		 
		 Thread.sleep(3000);
		 driver.quit();
		 
	}

}
