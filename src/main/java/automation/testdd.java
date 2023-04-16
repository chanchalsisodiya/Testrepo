package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testdd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");

	WebDriver driver = new ChromeDriver(options);
	driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
	driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	driver.manage().window().maximize();
WebElement dropdown= driver.findElement(By.xpath("//select[@id='course']"));
Select s= new Select(dropdown);
//s.selectByIndex(2);
s.selectByValue("https://www.hyrtutorials.com/search/label/TechNews");   
//s.selectByVisibleText("Java");
//WebElement dropdown= driver.findElement(By.xpath("//button[@class='btn btn-default dropdown-toggle']"));
//List<WebElement> dropdownlist= driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));

//for(WebElement test :dropdownlist) {
	//dropdown.click();
	//String value= test.getText();
	//System.out.println(value);
	//test.click();
//}
//Thread.sleep(3000);
}
	
	}


