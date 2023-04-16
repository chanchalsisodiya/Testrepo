package automation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//to handle alert pop up- accept,dismiss,sendkeys 
		
		driver.manage().window().maximize();
    //WebElement jsButton= driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
    //jsButton.click();
    //driver.switchTo().alert().accept();
    
    //Alert alert= driver.switchTo().alert();
    //alert.accept();
    //WebElement btn2= driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
    //btn2.click();
    //driver.switchTo().alert().dismiss();
		
		WebElement btn3= driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		btn3.click();
		Alert alert= new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
		
		
		alert.sendKeys("Manish");
		alert.accept();
    
	}

}
