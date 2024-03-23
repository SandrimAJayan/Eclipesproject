package junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JaihobayallLink {
	ChromeDriver chunnu;
	String googleurl="https://jaihobay.com/";
	@Before
	public void setuo() {
		chunnu=new ChromeDriver();
		chunnu.get(googleurl);
	}
	@Test
	public void googlelinksvalidation()
	{
		
		int x=0;
		List<WebElement> stacks=chunnu.findElements(By.tagName("a"));//create an array of webelements to store all the links under tagname a
		System.out.println( "Total link count is "+stacks.size());// size of the array of all links is displayed
		for(WebElement sa:stacks) {//a variable of webelement is create and a loop runs for every element in the array stacks and for each loop the array element is assigned to the variable
		x++;
		System.out.println(x);
		String links=sa.getAttribute("href");// a string variable is defined using the tagname that carries the link
		verifylink(links);// method verify link is invoked using the link copied to the variable
			}
		
	}
	private void verifylink(String links) {
		try {
			URL u=new URL(links);// a variable is defined under type URL using the link
		   HttpURLConnection c=( HttpURLConnection)u.openConnection();// the link is transferred to a variable of HttpURL Connection type
		   if(c.getResponseCode()==200) {
			   System.out.println("Success");}
		   else if(c.getResponseCode()==404) {	   
		       System.out.println("Page not found");
		       }
		   else {
			   System.out.println(c.getResponseCode());
		   }
			   
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		
		
		
	}
	}


