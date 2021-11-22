package resources;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;
	//public Properties prop;
public WebDriver initializeDriver() throws IOException
{
	
    System.setProperty("webdriver.chrome.driver", "C:\\Training\\Selenium\\chromedriver.exe");  
	driver= new ChromeDriver();
		//execute in chrome driver
	
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;


}
}
