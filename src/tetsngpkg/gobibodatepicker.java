package tetsngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gobibodatepicker {
	WebDriver d;
	String baseurl="https://www.goibibo.com/";
	String mandy="August 2024";
	String date="16";
	@BeforeTest
	public void setUp() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		d=new ChromeDriver(options);
	}
	@BeforeMethod 
	public void test()
	{
	  d.get(baseurl);
	  
		d.manage().window().maximize();
}
	

	@Test
	public void scrolldown()
	{
		d.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/span/span")).click();
		d.findElement(By.xpath("/html/body/div/div[4]/div/div/div[1]/div[3]/div/p[2]")).click();
		String my="0";
		while(!mandy.equals(my))
		{
		d.findElement(By.xpath("/html/body/div/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]")).click();
		WebElement cal=d.findElement(By.xpath("/html/body/div/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/div"));
		my=cal.getText();
		System.out.println(my);
		}
		List <WebElement> li = d.findElements(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div/div/p"));
		
		for(WebElement ele:li) {
			System.out.println(ele.getText());
		}
		for(WebElement ele :li)
		{	System.out.println(ele.getText());
			String day=ele.getText();
			System.out.println(day);
			if(day.equals(date))
			{ ele.click();
			}
		}
		System.out.println("Check5");
		//d.findElement(By.xpath("/html/body/div/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div[3]/div[6]/p")).click();
}
}