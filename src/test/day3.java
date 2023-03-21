package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("Beforeclass-before exceting any method in the class");
	}
	@AfterClass
	public void Afterclass()
	{
		System.out.println("Afterclass-after exceting all the method in the class");
	}
	@Parameters({"URL"})//THIS IS O NLY FOR WEBLOGINCARLOAN METHOD
	@Test 
	public void WebloginCarLoan(String urlname)
	{
		//selenium
		System.out.println("WebloginCarLoan");
		System.out.println(urlname);
		//driver.get("URL"); In real coding pass URL name here
	}
	@BeforeMethod
	public void BMethod()
	{
		System.out.println("BeforeMethod");
	}
	@Test (dependsOnMethods = {"MobilesigninlogincarLoan"})	
	public void MobilelogincarLoan()
	{
		//Appium
		System.out.println("MobilelogincarLoan");
	}
	
	@BeforeSuite
	public void BSuite()
	{
		System.out.println("BSuite");
	}
	@AfterMethod
	public void AMethod()
	{
		System.out.println("AfterMethod");
	}
	@Test
	public void MobilesigninlogincarLoan()
	{
		//Appium
		System.out.println("MobilesigninlogincarLoan");
	}
	@Test(dataProvider="getData")
	public void MobilesignoutlogincarLoan(String username, String password)
	{
		//Appium
		System.out.println("MobilesignoutlogincarLoan");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test
	public void MobileguestlogincarLoan()
	{
		//Appium
		System.out.println("MobileguestlogincarLoan");
	}
	
	@Test
	public void LoginAPIcarLoan()
	{
		System.out.println("LoginAPIcarLoan");
		//REST API
	}
	@DataProvider
	public Object[][] getData()//this function gives data to the entire testcases to run
	{//1st combination - username &password - good credit history
		//2nd combination-username &password - no credit history
		//3rd combination-username &password - fraudulent credit history
		Object[][] data =new Object[3][2];//creating multidimensional OBJECT array 
		 //3refers to->3 combination & 2 refers to -> values username & password,3rows and 2 columns
		//1st set
		data[0][0]="firstsetusername";
		data[0][1]="FIRSTpassword";
		//columns in the row are nothing but the values for that particular combination(row) 
		
		//2nd set
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
	}
	

}
