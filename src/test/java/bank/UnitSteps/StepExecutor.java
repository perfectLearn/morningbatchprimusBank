package bank.UnitSteps;

import bank.methods.SeleniumOperation;

public class StepExecutor 
{
	

	public static void main(String[] args) 
	{
	    //Launch browser	
		Object [] input=new Object[2];
		       input[0]="Chrome";
		       input[1]="D:\\Feb morning 8am batch project\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe";		
		SeleniumOperation.browserLaunch(input);
		
		//open Application
		Object[] input1=new Object[1];	
		  input1[0]="http://primusbank.qedgetech.com";
		SeleniumOperation.openApplication(input1);
		
		
		
		
	//	sendKey("//*[@id='txtuId']","Admin");
			
		
	//	sendKey("//*[@name='txtPword']","Admin");
		
	//	click("//*[@id='login']");
	}	
		

}
