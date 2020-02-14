package pompages;

import generic.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage
{
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	 private WebElement cross; 
	
	@FindBy(xpath="//input[@name='q']")
	 private WebElement sendKey_search; 
	
	@FindBy(xpath="//button[@class='vh79eN']")
	 private WebElement bnt_search;
	
	
	@FindBy(xpath="//div[@data-id='9789332526297']")
	 private WebElement lnk_book; 
	

	@FindBy(xpath="//button[@class='__2AkmmA _2Npkh4 _2MWPVK']")
	 private WebElement btn_Add;
	
	@FindBy(xpath="//button[@class='_2AkmmA iwYpF9 _7UHT_c']")
	 private WebElement btn_order;
	 

	@FindBy(xpath="//input[@class='_2zrpKA _3X0qwn']")
	 private WebElement sendKey_email;
	
	@FindBy(linkText="CONTINUE")
	 private WebElement bnt_continue;
	

	@FindBy(xpath="//div[@class='_39M2dM _2gCfOf']")
	 private WebElement sendKey_phoneNo;
	
	@FindBy(xpath="//button[@class='_2AkmmA T7K48m _7UHT_c']")
	 private WebElement bnt_login;
	
	
	 
	public HomePage(WebDriver driver)
	 {
		 super(driver);
		 PageFactory.initElements(driver,this);
	 }
	public void Crossx()
	 {
		 try
		 {
		    verifyElementPresent(cross);
		    cross.click();
			log.info(" successfull "+ cross);
			 
				 }
				 
		 catch(Exception e)
		 {
			log.error("Unable to click on"+ e); 
		 }
			 }
	 public void Search()
	 {
		 try
		 {
		    verifyElementPresent(sendKey_search);
		    sendKey_search.sendKeys("Selenium Book");
			log.info("SendKey successfully "+ sendKey_search);
		 }
		 catch(Exception e)
		 {
			log.error("Unable to click on"+ sendKey_search+e); 
		 }
		  
	 }
	 public void SearchButton()
	 {
		 try
		 {
		    verifyElementPresent(bnt_search);
		    bnt_search.click();
			log.info("Clicked successfully");
			
		 }
		 catch(Exception e)
		 {
			log.error("Unable to click on"+bnt_search +e); 
		 }
		 
	 }

	 public void BookLink()
	 {
		 try
		 {
		    verifyElementPresent(lnk_book);
		    lnk_book.click();
			log.info("Clicked successfully");
			
		 }
		 catch(Exception e)
		 {
			log.error("Unable to click on"+lnk_book+e); 
		 }
}
	 
	 public void ButtonAdd()
	 {
		 try
		 {
		    verifyElementPresent(btn_Add);
		    
		    btn_Add.click();
			log.info("Clicked successfully");
			
		 }
		 catch(Exception e)
		 {
			log.error("Unable to click on"+btn_Add+e);
		 }
}
	 
	 
	 public void ButtonOrder()
	 {
		 try
		 {
		    verifyElementPresent(btn_order);
		    
		    btn_order.click();
			log.info("Clicked successfully");
			
		 }
		 catch(Exception e)
		 {
			log.error("Unable to click on"+btn_order+e);
		 }
	 }
	 public void EmailID()
	 {
		 try
		 {
		    verifyElementPresent(sendKey_email);
		    sendKey_email.sendKeys("ginger@gmail.com");
			log.info("SendKey successfully");
			
		 }
		 catch(Exception e)
		 {
			log.error("Unable to click on"+sendKey_email+e); 
		 }
}
	 
	
	 
	 public void PhoneNO()
	 {
		 try
		 {
		    verifyElementPresent(sendKey_phoneNo);
		    sendKey_phoneNo.sendKeys("111222333");
			log.info("SendKey successfully");
			
		 }
		 catch(Exception e)
		 {
			log.error("Unable to click on"+sendKey_phoneNo+e); 
		 }
}
	 public void ButtonContinue()
	 {
		 try
		 {
		    verifyElementPresent(bnt_continue);
		    
		    bnt_continue.click();
			log.info("Clicked successfully");
			
		 }
		 catch(Exception e)
		 {
			log.error("Unable to click on"+bnt_continue +e);
		 }
	 }
	 
	 
}
