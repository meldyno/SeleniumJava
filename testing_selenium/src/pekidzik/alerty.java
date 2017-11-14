package pekidzik;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.support.ui.Select;
//import sun.font.FontRunIterator;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class alerty {
    private WebDriver driver;
    private String BASE_URL = "http://localhost/playground/playground/redalert.php";

    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tomas\\Desktop\\testovanie SW\\selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @Test
    public void test () {
        driver.get(BASE_URL);
        driver.findElement(By.id("alert1")).click();
        System.out.println("Alert 1 je:" + " " + driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.switchTo().window()
        
        Assert.assertEquals("prvy alert kontrola","Kirov Reporting" ,driver.findElement(By.xpath("//*[@class='result']/h1")).getText());

        driver.findElement(By.id("alert2")).click();
        System.out.println("Alert 2 je:" + " " + driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        Assert.assertEquals( "druhy alert dismiss kontrola","Negative", driver.findElement(By.xpath("//*[@class='result']/h1")).getText());

        driver.findElement(By.id("alert2")).click();
        driver.switchTo().alert().accept();
        Assert.assertEquals( "druhy alert accept kontrola","Helium mix optimal", driver.findElement(By.xpath("//*[@class='result']/h1")).getText());

        driver.findElement(By.id("alert3")).click();
        System.out.println("Alert 3 je:" + " " + driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Tomas");
        driver.switchTo().alert().accept();
        Assert.assertTrue( "treti alert accept kontrola", driver.findElement(By.xpath("//*[@class='result']/h1")).getText().contains("Tomas"));


    }

    @After
    public void tearDown(){
       // driver.quit();

    }
}