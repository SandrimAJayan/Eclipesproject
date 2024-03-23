package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ChromeDriver drive =new ChromeDriver();
 drive.get("http://www.google.com");
 String exp="Google";
 String actualtitle=drive.getTitle();
 if(exp.equals(actualtitle))
 {
	 System.out.println("pass");
 }
 else
 {
	 System.out.println("fail");
 }
    drive.quit();
 
	}

}
