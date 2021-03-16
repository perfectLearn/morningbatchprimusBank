package bank.methods;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumOperation 
{
	public static WebDriver driver=null;
	
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	
	public static Hashtable<String,Object> browserLaunch(Object[]inputParameters)
		{
			String strBrowserName=(String)inputParameters[0];
			String webDriverExePath=(String)inputParameters[1];	
			
			
			if(strBrowserName.equalsIgnoreCase("Chrome"))
			    {		
				System.setProperty("webdriver.chrome.driver", webDriverExePath );				
				 driver=new ChromeDriver(); 			
				driver.manage().window().maximize();			
		    	}else if(strBrowserName.equalsIgnoreCase("FF"))
				{
		            System.setProperty("webdriver.gecko.driver", webDriverExePath );				
					 driver=new FirefoxDriver(); 			
					driver.manage().window().maximize();
		    	}		
		}
	  public static Hashtable<String,Object> openApplication(Object[]inputParameters)
		{
		  try{
			String strUrl=(String) inputParameters[0];		
			driver.get(strUrl);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			System.out.println("Test case pass");
		  }catch(Exception e)
		  {
			  System.out.println(e);
			  
			  System.out.println("Test case pass");
		  }
		}	
	public static Hashtable<String,Object> sendKey(Object[]inputParameters)
		{
		try{
			String xpath=(String) inputParameters[0];	
			String value=(String) inputParameters[1];	
			
			WebElement obj=driver.findElement(By.xpath(xpath));		
			           obj.sendKeys(value);
				       driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				       
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Action:SendKey,Input Given :" + inputParameters[1].toString());
				       
				       
		}catch(Exception e)
		{
			
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Action:SendKey,Input Given :" + inputParameters[1].toString());
		}
		
		return outputParameters;
		
		}
	public static Hashtable<String,Object> click(Object[]inputParameters)
		{         
		           try
		           {
			          String xpath=(String) inputParameters[0];		
				      driver.findElement(By.xpath(xpath)).click();
				  	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				  	  
				  	outputParameters.put("STATUS", "PASS");
					outputParameters.put("MESSAGE", "Action:click,Input Given :" + inputParameters[0].toString());
		           }
		           
		           catch(Exception e)
		           {
		        		outputParameters.put("STATUS", "FAIL");
						outputParameters.put("MESSAGE", "Action:click,Input Given :" + inputParameters[0].toString());
		           }
		           
		           
		           return outputParameters;          
		}
	
	
	
	
	
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	

}
