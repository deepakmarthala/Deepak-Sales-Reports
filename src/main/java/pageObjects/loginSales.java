package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginSales {
	public WebDriver driver;
	By admin=By.id("input-username");
	By password=By.id("input-password");
	By submit=By.xpath("//*[@type='submit']");
	By menu = By.id("button-menu");
	By sales = By.xpath("//i[@class='fa fa-shopping-cart fa-fw']");
	By orders = By.xpath("//ul[@class='collapse in']/li[1]");
	By recurOrders =By.xpath("//a[text()='Recurring Orders']");
	By returns = By.xpath("//*[@class='collapse in']/li[3]");
	By giftVouchers = By.xpath("//*[@class='collapse in']/li[4]");
	By giftVouchers1 = By.xpath("//ul[@class='collapse in']/li[4]/ul/li[1]");
	By voucherThemes = By.xpath("//*[@id=\"sale\"]/ul/li[4]/ul/li[2]/a");
	By paypal = By.xpath("//a[text()='PayPal']");
	By search = By.xpath("//a[text()='Search']");
	By orderId = By.id("input-order-id");
	By filbutton = By.id("button-filter");
	By viewButton  = By.xpath("//i[@class='fa fa-eye']");
	By uniformLink = By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div[1]/div/table/tbody/tr[1]/td[2]/a");
	By invoiceButton = By.xpath("//i[@class='fa fa-print']");
	By shippingListBtn=By.xpath("//i[@class='fa fa-truck']");
	By cancelBtn = By.xpath("//i[@class='fa fa-reply']");
	By check1 = By.xpath("//*[@id=\"form-order\"]/div/table/tbody/tr/td[1]/input[1]");
	By returnID=By.id("input-return-id");
	By returnFilter = By.xpath("//button[@class='btn btn-primary pull-right']");
	By trashBtn = By.xpath("//i[@class=\"fa fa-trash-o\"]");
	By Nodata = By.xpath("//td[text()=\'No results!\']");
	By recurId = By.xpath("//*[@id=\"input-order-recurring-id\"]");
	By recurFilter = By.xpath("//button[@class='btn btn-primary pull-right']");
	By GiftVoucherDelete = By.xpath("//i[@class='fa fa-trash-o']");
	By DelSuccessMsg=By.xpath("//div[@class='alert alert-success']");
	By GiftVouchersEdit = By.xpath("//*[@id=\"form-voucher\"]/div/table/tbody/tr[1]/td[9]/a");
	By voucherThemesEdit = By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[1]/td[3]/a");
	By VoucherThemeText = By.xpath("//*[@id=\"form-theme-voucher\"]/div[1]/div/div/input");
	By VoucherThemeSave = By.xpath("//i[@class='fa fa-save']");
	By VoucherEditSuccess = By.xpath("//div[@class='alert alert-success']");
	By VoucherSuccessMsg = By.xpath("//div[@class='alert alert-success']");
	
	public loginSales(WebDriver driver) 
	{
		this.driver=driver;
	}
	public WebElement getAdmin()
	{
		return driver.findElement(admin);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement getSubmit()
	{
		return driver.findElement(submit);
	}
	public WebElement getMenu()
	{
		return driver.findElement(menu);
	}
	public WebElement getSales()
	{
		return driver.findElement(sales);
	}
	public WebElement getOrders()
	{
		return driver.findElement(orders);
	}
	public WebElement getRecOrder()
	{
		return driver.findElement(recurOrders);
	}
	public WebElement getReturns()
	{
		return driver.findElement(returns);
	}
	public WebElement getGiftVouchers()
	{
		return driver.findElement(giftVouchers);
	}
	public WebElement getGiftVouchers1()
	{
		return driver.findElement(giftVouchers1);
	}
	public WebElement getVoucherThemes()
	{
		return driver.findElement(voucherThemes);
	}
	
	public WebElement getpayPal()
	{
		return driver.findElement(paypal);
	}
	public WebElement getSearch()
	{
		return driver.findElement(search);
	}
	
	public WebElement getOrderid()
	{
		return driver.findElement(orderId);
	}
	public WebElement getFilButton()
	{
		return driver.findElement(filbutton);
	}
	public WebElement getViewButton()
	{
		return driver.findElement(viewButton);
	}
	public WebElement getUniformLink()
	{
		return driver.findElement(uniformLink);
	}
	public WebElement getInvoiceBtn()
	{
		return driver.findElement(invoiceButton);
	}
	public WebElement getShippingList()
	{
		return driver.findElement(shippingListBtn);
	}
	public WebElement getCancelBtn()
	{
		return driver.findElement(cancelBtn);
	}
	public WebElement getCheckBox()
	{
		return driver.findElement(check1);
	}
	public WebElement getReturnId()
	{
		return driver.findElement(returnID);
	}
	public WebElement getreturnFilter()
	{
		return driver.findElement(returnFilter);
	}
	public WebElement getTrashBtn()
	{
		return driver.findElement(trashBtn);
	}
	public WebElement getNodata()
	{
		return driver.findElement(Nodata);
	}
	public WebElement getRecurID()
	{
		return driver.findElement(recurId);
	}
	public WebElement getRecurFilter()
	{
		return driver.findElement(recurFilter);
	}
	public WebElement getGiftVoucherDelete()
	{
		return driver.findElement(GiftVoucherDelete);
	}
	public WebElement getDelSuccessMsg()
	{
		return driver.findElement(DelSuccessMsg);
	}
	public WebElement getGiftVouchersEdit()
	{
		return driver.findElement(GiftVouchersEdit);
	}
	public WebElement getvoucherThemesEdit()
	{
		return driver.findElement(voucherThemesEdit);
	}
	public WebElement getVoucherThemeText()
	{
		return driver.findElement(VoucherThemeText);
	}
	public WebElement getVoucherThemeSave()
	{
		return driver.findElement(VoucherThemeSave);
	}
	public WebElement getVoucherEditSuccess()
	{
		return driver.findElement(VoucherEditSuccess);
	}
	public WebElement getVoucherSuccessMsg()
	{
		return driver.findElement(VoucherSuccessMsg);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}