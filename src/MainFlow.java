import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MainFlow {
	static WebDriver driver ;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver= new FirefoxDriver();
		System.out.println("Opening the browser");
		driver.get("http://www.retailmenot.com");
		driver.findElement(By.cssSelector("span.button-close.js-close")).click();
		driver.findElement(By.linkText("Coupons")).click();
		driver.findElement(By.linkText("Product Deals")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[2]")).click();		
	}

}
