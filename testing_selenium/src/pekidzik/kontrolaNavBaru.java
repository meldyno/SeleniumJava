package pekidzik;


import static org.testng.Assert.fail;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class kontrolaNavBaru {
    private WebDriver driver;
    private String BASE_URL = "http://localhost/playground/playground/";
    private StringBuffer verErrors = new StringBuffer();
    


    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tomas\\Desktop\\testovanie SW\\selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test () {
       
        String expectedClass = "active";
        
        List<String> pejdzis = Arrays.asList(new String[] {"redalert.php","tabulka.php","semafor.php"});
        for (String page:pejdzis ){
        	
        	try {
				driver.get(BASE_URL + "/" + page);
				Assert.assertTrue("nevysvietene na navbare",driver.findElement(By.xpath("//li[a/@href='"+ page +"']"))
						.getAttribute("class").contains(expectedClass));
			} 
        	catch (Exception chyba) {
				verErrors.append(chyba.toString());
				
			}
        	
        	
        	
        };
       
        
        /*ArrayList<String> pages = new ArrayList<>(); 
        	pages.add("redalert.php");
        	pages.add("tabulka.php");
        	pages.add("zjavenie.php");
         System.out.println(driver.findElement(By.xpath("//li[a/@href='redalert.php']")).getAttribute("expectedClass"));
        */
       
    }


    @After
    public void tearDown(){	
    	driver.quit();

    	String verErrorsString = verErrors.toString();
    	if(!"".equals(verErrorsString)){
    		fail(verErrorsString);	
    	};
    	
         
    	
    }
 
}
