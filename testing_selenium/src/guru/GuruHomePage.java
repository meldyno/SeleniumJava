package guru;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;



public class GuruHomePage {
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();
	
	//--------------------------------------INPUT DATA-----------------------------------------
	public String expectedTitle = "Guru99 Bank Manager HomePage" ;
	//--------------------------------------INPUT DATA-----------------------------------------
	
    @FindBy(xpath = "//title")
	private  WebElement homePageTitle;
    
    
	public GuruHomePage (WebDriver driver){
		this.driver = driver;
	}
		
		
	public void confirmTitle(){
		
		try {
			Assert.assertEquals(driver.getTitle(), expectedTitle);
		} 
		catch (Exception e) {
			verificationErrors.append(e.toString());
		}
	}
}






/*String verificationErrorsstring = verificationErrors.toString();
if(!"".equals(verificationErrorsstring)) {
    Assert.fail(verificationErrorsstring); 
}*/
