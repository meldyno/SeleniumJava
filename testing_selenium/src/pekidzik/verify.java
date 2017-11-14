package pekidzik;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;
//import org.openqa.selenium.support.ui.Select;
//import sun.font.FontRunIterator;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class verify {
    private WebDriver driver;
    private String BASE_URL = "http://localhost/playground/playground/tabulka.php";
    private StringBuffer verificationErrors = new StringBuffer();


    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tomas\\Desktop\\testovanie SW\\selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test () {
        driver.get(BASE_URL);
        int lastid = Integer.parseInt (driver.findElement(By.xpath("//tbody/tr[last()]/td[1]")).getText());


        for (int i = 1; i < lastid +1 ; i++) {
            try {
                assertEquals(Integer.toString(i), String.valueOf(i), driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[" + i + "]/td[1]")).getText());
            }
            catch (Error chybka) {
                verificationErrors.append(chybka.toString());
            }
        }
    }


    @After
    public void tearDown(){
        String verificationErrorsstring = verificationErrors.toString();

        if(!"".equals(verificationErrorsstring)) {
            fail(verificationErrorsstring);
        }


        // driver.quit();

    }
}