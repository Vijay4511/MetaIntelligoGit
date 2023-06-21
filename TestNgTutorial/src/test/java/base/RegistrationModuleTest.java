package base;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegistrationModuleTest {
	
	
	
	@BeforeTest
	public void DriverInitilization()
	{
		System.out.println("Sign in module Initializing a driver");
	}
	
	@Test(groups= {"smoke"})
	public void SuccessfulRegis()
	{
		System.out.println("SuccessfulRegis");
	}
	@Test(groups= {"Regression"})
	public void NegativeValidLoginFullname()
	{
		System.out.println("NegativeValidLoginFullname");
		
	}
	@Test(groups= {"Regression"})
	public void NegativeValidEmail()
	{
		System.out.println("NegativeValidEmail");
		
	}
	@Test
	public void NegativeValidMobilenum()
	{
		System.out.println("NegativeValidMobilenum");
		
	}
	@Test
	public void NegativeFullname()
	{
		System.out.println("NegativeFullname");
		
	}
	
	public void SpecialCharctervalidation()
	{
		System.out.println("SpecialCharctervalidation");
		
	}

}
