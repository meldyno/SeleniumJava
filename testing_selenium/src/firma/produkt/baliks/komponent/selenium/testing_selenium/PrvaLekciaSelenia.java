package firma.produkt.baliks.komponent.selenium.testing_selenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrvaLekciaSelenia 
{
	WebDriver driver ;
	
	public void invokeBrowser()
	{	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tomas\\Desktop\\testovanie SW\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://www.bazos.sk");
		
	}
	
	
	public void search() //throws InterruptedException
	{
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//driver.findElement(By.xpath("/html/body/div[2]/a[3]")).click();
		

		
		driver.findElement(By.id("hledat")).sendKeys("stol");
//		driver.findElement(By.id("hlokalita")).sendKeys("81101");
//		driver.findElement(By.name("cenado")).sendKeys("50");
	driver.findElement(By.name("Submit")).click();
		 
		//tu pouzi cyklus na koniec stranky a potom stlac dalsia
	
		//jse.executeScript("window.scrollBy(0,150)", "");
		//Thread.sleep(1000);
	}
	
	
	public static void main(String[] args)
	{
		PrvaLekciaSelenia objekt = new PrvaLekciaSelenia();
		objekt.invokeBrowser();
		objekt.search();
		
	}
}
