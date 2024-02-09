package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginUtil {
	
	public static void login(WebDriver driver,String username, String password) {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	
	
}
