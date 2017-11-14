package pekidzik;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

import java.util.List;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.support.ui.Select;
//import sun.font.FontRunIterator;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class serialy {
    private WebDriver driver;
    private String BASE_URL = "https://www.topserialy.to/";

    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tomas\\Desktop\\testovanie SW\\selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @Test
    public void test () {
        driver.get(BASE_URL);
        
        JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,550)", "");
     
        driver.findElement(By.xpath("//*[@href='/serialy/seal-team-s01e02']")).click();
		
		// Switch to new window opened
		for(String winHandle1 : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle1);
		}
		
		//Switch to new window and close
		driver.findElement(By.id("play-button")).click();
		
		try {
			for(String winHandle2 : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle2);    
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 driver.close();
		 
		 new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id("play-button")));
		
		 driver.findElement(By.id("play-button")).click();
		
		
		
		
		
		
		
	//klikam na zavriet nove okno
		
//		for(String reklama : driver.getWindowHandles()){
//		    driver.removeall
//		}
//		
		
//		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table[2]/tbody/tr/td/div[2]")).click();
//		try {
//			new WebDriverWait(driver, 6).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //*[@class='div2']")));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.findElement(By.xpath(" //*[@class='div2']")).click();
//		
//		
//		//klikam na xko
//		
//		
//	//	driver.navigate().to("http://simpsonovci.filmy-serialy-online.tv/video/watch=B-37zLux4Xc/08x24%20-%20Filmy,%20v%20nich%C5%BE%20si%20Simpsonovi%20zahr%C3%A1li/4124/#c1");
//	
//		
//		
//		try {
//			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.id("OnPlayerClose")));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.findElement(By.id("OnPlayerClose")).click();
//	
//       



    }

    @After
    public void tearDown(){
       // driver.quit();

    }
}