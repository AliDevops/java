package com.iciciank.personalloans;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe" );
		ChromeDriver c = new ChromeDriver();
		c.get("https://www.google.com");
		c.manage().window().maximize();
		c.manage().deleteAllCookies();
		c.navigate().back();
		Thread.sleep(3000);
		c.navigate().forward();
		Thread.sleep(3000);
		c.navigate().refresh();
		c.get("https://www.facebook.com");
		String z = c.getTitle();
		System.out.println(z);
		String y = c.getCurrentUrl();
		System.out.println(y);
		//c.close();
		c.quit();
		
//		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//Driver//IEDriverServer.exe/");
//		InternetExplorerDriver i = new InternetExplorerDriver();
//		i.get("https://www.amazon.com");
//	    
//		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Driver//geckodriver.exe/");
//	    FirefoxDriver f = new FirefoxDriver();
//	    f.get("https://www.facebook.com");
	}
}
