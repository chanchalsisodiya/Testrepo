package automation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");

WebDriver driver = new ChromeDriver(options);

driver.get("https://www.saucedemo.com/");
driver.manage().window().maximize();

WebElement logoHeading= driver.findElement(By.xpath("//div[@class='login_logo']"));
String logoActual= logoHeading.getText();
System.out.println(logoActual);

String pageTitle= driver.getTitle();
System.out.println(pageTitle);

//assert.assertEquals("Swag Labs",logoActual );   validation

WebElement userName=  driver.findElement(By.xpath("//input[@id='user-name']"));

userName.sendKeys("standard_user");

WebElement password= driver.findElement(By.xpath("//input[@id='password']"));

password.sendKeys("secret_sauce");

WebElement loginBtn= driver.findElement(By.xpath("//input[@id='login-button']"));
loginBtn.click();

driver.close();

}

	
}
