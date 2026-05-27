package itestListenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListnerClass implements ITestListener {

	 public void onTestStart(ITestResult result) {
		 System.out.println("Test execution is started.......");
	  }
	
	 public void onTestSuccess(ITestResult result) {
		 System.out.println("Test success.......");	  }
	
	 public void onTestFailure(ITestResult result) {
		 System.out.println("Test failed.......");	  }
	
	 public void onTestSkipped(ITestResult result) {
		 System.out.println("Test skipped.......");	  }

	
	 public void onStart(ITestContext context) {
		 System.out.println("Tests starts.......");	  }

	
	 public void onFinish(ITestContext context) {
		 System.out.println("Test is finished.......");	  }
}
