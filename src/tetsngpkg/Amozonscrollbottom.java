package tetsngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amozonscrollbottom {
	WebDriver d;

	@BeforeTest
	public void beforeTest() {
		
		d=new ChromeDriver();
		d.manage().window().maximize();
	}

	@Test
	public void scrolldown()
	{
		
		d.get("https://www.amazon.in/"); 
		WebElement Element =d.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[8]/div/div/div[1]/span/a"));
		JavascriptExecutor js= (JavascriptExecutor) d;
		//js.executeScript("window.scrollBy(0,2000)", "");// scroll by pixel value
		d.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[8]/div/div/div[1]/span/a")).click();
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); // Full page scroll
		js.executeScript("arguments[0].scrollIntoView();", Element); //scroll until a particular element is visible

		d.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[8]/div/div/div[1]/span/a")).click();
	}
}
