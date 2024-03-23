package tetsngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediftestng {
String baseurl="https://www.rediff.com/";
ChromeDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	
}

@BeforeMethod
public void loading()
{
	driver.get(baseurl);
	
}
@Test
public void titleverification()
{
 String actualtitle=driver.getTitle();
 String expectedtitle="rediffmail";
 if(actualtitle.equalsIgnoreCase(expectedtitle))
 {
	 System.out.println("pass");
 }
 else
 {
	 System.out.println("fail");
 }

}
@Test
public void logodisplay()
{
//	boolean logo= driver.find
}
}
