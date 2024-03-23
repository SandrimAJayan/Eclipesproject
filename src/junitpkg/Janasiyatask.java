package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasiyatask {
	ChromeDriver driver;
	String baseurl="https://janasya.com/";
	
	@Before
	
	public void setUp() {
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	
	public void fblogin() {
		String act=driver.getTitle();
		System.out.println(act);
		
		
		
		
		driver.findElement(By.xpath("//div[@id='HeaderNavigation']/nav/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/header/div/div/div[3]/div/details-modal/predictive-search/details/summary/form/div[1]/input[1]")).sendKeys("saree");

		driver.findElement(By.xpath("//*[@id=\'Layer_1\']")).click();
		driver.findElement(By.xpath("//*[@id='halo-sidebar']/div[2]/div[1]/div[1]/h3")).click();
		driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[2]/div/ul/li[1]/a/span")).click();
		  

}
}