package testscript_library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase {
	@Test
	void open()
	{
	WebDriverManager.chromedriver().setup();	
	WebDriver driver = new ChromeDriver();
 
 
}
}
