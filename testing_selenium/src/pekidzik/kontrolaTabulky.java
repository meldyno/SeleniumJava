package pekidzik;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import sun.font.FontRunIterator;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class kontrolaTabulky {
    private WebDriver driver;
    private String BASE_URL = "http://localhost/playground/playground/tabulka.php";


    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tomas\\Desktop\\testovanie SW\\selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test () {
        driver.get(BASE_URL);
        int rows = Integer.parseInt(driver.findElement(By.xpath("//table/tbody/tr[last()]/td[1]")).getText());
        for (int i = 1; i < rows+1 ; i++) {
            System.out.println(driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[3]")).getText());

        }
    }

    @After
    public void tearDown(){
       // driver.quit();

    }
}