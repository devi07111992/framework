package week5.day1hw;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class TestNGListeners implements IAnnotationTransformer,IRetryAnalyzer {
  int iMaxRetry =1;
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, 
			Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(this.getClass());
		annotation.setInvocationCount(1);
		if(!testMethod.getName().equalsIgnoreCase("creatLead"))
		{
			annotation.setEnabled(false);
		}
		}
	@Override
	public boolean retry(ITestResult result) {
		if(!result.isSuccess() && iMaxRetry<2 )
{
			iMaxRetry++;
		 return true;
}else
{
	return false;
}
		
	}
}
		
	
