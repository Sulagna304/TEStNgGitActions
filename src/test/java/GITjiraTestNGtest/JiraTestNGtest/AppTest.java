package GITjiraTestNGtest.JiraTestNGtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	  static WebDriver driver;
	  
    @Test
    public void MethodForGitHubAction() throws InterruptedException {
	    String baseUrl = "https://www.google.com";        
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseUrl);
        //String testTitle = "Free QA Automation Tools For Everyone";
        //String originalTitle = driver.getTitle();
        driver.close();
    }

    @Test
    public void TestNew2() throws InterruptedException { 
    //System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("start-maximized"); // open Browser in maximized mode
    options.addArguments("disable-infobars"); // disabling infobars
    options.addArguments("--disable-extensions"); // disabling extensions
    options.addArguments("--disable-gpu"); // applicable to windows os only
    options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
    options.addArguments("--no-sandbox"); // Bypass OS security model
    driver = new ChromeDriver(options);
    driver.get("https://toolsqa.com");
    
    }	
}
