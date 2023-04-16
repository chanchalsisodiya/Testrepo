package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import page.LoginPage;

public class LoginPageSteps {
	
	//WebDriver driver;
	
	LoginPage login= new LoginPage(); 
//	
//	@Given("User launch site URL")
//	public void User_launch_site_URL() {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");
//
//    driver = new ChromeDriver(options);
//		
//		driver.get("https://www.saucedemo.com/");
//	}
//@When("user enters correct username and correct password")
//public void user_enters_correct_username_and_correct_password() {
//	
//	WebElement userName=  driver.findElement(By.xpath("//input[@id='user-name']"));
//    userName.sendKeys("standard_user");
//    WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
//
//    password.sendKeys("secret_sauce");
//    
//}
//@And("click on login button")
//public void click_on_login_button( ) {
//	
//	WebElement loginBtn= driver.findElement(By.xpath("//input[@id='login-button']"));
//	loginBtn.click();
//
//}
@Given("User launch site URL")
public void User_launch_site_URL() {
	
	login.launchURL();
}
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
   // WebDriverManager.chromedriver().setup();
	//ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");

    // driver = new ChromeDriver(options);
	
	//driver.get("https://www.saucedemo.com/");

//@When("user enters correct username and correct password.")
//public void user_enters_correct_username_and_correct_password() {
	
//	login.userLogin();
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
   // WebElement userName=  driver.findElement(By.xpath("//input[@id='user-name']"));
 //userName.sendKeys("standard_user");
 //WebElement password= driver.findElement(By.xpath("//input[@id='password']"));

 // password.sendKeys("secret_sauce");

@And("click on login button")
public void click_on_login_button() {
	
	login.clickOnLoginButton();
}
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();

	//WebElement loginBtn= driver.findElement(By.xpath("//input[@id='login-button']"));
//loginBtn.click();  


@When("^user enter correct \"([^\"]*)\" and correct \"([^\"]*)\"$")
public void user_enter_correct_and_correct(String username, String password) {
	login.userLogin(username, password);

}

}
