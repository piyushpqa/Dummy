package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class day1 {

		// TODO Auto-generated method stub
@Test	(groups={"Smoke"})
public void Demo()//Demo is Test case name
{
	System.out.println("Hello TestNG");
	Assert.assertTrue(false);//Here assert is used to run the listener failed function testcase
}
@AfterSuite
public void AftSuite()
{
	System.out.println("after suite");
	}
@Test(enabled=false)//to skip the testcase	
public void Demo2()//Demo is Test case name
{
	System.out.println("Hello ");
}
//How to create multiple test in one class?
@Test (dependsOnMethods = {"LoginPage"})	
public void Demo3()//Demo is Test case name
{
	System.out.println("Demo3 ");
}
@Test	
public void Demo4()//Demo is Test case name
{
	System.out.println("Demo4 ");
}
@Test
public void LoginPage()//Demo is Test case name
{
	System.out.println("LoginPage");

}
}
