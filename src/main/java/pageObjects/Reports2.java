package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reports2 {
	public WebDriver driver;
	
	By reportsDropdown = By.xpath("//i[@class='fa fa-bar-chart-o fa-fw']");
	By CustomersDropDown = By.xpath("//*[@id=\"reports\"]/ul/li[3]/a");
	By CustomersOnline = By.xpath("//*[@id=\"reports\"]/ul/li[3]/ul/li[1]/a");
	By IpAdd = By.xpath("//*[@id=\"input-ip\"]");
	By filbutton = By.xpath("//button[@class='btn btn-primary pull-right']");
	By CustomerActivity = By.xpath("//*[@id=\"reports\"]/ul/li[3]/ul/li[2]/a");
	By CustomerOrder = By.xpath("//*[@id=\"reports\"]/ul/li[3]/ul/li[3]/a");
	By CustomerARip=By.xpath("//*[@id=\"input-ip\"]");
	By CustomerArbutton=By.xpath("//button[@class='btn btn-primary pull-right']");
	By RewardPoints = By.xpath("//a[text()='Reward Points']");
	By CreditPoints = By.xpath("//*[@id=\'reports\']/ul/li[3]/ul/li[5]/a");
	By MarketingDropdown = By.xpath("//*[@id=\'reports\']/ul/li[4]/a");
	By MarketingReport=By.xpath("//*[@id=\"reports\"]/ul/li[4]/ul/li[1]/a");
	By AffliateCommRep = By.xpath("//*[@id=\"reports\"]/ul/li[4]/ul/li[2]/a");
	By AffliateAct = By.xpath("//a[text()='Affiliate Activity']");
	By AARiP = By.xpath("//*[@id=\"input-ip\"]");
	By AArfilter = By.xpath("//button[@class='btn btn-primary pull-right']");
	
	public Reports2(WebDriver driver) 
	{
		this.driver=driver;
	}
	public WebElement getReportsDropdown() {
		return driver.findElement(reportsDropdown);
	}
	public WebElement getCustomersDropdown() {
		return driver.findElement(CustomersDropDown);
	}
	public WebElement getCustomersOnline() {
		return driver.findElement(CustomersOnline);
	}
	public WebElement getIpAdd() {
		return driver.findElement(IpAdd);
	}
	public WebElement getfilbutton() {
		return driver.findElement(filbutton);
	}
	public WebElement getCustomerActivity() {
		return driver.findElement(CustomerActivity);
	}
	public WebElement getCustomerOrder() {
		return driver.findElement(CustomerOrder);
	}
	public WebElement getCustomerARip() {
		return driver.findElement(CustomerARip);
	}
	public WebElement getCustomerArbutton() {
		return driver.findElement(CustomerArbutton);
	}
	public WebElement getRewardPoints() {
		return driver.findElement(RewardPoints);
	}
	public WebElement getCreditPoints() {
		return driver.findElement(CreditPoints);
	}
	public WebElement getMarketingDropdown() {
		return driver.findElement(MarketingDropdown);
	}
	public WebElement getMarketingReport() {
		return driver.findElement(MarketingReport);
	}
	public WebElement getAffliateCommRep() {
		return driver.findElement(AffliateCommRep);
	}
	public WebElement getAffliateAct() {
		return driver.findElement(AffliateAct);
	}
	public WebElement getAARiP() {
		return driver.findElement(AARiP);
	}
	public WebElement getAArfilter() {
		return driver.findElement(AArfilter);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
