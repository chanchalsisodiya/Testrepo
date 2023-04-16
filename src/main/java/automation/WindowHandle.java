package automation;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		//to handle alert pop up- accept,dismiss,sendkeys 
		
		//driver.manage().window().maximize();
		String parentWindowID= driver.getWindowHandle();
		System.out.println(parentWindowID);
		WebElement btn= driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
		btn.click();
		Set<String> childwindowID= driver.getWindowHandles();
		
		for(String child:childwindowID) {
			System.out.println(child);
			if (!parentWindowID.equals(child)) {
				
			driver.switchTo().window(child);
		WebElement firstName=	driver.findElement(By.xpath("//input[@id='firstName']"));
				firstName.sendKeys("chanchal");
		}
		
		} 
	}

}
