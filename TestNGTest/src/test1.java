import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
public class test1 {
	DemoClass demoClass = new DemoClass();

	@Test(groups = {"tests"})
	public void test() {
		System.out.println("HRHRH");
	}
	
	@Test(groups = {"tests", "positive"})
	public void positiveTest() {
		boolean result = demoClass.isInteger(12);
		AssertJUnit.assertTrue(result);
	}
	
	@Test(groups = {"tests", "positive"})
	public void positiveTest2() {
		boolean result = demoClass.isInteger(0);
		AssertJUnit.assertTrue(result);
	}
	
	@Test(groups = {"tests", "negative"})
	public void negativeTest() {
		boolean result = demoClass.isInteger(12.232);
		AssertJUnit.assertFalse(result);
	}
	
	@Test(groups = {"tests", "negative"})
	public void negativeTest2() {
		boolean result = demoClass.isInteger(-0.1);
		AssertJUnit.assertFalse(result);
	}
	
}