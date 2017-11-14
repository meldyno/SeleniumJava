package pekidzik;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.chrome.ChromeDriver;

public class Scitanie {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tomas\\Desktop\\testovanie SW\\selenium\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();

    baseUrl = "http://localhost/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testScitanie() throws Exception {
    driver.get(baseUrl + "/playground/playground/index.php");
    driver.findElement(By.linkText("Kalkulacka")).click();
    assertEquals("Kalkulačka", driver.findElement(By.cssSelector("h1.text-center")).getText());
    driver.findElement(By.id("firstInput")).clear();
    driver.findElement(By.id("firstInput")).sendKeys("5");
    driver.findElement(By.id("secondInput")).clear();
    driver.findElement(By.id("secondInput")).sendKeys("3");
    driver.findElement(By.id("count")).click();
    assertEquals("8", driver.findElement(By.id("result")).getText());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
