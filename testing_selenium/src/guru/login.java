package guru;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import static junit.framework.TestCase.fail;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class login {
	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();
	
	//--------------------------------------INPUT DATA-----------------------------------------
	
	private String BASE_URL = "http://www.demo.guru99.com/V4/";
	public String user = "mngr101396";
	public String pass = "gAbygej";
	public String invalidUser = "invalidUser";
	public String invalidpass = "invalidPass";
	
	//--------------------------------------INPUT DATA-----------------------------------------
	
    

    
	@BeforeMethod
	public void setUp (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tomas\\Desktop\\testovanie SW\\selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }
    
    
    @Test
    public void inputLoginData(){
    	GuruLoginPage guruLoginPage = PageFactory.initElements(driver, GuruLoginPage.class);
    	driver.get(BASE_URL);
    	guruLoginPage.setUserName(user);
    	guruLoginPage.setPassword(pass);
    	guruLoginPage.clickLogin();
    	new WebDriverWait(driver, 5);
    
    	GuruHomePage guruHomePage = PageFactory.initElements(driver, GuruHomePage.class);
    	guruHomePage.confirmTitle();
    }
 	
   
	@AfterMethod
	public void tear()
		{
		 String verificationErrorsstring = verificationErrors.toString();
		  if(!"".equals(verificationErrorsstring)) {
	          AssertJUnit.fail(verificationErrorsstring); 
		}
    }
}
