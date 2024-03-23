package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {
	WebDriver Driver;  

	By fbemail=By.id("email");
	By fbpassword=By.id("pass");
	By fblogin=By.name("login");
	
	public  Fbloginpage(WebDriver Driver)
	{
		this.Driver=Driver;
	}
	
	public void setvalues(String email,String password)
	{
		Driver.findElement(fbemail).sendKeys(email);
		Driver.findElement(fbpassword).sendKeys(password);
	}
	
	public void login()
	{
		Driver.findElement(fblogin).click();
		
	}
}
