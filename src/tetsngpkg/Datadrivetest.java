package tetsngpkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadrivetest {
	WebDriver driver;
	@BeforeTest
	
 	public void setup()
{
		driver=new ChromeDriver();
}
@Test
public void datadriven() throws IOException
{
driver.get("https://www.facebook.com");
System.out.println("CHECK");

FileInputStream fi=new FileInputStream("C:\\Users\\SANDRIMA\\OneDrive\\Desktop\\Book2.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(fi);
//System.out.println("CHECK");
XSSFSheet sh=wb.getSheet("Sheet1");
int rowcount=sh.getLastRowNum();
System.out.println(rowcount);
//System.out.println("CHECK");
for(int i=1;i<=rowcount;i++)
{
	System.out.println("CHECK");
String Username= sh.getRow(i).getCell(0).getStringCellValue();
System.out.println("username="+Username);
String password=sh.getRow(i).getCell(1).getStringCellValue();
System.out.println("password="+password);
driver.findElement(By.name("email")).clear();
driver.findElement(By.name("email")).sendKeys(Username);
driver.findElement(By.name("pass")).sendKeys(password);
driver.findElement(By.name("login")).click();
System.out.println("CHECK");
driver.navigate().refresh();
}
}
}
