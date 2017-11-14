package pekidzik;

import org.junit.After;
//import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import sun.font.FontRunIterator;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class pokemoni {
    private WebDriver driver;
    private String BASE_URL = "http://localhost/playground/playground/vybersi.php";


    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tomas\\Desktop\\testovanie SW\\selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test (){
        driver.get(BASE_URL);
        new Select(driver.findElement(By.xpath("//select[@class='form-control']"))).selectByVisibleText("Bulbasaur");
        //Assert.assertTrue("Bulbasaur sa v texte nenachadza", driver.findElement(By.xpath("//div/h3")).getText().contains("Bulbasaur"));
        //Assert.assertFalse(driver.findElement(By.xpath("//div/h3")).getText().contains("Pikatchu"));

        // Assert.assertEquals("kontorla h3", "I choose you Bulbasaur !", driver.findElement(By.xpath("//h3")).getText());
        //Assert.assertEquals();
        //System.out.println(driver.findElement(By.xpath("//img")).getText());




    }

    @After
    public void tearDown(){
        // driver.quit();

    }
}