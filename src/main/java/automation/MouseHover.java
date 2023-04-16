package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		
	WebElement test= driver.findElement(By.xpath("//span[@class='nav_item_name']"));
	Actions a= new Actions(driver);
	a.moveToElement(test);
	a.contextClick(test).build().perform();
	
	
		
	

	}

}
