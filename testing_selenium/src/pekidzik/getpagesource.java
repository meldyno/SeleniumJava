package pekidzik;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

//import java.util.List;

//import static junit.framework.Assert.assertTrue;
//import static junit.framework.TestCase.assertEquals;
//import static junit.framework.TestCase.fail;
//import org.openqa.selenium.support.ui.Select;
//import sun.font.FontRunIterator;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class getpagesource {
    private WebDriver driver;
    private String BASE_URL = "http://localhost/playground/playground/vybersi.php";
    private StringBuffer verificationErrors = new StringBuffer();


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tomas\\Desktop\\testovanie SW\\selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void test() {
        driver.get(BASE_URL);

        System.out.println(driver.getPageSource());

        //driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys("Pika");
        //new Select(driver.findElement(By.xpath("//select[@class='form-control']"))).selectByVisibleText("Pikachu");


    }

    @After
        public void tearDown () {

        // driver.quit()};
    }

}