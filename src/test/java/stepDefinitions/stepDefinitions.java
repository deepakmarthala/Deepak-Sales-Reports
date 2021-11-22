package stepDefinitions;

import java.io.IOException;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.Reports2;
import pageObjects.loginSales;
import resources.Base;


public class stepDefinitions extends Base{




@Given("^Login with admin Creditials$")
public void login_with_admin_creditials() throws Throwable {
	driver =initializeDriver();
	driver.get("http://uniformm1.upskills.in/admin/");
	//driver.manage().window().maximize();
	loginSales l=new loginSales(driver);
	l.getAdmin().sendKeys("admin");
	l.getPassword().sendKeys("admin@123");
	l.getSubmit().click();     //logging in
}

@And("^Click on menu button and then sales$")
public void click_on_menu_button_and_then_sales() throws Throwable {
	 loginSales l=new loginSales(driver);
	    l.getMenu().click();                 //clicking on menu button to get options
	    l.getSales().click();                // clicking on sales options
	    System.out.println("Sales dropdown is displayed");
}

// orders

@When("^Click on orders$")
public void click_on_orders() throws Throwable {
    loginSales l = new loginSales(driver);
    l.getOrders().click();
    System.out.println("orders page is displayed");
}

@Then("^Navigate to orders page$")
public void navigate_to_orders_page() throws Throwable {
    String s=driver.getTitle();
    Assert.assertEquals("Orders",s);      // checking if right page is displayed
   
}

//recurring orders pages

@When("^click on recurring orders$")
public void click_on_recurring_orders() throws Throwable {
	loginSales l = new loginSales(driver);
	l.getRecOrder().click();              // recurring orders page is displayed
	System.out.println("Recurring orders page is displayed");  
}

@Then("^Navigate to recurring orders page$")
public void navigate_to_recurring_orders_page() throws Throwable {
   String tit=driver.getTitle();
   Assert.assertEquals("Recurring Orders",tit); // checking if recurring orders page is displayed 
}

//Returns

@When("^click on Returns$")
public void click_on_returns() throws Throwable {
	loginSales l = new loginSales(driver);
	l.getReturns().click();
	System.out.println("returns page is displayed");
}

@Then("^Navigate to returns page$")
public void navigate_to_returns_page() throws Throwable {
   String tit1=driver.getTitle();
   Assert.assertEquals("Product Returns",tit1);  //checking if return page is displayed
}

//gift vouchers

@When("^click on gift vouchers$")
public void click_on_gift_vouchers() throws Throwable {
	loginSales l = new loginSales(driver);
	l.getGiftVouchers().click(); // clicking on gift vouchers in the options
}

@Then("^click on giftVouchers in the dropdown$")
public void click_on_giftvouchers_in_the_dropdown() throws Throwable {
	loginSales l = new loginSales(driver);
	l.getGiftVouchers1().click();  // clicking on gift vouchers in the gift vouchers dropdown
	System.out.println("Gift Vouchers page is displayed");
}

@Then("^navigate to Gift vouchers page$")
public void navigate_to_gift_vouchers_page() throws Throwable {
    String tit2=driver.getTitle(); // printing the title of the page to check if giftvouchers page is displayed
    Assert.assertEquals("Gift Vouchers", tit2);
}


//Voucher Themes

@When("^click on voucher themes in gift voucher dropdown$")
public void click_on_voucher_themes_in_gift_voucher_dropdown() throws Throwable {
	loginSales l = new loginSales(driver);
	//l.getGiftVouchers().click();
	l.getVoucherThemes().click(); // clicking on voucher themes in the gift vouchers drop down
	System.out.println("Voucher themes page is displayed");
}

@Then("^navigate to voucher themes page$")
public void navigate_to_voucher_themes_page() throws Throwable {
    String tit2=driver.getTitle(); // checking if voucher themes page is displayed
    Assert.assertEquals("Voucher Themes",tit2);
}

//PayPal


@When("^click on PayPal$")
public void click_on_paypal() throws Throwable {
    loginSales l = new loginSales(driver);
    l.getpayPal().click();
}

@Then("^click on search in the dropdown$")
public void click_on_search_in_the_dropdown() throws Throwable {
    loginSales l = new loginSales(driver);
    l.getSearch().click(); //clicking on paypal
    System.out.println("Search page in PayPal is displayed");
}

@Then("^navigate to the search page$")
public void navigate_to_the_search_page() throws Throwable {
    String tit3=driver.getTitle(); //checking if paypal page is displayed
    Assert.assertEquals("Search Transactions",tit3);
}


//Orders pages


@When("^click on Orders option$")
public void click_on_orders_option() throws Throwable {
    loginSales l = new loginSales(driver);
    l.getOrders().click(); // returning back to orders page
    
}

@Then("^enter the order id in the order id text box$")
public void enter_the_order_id_in_the_order_id_text_box() throws Throwable {
   loginSales l = new loginSales(driver);
   l.getOrderid().sendKeys("333"); // entering orderId in orderId text box to filter the orders
}

@Then("^click on filter$")
public void click_on_filter() throws Throwable {
   loginSales l=new loginSales(driver);
   l.getFilButton().click();
   WebElement column = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[1]/td[2]"));
   String OrderNum=column.getText();
   Assert.assertEquals("333", OrderNum); // checking if correct orderId is displayed
   System.out.println(OrderNum+" is the order displayed");
}

// clicking on view button

@Then("^click on view button$")
public void click_on_view_button() throws Throwable {
    loginSales l = new loginSales(driver);
    l.getViewButton().click(); // clicking on view button for the above filtered order
}

// clicking on uniform store link in the page displayed when clicked on view button

@Then("^click on UniformStore link$")
public void click_on_uniformstore_link() throws Throwable {
	loginSales l = new loginSales(driver);
	
	driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div[1]/div/table/tbody/tr[1]/td[2]/a")).click();  //clicking uniform store link in the page displayed when clicked on view button
	java.util.Set<String> windows = driver.getWindowHandles();  // using window handle to come back to orders page from uniform store page
	java.util.Iterator<String> it = windows.iterator();
	String parentId = it.next();
	String childId = it.next();
	driver.switchTo().window(childId); //switching driver to child window i.e uniform store window
	System.out.println(driver.findElement(By.xpath("//a[text()='Uniform Store']")).getText()+"page is displayed"); 
	driver.close(); // closing uniform store page
	driver.switchTo().window(parentId);

}

// clicking on print invoice button

@Then("^click on print invoice button$")
public void click_on_print_invoice_button() throws Throwable {
    loginSales l = new loginSales(driver);
    l.getInvoiceBtn().click();  //clicking on invoice button in the view button page
    
    driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/a[1]"));  
	java.util.Set<String> windows = driver.getWindowHandles();  // using window handle to come back to orders page from uniform store page
	java.util.Iterator<String> it = windows.iterator();
	String parentId = it.next();
	String childId = it.next();
	driver.switchTo().window(childId); // switching driver to child window i.e invoice page
	String tit4=driver.getTitle();
	System.out.println(tit4 + " is displayed");
	
	driver.close();
	driver.switchTo().window(parentId);
}

// shipping list button

@Then("^click on print shiplist button$")
public void click_on_print_shiplist_button() throws Throwable {
	loginSales l = new loginSales(driver);
	l.getShippingList().click(); //clicking on shipping list button
	System.out.println("Shipping is displayed");
	
	driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/a[2]"));  
	java.util.Set<String> windows = driver.getWindowHandles();  // using window handle to come back to orders page from uniform store page
	java.util.Iterator<String> it = windows.iterator();
	String parentId = it.next();
	String childId = it.next();
	driver.switchTo().window(childId); // switching driver to child window i.e invoice page
	
	
	driver.close();
	driver.switchTo().window(parentId);
}

@Then("^click on cancel button$")
public void click_on_cancel_button() throws Throwable {
	loginSales l = new loginSales(driver);
	l.getCancelBtn().click(); //clicking on cancel button to come back
}

@Then("^click on check Box$")
public void click_on_check_box() throws Throwable {
	loginSales l = new loginSales(driver);
	driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[1]/td[2]")).click();    //clicking the functionality of check box
}


// do not have any operations to do in recurring orders page

// now in returns page



@Then("^click on returns option in sales drop down$")
public void click_on_returns_option_in_sales_drop_down() throws Throwable {
	loginSales l = new loginSales(driver);
	l.getReturns().click(); //navigating to return page
}

@Then("^enter the return Id in the returnId text box$")
public void enter_the_return_id_in_the_returnid_text_box() throws Throwable {
	loginSales l = new loginSales(driver);
	l.getReturnId().sendKeys("517");                  //entering return id in text box
}

@Then("^click on filter button$")
public void click_on_filter_button() throws Throwable {
	loginSales l = new loginSales(driver);
	l.getreturnFilter().click();                     // clicking on filter button
	System.out.println("returnId is filtered");
}

@Then("^click on return option again$")
public void click_on_return_option_again() throws Throwable {
	loginSales l = new loginSales(driver);
	l.getReturns().click();                           //navigating to returns page again
	Thread.sleep(2000);
	System.out.println("navigated back to return page");
}

@When("^selecting the check box$")
public void selecting_the_check_box() throws Throwable {
	driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[1]/td[1]")).click(); //selecting text box
	System.out.println("Selected text box");
}

@Then("^click on delete button$")
public void click_on_delete_button() throws Throwable {
	loginSales l = new loginSales(driver);
	l.getTrashBtn().click();
	System.out.println("clicked on trash button");
	driver.switchTo().alert().accept(); //hovering to pop up
}

// Checking there is no data in the table in recurring order page

@When("^click on recurring orders and get text from table$")
public void click_on_recurring_orders_and_get_text_from_table() throws Throwable {
   loginSales l = new loginSales(driver);
   l.getRecOrder().click();
   String Nd = l.getNodata().getText();
   System.out.println(Nd +" is present in table");
}


@And("^enter recurring id and click on filter$")
public void enter_recurring_id_and_click_on_filter() throws Throwable {
	loginSales l = new loginSales(driver);
	l.getRecurID().sendKeys("333");                   //searching recurring id in recurring id text box
	l.getRecurFilter().click();                        //clicking on filter
}
@Then("^should display no results in the table$")
public void should_display_no_results_in_the_table() throws Throwable {
	loginSales l = new loginSales(driver);               //displaying no data is there in the recurring order page's table
	String Nd = l.getNodata().getText();
	   System.out.println(Nd +" is present in table");
}

//Gift vouchers pages in the gift vouchers drop down

@When("^click on GiftVouchers in gift vouchers drop down$")
public void click_on_giftvouchers_in_gift_vouchers_drop_down() throws Throwable {
	loginSales l = new loginSales(driver);
	l.getGiftVouchers().click();                        //going to gift vouchers page
	l.getGiftVouchers1().click();                        //clicking on gift vouchers option in the drop down 
}

@Then("^navigate to giftVouchers page$")
public void navigate_to_giftvouchers_page() throws Throwable {
   String tit=driver.getTitle();
   Assert.assertEquals("Gift Vouchers",tit);
   System.out.println(tit+ " is displayed");                //printing title of the page
}

@Then("^click on check box and click on delete button$")
public void click_on_check_box_and_click_on_delete_button() throws Throwable {
	driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[1]/td[1]")).click(); //Selecting check box
	loginSales l = new loginSales(driver);
	l.getGiftVoucherDelete().click();                    //deleting the selected voucher
	
	driver.switchTo().alert().accept();
	System.out.println(l.getDelSuccessMsg().getText()); //printing the deleted success message
}

// voucher themes page operation


@When("^click on voucher themes option in gift vouchers drop down$")
public void click_on_voucher_themes_option_in_gift_vouchers_drop_down() throws Throwable {
	loginSales l = new loginSales(driver);
	l.getVoucherThemes().click();                         //opening voucher themes page
}

@Then("^click on edit and enter the voucher theme name$")
public void click_on_edit_and_enter_the_voucher_theme_name() throws Throwable {
	loginSales l = new loginSales(driver);
	l.getvoucherThemesEdit().click();
	System.out.println("clicked on edit button");
	l.getVoucherThemeText().clear();                             // clearing previous text
	l.getVoucherThemeText().sendKeys("Heart break a happy break"); //entering new text 
	System.out.println("Entered text");
}

@And("^click on save$")
public void click_on_save() throws Throwable {
	loginSales l = new loginSales(driver);
	l.getVoucherThemeSave().click();                               //saving the new entered text
	System.out.println("clicked on save");
	System.out.println(l.getVoucherEditSuccess().getText());
	System.out.println(l.getVoucherSuccessMsg().getText());
   
}

//clicking on paypal

@When("^click on paypal option in sals drop down$")
public void click_on_paypal_option_in_sals_drop_down() throws Throwable {
	loginSales l = new loginSales(driver);
	l.getpayPal().click();
}

//Search option in the paypal dropdown

@Then("^Open search in the dropdown$")
public void open_search_in_the_dropdown() throws Throwable {
	loginSales l = new loginSales(driver);
	l.getSearch().click();
	String tit = driver.getTitle();
	Assert.assertEquals("Search Transactions" , tit);
	System.out.println(tit+" is displayed");
	Thread.sleep(2000);
}

//Reports



@When("^click on Reports$")
public void click_on_reports() throws Throwable {
    Reports2 r = new Reports2(driver);
    r.getReportsDropdown().click();                 //reports dropdown  
    System.out.println("clicked on reports dropdown");
}

@Then("^in the dropdown click on customers$")
public void in_the_dropdown_click_on_customers() throws Throwable {
	Reports2 r = new Reports2(driver);
	r.getCustomersDropdown().click();             //clicking on customers in the reports drop down
	System.out.println("clicked on customers option");
}

@Then("^in the dropdown click on customers online$")
public void in_the_dropdown_click_on_customers_online() throws Throwable {
	Reports2 r = new Reports2(driver);
	r.getCustomersOnline().click();              //Customers online option in customers drop down
	System.out.println("customers online option clicked");
}


@Then("^enter the IP address in the Ip  address text box$")
public void enter_the_ip_address_in_the_ip_address_text_box() throws Throwable {
	Reports2 r = new Reports2(driver);
	r.getIpAdd().sendKeys("43.249.225.226");  //entering Ip address
}

@And("^Click on filter in in that page$")
public void click_on_filter_in_in_that_page() throws Throwable {
	Reports2 r = new Reports2(driver);
	r.getfilbutton().click();
	System.out.println("Ip address filtered"); //filtering based on ip address in customers online page
}

//Customers Activity in Customers drop down of reports

@When("^click on customer activity$")
public void click_on_customer_activity() throws Throwable {
	Reports2 r = new Reports2(driver);
	r.getCustomerActivity().click();            //clicking on Customer activity option
}

@Then("^Navigate to customer activity page$")
public void navigate_to_customer_activity_page() throws Throwable {
	String tit7 = driver.getTitle();
	Assert.assertEquals("Customer Activity Report",tit7);  //verifying if customers activity report is displayed
	System.out.println(tit7 + " is displayed");
   
}
@Then("^In the customer activity page enter Id address$")
public void in_the_customer_activity_page_enter_id_address() throws Throwable {
	Reports2 r = new Reports2(driver);
	r.getCustomerARip().sendKeys("122.175.68.165");                  //sending Ip address to filter
}

@And("^click on filter in the customer activity page$")
public void click_on_filter_in_the_customer_activity_page() throws Throwable {
	Reports2 r = new Reports2(driver);
	r.getCustomerArbutton().click();                                //filtering based on Ip address in customer activity report
	System.out.println("Customer activity report filtered");
}

//Customers Orders Report

@When("^click on order option in the Reports customers dropdown$")
public void click_on_order_option_in_the_reports_customers_dropdown() throws Throwable {
	Reports2 r = new Reports2(driver);
	r.getCustomerOrder().click();                                //clicking on orders in customers drop down of reports drop down
}

@Then("^Navigate to order page of customers dropdown$")
public void navigate_to_order_page_of_customers_dropdown() throws Throwable {
    String tit8 = driver.getTitle();
    Assert.assertEquals("Customer Orders Report",tit8);          // verifying if correct page is displayed
    System.out.println("Navigated to  customers order report");
}

//Reward points

 
@When("^click on rewards points in the customers dropdown of Reports drop down$")
public void click_on_rewards_points_in_the_customers_dropdown_of_reports_drop_down() throws Throwable {
	 Reports2 r = new Reports2(driver);
		r.getRewardPoints().click(); //opening reward points option
}

@Then("^navigate to rewards points page$")
public void navigate_to_rewards_points_page() throws Throwable {
	String tit9 = driver.getTitle();
    Assert.assertEquals("Customer Reward Points Report",tit9);
    System.out.println(tit9 +" is displayed");   //verifying if customers reward points page is displayed
}

@When("^click on Credits options$")
public void click_on_credits_options() throws Throwable {
    Reports2 r = new Reports2(driver);
    r.getCreditPoints().click();     //opening customers credits report page 
}

@Then("^navigate to customer credit report page$")
public void navigate_to_customer_credit_report_page() throws Throwable {
	String t1=driver.getTitle();
	Assert.assertEquals("Customer Credit Report", t1);  //verifying if customer credit points page is displayed
	System.out.println("Customers credit report page is displayed");
}

@When("^click on marketing drop down$")
public void click_on_marketing_drop_down() throws Throwable {
	Reports2 r = new Reports2(driver);
	r.getMarketingDropdown().click(); //Clicking on marketing option in the repoerts drop down
}

@Then("^click on marketing reports option in the drop down$")
public void click_on_marketing_reports_option_in_the_drop_down() throws Throwable {
	Reports2 r = new Reports2(driver);
	r.getMarketingReport().click(); // clicking on marketing in the marketing drop down
}

@Then("^naviate to marketing report page$")
public void naviate_to_marketing_report_page() throws Throwable {
    String t2=driver.getTitle();
    Assert.assertEquals("Marketing Report",t2);
    System.out.println("marketing report page is displayed"); //verifying if marketing report page is displayed
}


@When("^click on Affliate option in drop down$")
public void click_on_affliate_option_in_drop_down() throws Throwable {
	Reports2 r = new Reports2(driver);
	r.getAffliateCommRep().click(); // navigating to affiliate Commission Report page
	
}

@Then("^Navigate to Affliate commission report page$")
public void navigate_to_affliate_commission_report_page() throws Throwable {
	String t2=driver.getTitle();
    Assert.assertEquals("Affiliate Commission Report",t2);
    System.out.println("Affiliate Commission Report page is displayed");//verifying if affiliate Commission Report page is displayed
}

@When("^click on Affliate activity option in the drop down$")
public void click_on_affliate_activity_option_in_the_drop_down() throws Throwable {
	Reports2 r = new Reports2(driver);
	r.getAffliateAct().click(); //navigating to affiliate activity report page
}

@Then("^Navigate to Affliate activity page$")
public void navigate_to_affliate_activity_page() throws Throwable {
    String t3=driver.getTitle();
    Assert.assertEquals("Affiliate Activity Report",t3); //verifying if affiliate activity report page is displayed
    System.out.println("Affiliate Acivity report page is displayed");
}


@When("^enter Ip address in the Ip address textbox of Affliate activity report page$")
public void enter_ip_address_in_the_ip_address_textbox_of_affliate_activity_report_page() throws Throwable {
	Reports2 r = new Reports2(driver);
	r.getAARiP().sendKeys("122.164.104.142");
}

@And("^click on filter in the Marketing Affliate activity page$")
public void click_on_filter_in_the_marketing_affliate_activity_page() throws Throwable {
	Reports2 r = new Reports2(driver);
	r.getAArfilter().click();
}

























};
