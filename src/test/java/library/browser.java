package library;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser {
	WebDriver driver;
	
	public void init() {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();

	}

	
	public void navigate(String Url) {
		driver.get(Url);
		//System.out.println("Title of page is: " + driver.getTitle());
		
	}
	
	public void closeit(){
		 driver.quit();
		
	}

	

	}
	
	
	
	
	
	


