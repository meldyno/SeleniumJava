package pekidzik;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.font.FontRunIterator;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class druhy {
    private WebDriver driver;
    private String BASE_URL = "http://localhost/playground/playground/clickmebaby.php";


    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tomas\\Desktop\\testovanie SW\\selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test (){
        driver.get(BASE_URL);
        //string pociatocnahodnota = (driver.findElement(By.id("clicks")).getText());
        Assert.assertEquals( "inicialny pocet klikov","0", driver.findElement(By.id("clicks")).getText());
        Assert.assertEquals("klikov", driver.findElement(By.className("description")).getText());

        for (int i = 1; i < 11 ; i++) {
            driver.findElement(By.id("clickMe")).click();
            Assert.assertEquals(String.valueOf(i), driver.findElement(By.id("clicks")).getText());
            if(i==1){
                Assert.assertEquals( "sklonovanie", "klik", driver.findElement(By.className("description")).getText());
            }
            if(i>=2 && i<=4 ){
                Assert.assertEquals( "sklonovanie", "kliky", driver.findElement(By.className("description")).getText());
            }
            if(i>=5){
                Assert.assertEquals( "sklonovanie", "klikov", driver.findElement(By.className("description")).getText());
            }

        }







        //driver.findElement (By.xpath("/html/body/div/div[1]/div/button[1]")).click();
        //driver.findElement(By.tagName("button")).click();
        //driver.findElement(By.).click();
    }

    @After
    public void tearDown(){
       // driver.quit();

    }
}
