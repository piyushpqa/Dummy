package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({"URL","APIKEY/username"})
	@Test (groups={"Smoke"})
	public void WebloginHomeLoan(String url, String key)
	{
		//selenium
		System.out.println("WebloginHomeLoan");
		System.out.println(url);
		System.out.println(key);
	}
	
	@Test
	public void MobileloginHomeLoan()
	{
		//Appium
		System.out.println("MobileloginHomeLoan");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		System.out.println("LoginAPIHomeLoan");
		//REST API
	}

}
