package tetsngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Signupexcersice {
	public class Copypaste {
		ChromeDriver driver;
		String baseurl="https://automationexercise.com/login";
	@BeforeTest
	public  void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void usersignup()
	{
		driver.findElement(By.name("name")).sendKeys("sandrima jayan");
		driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]")).sendKeys("ishaankrishna@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();
		WebElement rbutton=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/div[1]/div[2]/label"));
		rbutton.click();
		driver.findElement(By.id("password")).sendKeys("ishaan");

		WebElement day =driver.findElement(By.xpath("//*[@id=\"days\"]"));
		WebElement month =driver.findElement(By.xpath("//*[@id=\"months\"]"));
		WebElement year =driver.findElement(By.xpath("//*[@id=\"years\"]"));
		Select daydetails=new Select(day);
		Select monthdetails=new Select(month);
		Select yeardetails=new Select(year);
		daydetails.selectByValue("14");//ALSO HAVE Selectbyindex and selectByvisiabletexr
		monthdetails.selectByVisibleText("March");
		yeardetails.selectByIndex(1);
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("ishaan");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Krishna"); 
	}
	}
}
	