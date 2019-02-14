package Demoproject.htmlUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class TestHeadLess {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaring and initialising the HtmlUnitWebDriver
		 WebDriver unitDriver = new HtmlUnitDriver();
         
		     // Navigate to Google		
        // open google.com webpage
		 unitDriver.get("http://google.com");
		 
		 System.out.println("Title of the page is -> " + unitDriver.getTitle());
		 
		 // find the search edit box on the google page
		 WebElement searchBox = unitDriver.findElement(By.name("q"));
		 
		 // type in Selenium
		 searchBox.sendKeys("Selenium");
		 
		 // find the search button
		 WebElement button = unitDriver.findElement(By.name("gbqfba"));
		 
		 // Click the button
		 button.click();
		 
		 System.out.println("Title of the page is -> " + unitDriver.getTitle());
		 
		
	}
}
