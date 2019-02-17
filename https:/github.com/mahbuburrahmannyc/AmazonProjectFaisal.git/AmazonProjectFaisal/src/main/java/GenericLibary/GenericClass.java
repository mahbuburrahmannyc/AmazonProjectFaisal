package GenericLibary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import AmazonPageFactory.AmazonPageFactory;

public class GenericClass {

	WebDriver driver;
	AmazonPageFactory pf;
	
	public void getSetup() {
	
	System.setProperty("webdriver.chrome.driver", "/Users/faisalazad/eclipse-workspace/OpenBrowser/Driver2/chromedriver");
	driver=new ChromeDriver();	
	pf = PageFactory.initElements(driver, AmazonPageFactory.class);
	driver.get(pf.getUrl());	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
		
		}
	
	
	
	public void signIn() {
		
		pf.getClickSignButton().click();
		pf.getUNameBox().sendKeys(pf.getUname());
		pf.getUpassBox().sendKeys(pf.getUpass());
		pf.getClickSignin().click(); 
		
	
	}
	
	
	
}
