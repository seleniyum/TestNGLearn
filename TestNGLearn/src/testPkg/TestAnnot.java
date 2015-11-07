package testPkg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestAnnot {
	
	@BeforeSuite
	public void installsoftware()
	{
	    //This executes First before class
	    System.out.println("Before Suite");
	}
	@AfterSuite
	public void uninstallsoftware()
	{
	    System.out.println("After Suite");
	}
}
