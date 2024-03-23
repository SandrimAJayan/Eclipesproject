package junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import org.junit.Test;
public class Linkvalidation {
	String link ="http://www.google.com";
	@Test
	public void test()
	{
		try {
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			int code=con.getResponseCode()  ;
			System.out.println(code);
			if(code==200)
			{
				System.out.print("respose code is 200 successful");
			}
			else
			{
				System.out.println("not expected");
			}
			
		}catch(Exception e)
		{
			System.out.println("aaaa"+e.getMessage());
		}
	}

}
