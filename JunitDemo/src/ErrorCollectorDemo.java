import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;


public class ErrorCollectorDemo {
	@Rule
	public ErrorCollector collectror=new ErrorCollector();
	
	@Test
	public void example() {
		collectror.addError(new Throwable("There is an error in first line"));
		collectror.addError(new Throwable("There is an error in second line"));
		
		System.out.println("Hello");
		try {
		Assert.assertTrue("A " =="B");	
		} catch (Throwable t) {
			collectror.addError(t);
		}
		System.out.println("World!!!");
	}

}
