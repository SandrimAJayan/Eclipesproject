package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alertprg {
    ChromeDriver driver;
    String baseurl="file:///C:/Users/SANDRIMA/OneDrive/Desktop/selenum%20files/allert.html";

 @Before
 public void setup()
 {
 driver= new ChromeDriver();
 driver.get(baseurl); 
 }
 @Test
 public void titleverification()
 {
	 driver.findElement(By.xpath("/html/body/input[1]")).click();
	Alert a =driver.switchTo().alert();
	 a.accept();//to accept or approve alert....
	   //a.dismiss(); to cancel alert 
	 driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("ISHAAN");
	 
	 driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("KRISHNA");
	 driver.findElement(By.xpath("/html/body/input[4]")).click();
}
}