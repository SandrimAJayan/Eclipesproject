package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
ChromeDriver driver;
	
	String baseurl ="https://register.rediff.com/register/register.php?FormName=user_details" ;
	
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		
		driver.get(baseurl);
		
	}
@Test
public void rediffdate()
{
	WebElement day =driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
	WebElement month =driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
	WebElement year =driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
	Select daydetails=new Select(day);
	Select monthdetails=new Select(month);
	Select yeardetails=new Select(year);
	daydetails.selectByValue("14");//ALSO HAVE Selectbyindex and selectByvisiabletexr
	monthdetails.selectByVisibleText("DEC");
	yeardetails.selectByIndex(31);
	
	
}
}
