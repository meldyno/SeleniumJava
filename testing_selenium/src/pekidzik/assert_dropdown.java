package pekidzik;

import org.apache.xpath.SourceTree;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class assert_dropdown {

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
        Select select = new Select(driver.findElement(By.xpath("/html/body/div/div[1]/select")));

        List<String> oca = Arrays.asList(new String[] {"select your pokemon", "Chaaaaaarmander", "Bulbasaur", "Squirtle", "Pikachu", "Diglett", "Geodude"});
        List<String> akt = new ArrayList<String>();

        for (WebElement temp:select.getOptions())
            akt.add(temp.getText());

        int vsetko = select.getOptions().size();
        if (vsetko != akt.size()){
            System.out.println("pocet nie je rovny ocakavanej mnozine");
        }

        assertArrayEquals ("polia sa nerovnaju",oca.toArray(),akt.toArray());




        List<WebElement> vsetky = select.getOptions();
            for (WebElement temp:vsetky) {
                String x = temp.getText();

            }

                //System.out.println(temp.getText());}




    }

    @After
    public void tearDown () {

        // driver.quit()};
    }

}