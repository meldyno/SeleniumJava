package testNG;

import org.testng.annotations.Test;

public class TestGroupingNew {
	
  @Test(groups={"f"})
  public void f1() {
  }
  @Test(groups={"f"})
  public void f2() {
  }
  @Test(groups={"f"})
  public void f3() {
  }
  @Test(groups={"a"})
  public void a4() {
  }
  @Test(groups={"a"})
  public void a5() {
  }
}
