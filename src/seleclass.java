import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import newpages.automate;

//import com.sun.org.apache.bcel.internal.generic.Select;



public class seleclass {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		first();
		
		
	}
	public static void first() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.name("checkBoxOption1")).click();
		automate.checkbox(driver).click();
		automate.checkbox(driver).click();
		
		automate.checkbox(driver).click();
		
		
		//System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		//System.out.println(driver.findElement(By.name("checkBoxOption1")).isSelected());
		
		
		//driver.findElement(By.name("radioButton")).click();
		automate.radiobutton(driver).click();
		automate.radiobutton(driver).click();
		automate.radiobutton(driver).click();
		automate.radiobutton(driver).click();
		automate.radiobutton(driver).click();
	}
		
		
	}

