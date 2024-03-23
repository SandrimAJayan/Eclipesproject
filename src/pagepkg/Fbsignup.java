package pagepkg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbsignup {

	WebDriver Driver;
	By create=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By su=By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");
	public Fbsignup(WebDriver Driver)
	{
		this.Driver=Driver;
	}
	
	public void cp()
	{
		Driver.findElement(create).click();
	}
	public void signup()
	{Driver.findElement(su).click();}
	
}
