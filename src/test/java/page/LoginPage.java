package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

//public class LoginPage {
//	
//	WebDriver driver;
//	
//	public void launchURL() {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");
//
//	     driver = new ChromeDriver(options);
//		
//		driver.get("https://www.saucedemo.com/");
//	}
//	
//	public void userLogin() {
//		
//		WebElement userName=  driver.findElement(By.xpath("//input[@id='user-name']"));
//    userName.sendKeys("standard_user");
//    WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
//	
//    password.sendKeys("secret_sauce"
//	}
//	
//	public void clickOnLoginButton() {
//		WebElement loginBtn= driver.findElement(By.xpath("//input[@id='login-button']"));
//		loginBtn.click();  
//	}
//
//}

public class LoginPage extends Base{
	
	public void userLogin(String uname, String pas) {
		
		WebElement userName = getWebDriver().findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys(uname);
		WebElement pass = getWebDriver().findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys(pas);
	}
	public void clickOnLoginButton() {
		WebElement loginBtn = getWebDriver().findElement(By.xpath("//input[@id='login-button']"));
		loginBtn.click();
		
	}
	public void launchURL() {
		setup();
		
	}
}