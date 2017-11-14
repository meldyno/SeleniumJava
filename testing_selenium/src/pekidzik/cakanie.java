package pekidzik;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;
//import org.openqa.selenium.support.ui.Select;
//import sun.font.FontRunIterator;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class cakanie {
    private WebDriver driver;
    private String BASE_URL = "http://localhost/playground/playground/zjavenie.php";


    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tomas\\Desktop\\testovanie SW\\selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test () {
        driver.get(BASE_URL);
        driver.findElement(By.id("showHim")).click();
        
        //je element zobrazeny na stranke
        /*new WebDriverWait(driver, 5)
        		.until(ExpectedConditions
        				.visibilityOfElementLocated(By.xpath("//img[@class='brano']")));
        */
        
        //je element v DOMe/je na stranke
        new WebDriverWait(driver, 5)
			.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//img[@class='brano']")));
        
        Assert.assertTrue(driver.findElement((By.xpath("//img[@class='brano']"))).isDisplayed());
        
        driver.findElement(By.id("hideHim")).click();;
              
    }


    @After
    public void tearDown(){
        // String verificationErrorsstring = verificationErrors.toString();

        // driver.quit();

    }
 
}
