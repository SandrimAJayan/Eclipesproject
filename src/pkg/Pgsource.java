package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pgsource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String baseural="https://www.google.com";
		ChromeDriver driver=new ChromeDriver();   
		driver.get(baseural);
		String src=driver.getPageSource();
		if(src.contains("Gmail")) {
			System.out.println("gmail text is pesent");
			
		}
		
		else {
			 System.out.println("gmail text is not present");
		}
		driver.quit();                         

	}

}
