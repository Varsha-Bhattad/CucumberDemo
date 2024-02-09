package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.LoginUtil;

public class DemoSteps {
public WebDriver driver;	
	

@Given("the user will navigate to site {string}")
public void the_user_will_navigate_to_site(String Url) {
	try {
		driver = new ChromeDriver();
		System.out.println(Url);
		//if (Url=="TestApp")
		//{
		  String url = "https://www.saucedemo.com/";
		  driver.get(url); 
		//}
		
		driver.manage().window().maximize();
	} catch (WebDriverException e) {
		System.out.println("Driver Exception" + e);
	}
}


@When("User login into application with {string} and password {string}")
public void user_login_into_application_with_and_password(String username, String password) {
	
	LoginUtil.login(driver,username, password);
	
//	driver.findElement(By.id("user-name")).sendKeys(username);
//	driver.findElement(By.id("password")).sendKeys(password);
}

@Then("the user should be logged in")
public void the_user_should_be_logged_in() {
	driver.findElement(By.cssSelector(".submit-button")).click();

}
	
@When("user adds an item to the cart")
public void user_adds_an_item_to_the_cart() {
	driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
}



@Then("Item will be added to the cart")
public void itemAdded() {
	driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
}

@And("User clicks on checkout")
public void user_clicks_on_checkout() {
    
	driver.findElement(By.id("checkout")).click();
}

	
}

