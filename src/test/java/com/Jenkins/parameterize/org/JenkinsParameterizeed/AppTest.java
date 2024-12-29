package com.Jenkins.parameterize.org.JenkinsParameterizeed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

     
	WebDriver driver;
	
    @Test
    @Parameters({"browser"})
    public void shouldAnswerWithTrue(String browser) {
        
    	String browserJenkins=System.getProperty("Browser");
    	if(browserJenkins==null)
    	{
    		System.out.println("browserJenkins : "+browserJenkins);
        	
    		browser="Firefox";
    	}
    	System.out.println("Jenkins Parametrized");
    	if (browser.equals("Chrome")) {
    		 driver =new ChromeDriver();
		}else
		{
			driver =new FirefoxDriver();
		}
    	
    	driver.close();
    	 
    }
}
