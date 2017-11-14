package guru;

import static junit.framework.TestCase.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;



public class GuruLoginPage {
	private WebDriver driver;
	//private StringBuffer verificationErrors = new StringBuffer();
  
	//najdem si webelementy
	@FindBy(xpath = "//input[@name='uid']")
	private WebElement userName;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	@FindBy(xpath = "//input[@name='btnLogin']")
	private WebElement loginButton;
	
	 @FindBy(xpath = "//title")
	private  WebElement homePageTitle;
	
	
	//neviem co toto je
	public GuruLoginPage (WebDriver driver)
	{
		this.driver = driver;	
	}

	//zadefinujeme premenne
	public String user;
	public String pass;
	public String expectedTitle;


    public void setUserName(String user)
    {userName.sendKeys(user);
    }
    public void setPassword(String pass)
    {password.sendKeys(pass);
    }
    public void clickLogin()
    {loginButton.click();
    }
    
}
   
    /* public void overenieTitle(){
		//System.out.println(homePageTitle.getText());
		//return homePageTitle.getText();
		Assert.assertEquals(expectedTitle,homePageTitle.getText());
    }*/
 
    
    /*public boolean overenieTitle()
    {
    	this.driver = driver;
    	try {Assert.assertEquals(driver.getTitle(), expectedTitle);
			} 
        catch (Exception e) 
        	{verificationErrors.append(e.toString());
			}
        
        String verificationErrorsstring = verificationErrors.toString();

        if(!"".equals(verificationErrorsstring)) 
        { fail(verificationErrorsstring);
        }
    }*/
    
        


		

