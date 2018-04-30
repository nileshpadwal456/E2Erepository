package testcases;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TC001 {
	
	@Test
	  public void f1() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "/Users/nileshpadwal456/Downloads/chromedriver");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://192.168.56.101:8080/petclinic/");
			
			driver.findElementByClassName("icon-search").click();
			driver.findElementByName("lastName").sendKeys("Davis");
			driver.findElementByCssSelector("button").click();
			//driver.findElementById("lastName").sendKeys("Davis");
			//driver.findElementByTagName("submit").click();
			//driver.findElementById("Passwd").sendKeys("Hello");
			//driver.findElementById("signIn").click();
			Thread.sleep(3000);
	      driver.quit();
	  }
	
	
	
	/*@Test
    public void testcase1()
    {    
		System.setProperty("webdriver.chrome.driver", "/Users/nileshpadwal456/Downloads/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElementById("email").sendKeys("Hello");
		driver.findElementById("pass").sendKeys("Hello");
        driver.quit();
    }
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
	  } */
}
