package test;
import org.testng.ITestListener;
import org.testng.ITestContext ;		
import org.testng.ITestResult ;	

//ITestListener is an interface  which IMPLEMENTS TESTNG listeners.
public class Listeners implements ITestListener {
	
	@Override		
    public void onTestFailure(ITestResult result) {		//execute when test fails			
        // TODO Auto-generated method stub				
        //screenshot code 
		//response if API failed
		System.out.println("Testcase FAILED Listeners code."+ result.getName()); //Print failed Testcase name in the output
    }		

    @Override		
    public void onTestSkipped(ITestResult result) {	//execute when test skips					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestStart(ITestResult result) {	//execute when test starts					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult result) {	//execute when test passed					
        // TODO Auto-generated method stub				
    	System.out.println("Successfully passed Listeners Pass code");  		
    }	
}
