package testNG;

import org.testng.annotations.*; //ked pri importe dam hvieydicku tak naimportujem vsetko z org.testng.annotations

public class TestAnnotations {
  @Test
  public void f1() {
	  System.out.println("skuska prveho testu");
	  
  }
  @Test
  public void f2() {
	  System.out.println("skuska druheho testu");
	  
  }
  
  @BeforeTest
  public void beforeAnyTheTests(){
	  System.out.println("before any test");  
  }
  
  @AfterTest
  public void afterAllTheTests(){
	  System.out.println("after all the test");
	  
  }
  
  @BeforeMethod
  public void beforeEveryMethod(){
	  System.out.println("before every test method");
  }
  
  @AfterMethod
  public void afterEveryMethod(){
	  System.out.println("after every test method"); 
  }
  
  @BeforeClass 
  public void beforeClass(){
	  System.out.println("before class"); 
  }
  
  @AfterClass
  public void AfterClass(){
	  System.out.println("after class"); 
  }
  
  
}
