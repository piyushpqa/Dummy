package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 
{
	
@Test (groups={"Smoke"})//to run specific testcase from different class using Group tag

public void ploan()
{
	System.out.println("ploan");
	System.out.println("aloan");
	System.out.println("bloan");
	System.out.println("cloan");
	}
@BeforeTest
public void prerequisite()
{
	System.out.println("I will execute first");
	}

@AfterTest
public void lastexecution()
{
	System.out.println("I will execute last");
	}
}
