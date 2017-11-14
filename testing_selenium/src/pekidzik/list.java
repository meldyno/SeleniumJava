package pekidzik;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
//import org.openqa.selenium.support.ui.Select;
//import sun.font.FontRunIterator;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class list {
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
        List<WebElement> riadky = driver.findElements(By.xpath("//table/tbody/tr"));
        for (WebElement riadok : riadky) {
            System.out.println(riadok.findElement(By.xpath("./td[3]")).getText());
        }
    }

    @After
    public void tearDown(){
       // driver.quit();

    }
}