package bank.cucumbermap;

import java.util.Hashtable;

import bank.methods.HTMLReportGenerator;
import bank.methods.SeleniumOperation;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login
{
	
	@Given ("^user open the \"(.*)\" browser and exe is \"(.*)\"$")
	   public void bLaunch(String bname, String exe)
	   {
		
	       Object [] input=new Object[2];
	       input[0]=bname;
	       input[1]=exe;		
	       SeleniumOperation.browserLaunch(input);
		
	   }	
	@Given ("^user enter the url as \"(.*)\"$")
	public void openURL(String url)
	{
		  Object[] input1=new Object[1];	
		  input1[0]=url;
		  SeleniumOperation.openApplication(input1);				
	}
	
	@When ("^user enter \"(.*)\" as username$")
	public void uname(String username)
	{
		   Object [] input=new Object[2];
	       input[0]="//*[@id='textUId']";
	       input[1]=username;		
	       Hashtable<String, Object> output1 = SeleniumOperation.sendKey(input);
		
	     
  HTMLReportGenerator.StepDetails(output1.get("STATUS").toString(),"user enter \"(.*)\" as username", output1.get("MESSAGE").toString());	     
	     
     
 		
	}
                      
	
	
	
	
}
