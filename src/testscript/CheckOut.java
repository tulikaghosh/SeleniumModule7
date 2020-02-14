package testscript;

import org.testng.annotations.Test;

import generic.BaseTest;

import pompages.HomePage;

public class CheckOut extends BaseTest
{
	
	HomePage homepage = null;
	
	
	@Test
	public void TC_01_Login()
	{
		homepage = new HomePage(driver);
		
		
		try
		
		 {
			 
			 homepage.Crossx();
			 homepage.Search();
			 homepage.SearchButton();
			 homepage.BookLink() ;
			 homepage.ButtonAdd();
			 homepage.ButtonOrder();
			 homepage.EmailID();
			 homepage.PhoneNO();
			 homepage.ButtonContinue();
			 
			 System.out.println("TC_01_Login executed successfully") ;
		
		}
		catch(Exception e)
		{
		    System.out.println("TC_01_Login fail"+e) ;
}
}
	}