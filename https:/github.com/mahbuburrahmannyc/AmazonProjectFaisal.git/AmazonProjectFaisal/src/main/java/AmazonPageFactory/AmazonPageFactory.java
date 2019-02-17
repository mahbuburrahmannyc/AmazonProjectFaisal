package AmazonPageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPageFactory {
	
	private String url = "https://www.amazon.com/";
	private String Uname= "faiz.85@hotmail.com";
	private String Upass= "nmnmnmnm";
	
	
	
	
	@FindBy(xpath="//*[@class='nav-a nav-a-2']")
    private WebElement ClickSignButton;

    @FindBy(xpath="//*[@id= 'ap_email']")
	private WebElement UNameBox;
	
    @FindBy(xpath="//*[@id='ap_password']")
    private WebElement UpassBox;
    
	@FindBy(xpath="//*[@id='signInSubmit']")
	private WebElement ClickSignin;
	


   public String getUrl() {
		return url;
	}


   public String getUname() {
		return Uname;
	}

	
   public WebElement getClickSignButton() {
		return ClickSignButton;
	}

	
	public WebElement getUNameBox() {
		return UNameBox;
	}


	public String getUpass() {
		return Upass;
	}


	public WebElement getUpassBox() {
		return UpassBox;
	}


	public WebElement getClickSignin() {
		return ClickSignin;
	}
	
	
	
	

}
