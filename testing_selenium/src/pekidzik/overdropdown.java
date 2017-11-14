
package pekidzik;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import org.junit.*;
import org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertArrayEquals;

public class overdropdown {
    private WebDriver driver;
    private String BASE_URL = "http://localhost/playground/playground/vybersi.php";


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tomas\\Desktop\\testovanie SW\\selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void test() {
        driver.get(BASE_URL);
        //Select vyber = new Select(driver.findElement(By.xpath("/html/body/div/div[1]/select")));
        java.util.List<WebElement> options = driver.findElements(By.xpath("/html/body/div/div[1]/select"));

        java.util.List<String> text = new ArrayList<>();
        for(int i=1; i<options.size(); i++) {
            System.out.println(Arrays.toString(text.add(options.get(i).getText())));

        }


                //String[] ocak = {"Charmander", "Bulbasaur", "Squirtle", "Pikachu", "Diglett", "Geodude"};
                //List<String> ocak = Arrays.asList(ocak);

                 */
/*List<String> oca = Arrays.asList(new String[] {"Charmander", "Bulbasaur", "Squirtle", "Pikachu", "Diglett", "Geodude"});
                List<String> akt = new ArrayList<String>();

                 for (WebElement option:vyber.getOptions())
                  akt.add(option.getText());

                 assertArrayEquals(oca.toArray(), akt.toArray())*//*
;









    }

    @After
    public void tearDown () {

        // driver.quit()};
    }

}
