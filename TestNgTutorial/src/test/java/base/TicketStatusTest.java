package base;

import org.testng.annotations.Test;

public class TicketStatusTest {
	
	@Test(groups= {"Regression"})
	public void TicketEnquiry()
	{
		System.out.println("TicketEnquiry");
	}
	
	@Test(groups= {"smoke"})
	public void TransactionStatus()
	{
		System.out.println("TransactionStatus");
	}
	
	@Test(groups= {"Regression"})
	public void ServiceStatus()
	{
		System.out.println("ServiceStatus");
	}

}
