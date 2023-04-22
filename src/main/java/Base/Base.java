package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	static Properties prop; 
	
	static {
		
	
	try {
			FileInputStream file= new FileInputStream("C:\\Users\\Chanchal Rajput\\automation work\\com.hafele\\Data\\Testdata.properties");
			 prop= new Properties();
			try {
				prop.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void selectByVisibleText(WebElement ele, String value) {
		Select s= new Select(ele);
		s.selectByVisibleText(value);
	}
	
	public void executorClick(WebElement ele) {
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", ele);
		jse.executeScript("arguments[0].click()",ele);
	}
	
	public void scrollElementIntoView(WebElement e) {
		//wait.until(ExpectedConditions.presenceOfElementLocated(by));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()", e);
	}
	
	public void setup() {
		String BrowserName= prop.getProperty("Browser");
		if(BrowserName.equals("chrome")) {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");

		 driver = new ChromeDriver(options);
		}else if(BrowserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
		
		//driver.get("https://www.flipkart.com/");
		//driver.manage().window().maximize();
	}
 public WebDriver getWebDriver() {
	 
	 return driver;
 }
	
}
