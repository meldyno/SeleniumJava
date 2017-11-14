package firma.produkt.baliks.komponent.selenium.testing_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor; //kvoli scrollovaniu
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class pracasosikuli 
{
	
	WebDriver driver ;
	Screen MyScreen;
	
	public void invokeBrowser()
	{	
			try {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tomas\\Desktop\\testovanie SW\\selenium\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.get("https://www.profesia.sk");
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		
	}

	
	public void byimages()
	{
		try 
		{
			MyScreen = new Screen();
			Pattern cv = new Pattern("C:\\Users\\Tomas\\Desktop\\testovanie SW\\sikuli\\profesia_zivotopis.PNG");
			Pattern dalej = new Pattern("C:\\Users\\Tomas\\Desktop\\testovanie SW\\sikuli\\profesia_dalej.PNG");
			MyScreen.wait(cv, 5);
			MyScreen.click(cv);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,550)", "");
			//Thread.sleep(1000);
			MyScreen.wait(dalej, 5);
			MyScreen.click(dalej);
			MyScreen.wait(dalej, 5);
			
		} 
		catch (FindFailed e)
		{
			
			e.printStackTrace();
		}
		
	}
	
	public static void main (String[] args)
	{
	pracasosikuli objektik = new pracasosikuli();
	objektik.invokeBrowser();
	objektik.byimages();
	objektik.driver.close();
	}
}

 
	