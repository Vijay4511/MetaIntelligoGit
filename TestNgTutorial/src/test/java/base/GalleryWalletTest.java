package base;

import org.testng.annotations.Test;

public class GalleryWalletTest {

	@Test(groups= {"Regression"})
	public void ViewGallery()
	{
		System.out.println("ViewGallery");
	}
	@Test(groups= {"smoke"})
	public void ViewWalletinfo()
	{
		System.out.println("ViewWalletinfo");
	}
	
	//To run multiple test cases
	///To run a group of related test cases
}
