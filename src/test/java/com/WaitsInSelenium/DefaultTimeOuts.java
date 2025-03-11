package com.WaitsInSelenium;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DefaultTimeOuts {
  @Test
  public void testDefaultTimeOut() 
  {
	  
	  
	  //get the capabilities of Chrome broswer
	  ChromeDriver driver=new ChromeDriver();
	  Capabilities cap=driver.getCapabilities();
	  Map<String,Object> allCap=cap.asMap();
	  System.out.println(allCap);
	  
	  
	  //timeouts={implicit=0, pageLoad=3,00000, script=30000}
	  
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	  
	  driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  /*
	   * {acceptInsecureCerts=false,
	   *  browserName=chrome, 
	   *  browserVersion=134.0.6998.35, 
	   *  chrome={chromedriverVersion=134.0.6998.88 (7e3d5c978c6d3a6eda25692cfac7f893a2b20dd0-refs/branch-heads/6998@{#1898}), userDataDir=C:\Users\Ganes\AppData\Local\Temp\scoped_dir12108_1885060247}, fedcm:accounts=true,
	   *   goog:chromeOptions={debuggerAddress=localhost:63219},
	   *    networkConnectionEnabled=false,
	   *     pageLoadStrategy=normal, 
	   *     platformName=windows,
	   *      proxy=Proxy(),
	   *      
	   *       se:cdp=ws://localhost:63219/devtools/browser/a6ba632b-9a5f-40dc-9cd4-4e59df2f3377,
	   *        se:cdpVersion=134.0.6998.35, 
	   *        setWindowRect=true, 
	   *        strictFileInteractability=false, 
	   *        timeouts={implicit=0, pageLoad=300000, script=30000},
	   *         unhandledPromptBehavior=dismiss and notify,
	   *          webauthn:extension:credBlob=true,
	   *           webauthn:extension:largeBlob=true, 
	   *           webauthn:extension:minPinLength=true,
	   *  webauthn:extension:prf=true, webauthn:virtualAuthenticators=true}
	   */
	  
	  
  }
}
