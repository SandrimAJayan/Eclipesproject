package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instaxpath {
 ChromeDriver driver;
 String baseurl="https://www.instagram.com/";
  
 @Before
  public void setup()
  {
	 driver=new ChromeDriver();
	 driver.get(baseurl);
  }
 @Test
 public void instalogin() throws InterruptedException
 
 {
	 //Thread.sleep(1000);
	 driver.findElement(By.xpath("//form[@ id='loginForm']/div/div[1]/div/label/input")).sendKeys("abc@gmail.com");
	 driver.findElement(By.xpath("//form[@ id='loginForm']/div/div[2]/div/label/input")).sendKeys("asdghxjksjk");
	 driver.findElement(By.xpath("//form[@id='loginForm']/div/div[3]/button")).click();
	 
	 Thread.sleep(10000); 
 
}
 @After
 public void setup1()
 {
	 driver.close();
	 
 }
 
}