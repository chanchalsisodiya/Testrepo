package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.vuse.com");
		driver.manage().window().maximize();
	WebElement logoHeading=driver.findElement(By.xpath("//img[@class='pagebuilder-mobile-hidden']"));
	String logoActual=logoHeading.getText();
	System.out.println(logoActual);
	driver.close();
	}

}
