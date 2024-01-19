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
	 // static WebDriver driver;
	  
    
   @Test
    public void TestNew3() throws InterruptedException { 


        String chromeBinaryPath = "chromedriver.exe";
    	        ChromeOptions options = new ChromeOptions();
    	        options.setBinary(chromeBinaryPath);
    	        WebDriver driver = new ChromeDriver(options);
    	        driver.get("https://toolsqa.com");
               driver.quit();
    	   	
    
    }
     }	
