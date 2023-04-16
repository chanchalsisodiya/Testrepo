package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();

ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");

WebDriver driver = new ChromeDriver(options);
driver.get("https://www.vuse.com/gb/en/customer/account/create/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebElement logoHeading= driver.findElement(By.xpath("//div[@class='login_logo']"));
String logoActual= logoHeading.getText();
System.out.println(logoActual);

String pageTitle= driver.getTitle();
System.out.println(pageTitle);

WebElement test= driver.findElement(By.xpath(""));

WebDriverWait t= new WebDriverWait(driver,Duration.ofSeconds(15));
t.until(ExpectedConditions.visibilityOf(test));
test.click();
	}

}
