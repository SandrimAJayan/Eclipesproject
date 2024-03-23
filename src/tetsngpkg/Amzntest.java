package tetsngpkg;


import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Amzntest {
	
	WebDriver d;

	@BeforeTest
	public void beforeTest() {
		
		d=new ChromeDriver();
		d.manage().window().maximize();
	}

	@Test
	public void test() throws InterruptedException {
		
		String Rtitle="Amazon.in : Mobiles";
		d.get("https://www.amazon.in/"); 
		String parentwindow=d.getWindowHandle();
		System.out.println("Window Title "+ d.getTitle());
		d.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobiles",Keys.ENTER);
		System.out.println("Window Title "+ d.getTitle());
		if(Rtitle.equalsIgnoreCase(d.getTitle())) {
			System.out.println("Title Verified OK");
		}
		else {
			System.out.println("Title Not OK");
		}
		
		d.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		Set<String> allWindowHandles = d.getWindowHandles();
		String Window1=d.getWindowHandle();

		System.out.println("Check 2");
		for(String handle : allWindowHandles) {

			System.out.println("check 3");
				
		if(!handle.equalsIgnoreCase(parentwindow)) {
			d.switchTo().window(handle);

			System.out.println("check 4");

			WebElement Element =d.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input"));
		
		JavascriptExecutor js=(JavascriptExecutor) d;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		//WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(80));
		
		//System.out.println("Check 5");
		
		//Thread.sleep(2000);
		
		
		
		//d.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[1]/div/div[2]/div[4]/div[4]/div/form/div/div[1]/span/span/span/input")).click();
		

		//Thread.sleep(2000);
		//js.executeScript("window.scrollBy(300,0)","");
		//Keys.press(Escape);
		//d.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
		//d.close();
		//d.switchTo().window(parentwindow);      
		
		}
	//	System.out.println("Check 6");
		

	}
}
}

