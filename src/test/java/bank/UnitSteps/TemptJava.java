package bank.UnitSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TemptJava 
{
	public static void main(String[] args)
	{
		
	  //Launch Browser
	System.setProperty("webdriver.chrome.driver", "D:\\Feb morning 8am batch project\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe");	
	
	ChromeDriver driver=new ChromeDriver(); 
	
	driver.manage().window().maximize();
	
	//Open Application
	driver.get("http://primusbank.qedgetech.com/");
	
	//Enter username
	driver.findElementByXPath("//*[@id='txtuId']").sendKeys("Admin");
		
	
	//driver.findElement(By.xpath("//*[@id='txtuId']")).sendKeys("Admin");
	
	
	//Enter password
	driver.findElementByXPath("//*[@name='txtPword']").sendKeys("Admin");
	
	//Click on Login button
	driver.findElementByXPath("//*[@id='login']").click();
	
	//Click on branches
	driver.findElementByXPath("//*[@src='images/Branches_but.jpg']").click();
	
	//Select INDIA as country
	Select country=new Select(driver.findElementByXPath("//*[@name='lst_countryS']"));
	
	       country.selectByVisibleText("INDIA");
	       
	     //Select AP as state
	   	Select state=new Select(driver.findElementByXPath("//*[@name='lst_stateS']"));
	   	
	   	       state.selectByVisibleText("Andhra Pradesh");
	   	       
	   	  //Select Hyderabad as city
	   		Select city=new Select(driver.findElementByXPath("//*[@name='lst_cityS']"));
	   		
	   		//Click on search button
	   		driver.findElementByXPath("//*[@name='btn_search']").click();
	   		
	   		       city.selectByVisibleText("Hyderabad");
	       
	       
	       
	       
	       
	       
	 // we are going to create Reusable methods depending on actions 
	   		       // click(); sendkeys() select(); browserL(); URLOpen();
	       
	       
	       
	       
	       
	       
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
