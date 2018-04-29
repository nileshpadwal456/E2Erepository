package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TC002 {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "/Users/nileshpadwal456/Downloads/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.findElementById("identifierId").sendKeys("nileshpadwal456@gmail.com");
		driver.findElementById("identifierNext").click();
		//driver.findElementById("Passwd").sendKeys("Hello");
		//driver.findElementById("signIn").click();
		Thread.sleep(2000);
      driver.quit();
  }
}



