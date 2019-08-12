package revision.collectiontopics;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Itestlischeck implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test was success" +result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed" +result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped" +result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test has started" +context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test has finished" +context.getName());
		
	}

}
