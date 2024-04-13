package newpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class automate {
	private static WebElement element = null;
	
	public static WebElement checkbox(WebDriver driver)
	{
		element = driver.findElement(By.name("checkBoxOption1"));
		return element;
	}
	public static WebElement radiobutton(WebDriver driver)
	{
		element = driver.findElement(By.name("radioButton"));
		return element;
	}
	

}
