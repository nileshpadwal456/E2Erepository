package testcases;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TC001 {
	
	@Test
    public void testcase1()
    {    
		System.setProperty("webdriver.chrome.driver", "/Users/nileshpadwal456/Downloads/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElementById("email").sendKeys("Hello");
		driver.findElementById("pass").sendKeys("Hello");
        driver.quit();
    }
}
