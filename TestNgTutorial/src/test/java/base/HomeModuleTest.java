package base;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeModuleTest {
	
	@BeforeTest
	public void HomeDriverInitilization()
	{
		System.out.println("Home module DriverInitialisation");
	}
	
	@Test(groups= {"Regression"})
	public void SearchBuses()
	{
		System.out.println("SearchbusesTestcase");
	}
	
	@Test(groups= {"smoke"})
	public void BookTicket()
	{
		System.out.println("BookticketTestcase Executed Successfully");
	}
	
	

}
