package firma.produkt.baliks.komponent.selenium.testing_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class comands 
{
	
	WebDriver driver ;
	public void invokeBrowser()
	{
	
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tomas\\Desktop\\testovanie SW\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			navigate();
			
			} 
		
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	public void navigate()
	{
		try {
			driver.navigate().to("https://www.bazos.sk");
			driver.findElement(By.linkText("Otázky")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			} 
				catch (InterruptedException e) 
					{
					e.printStackTrace();
					}
		}

	
	public static void main(String[] args)
	{
		
		comands navigacia = new comands();
		navigacia.invokeBrowser();		
	}
}
	
