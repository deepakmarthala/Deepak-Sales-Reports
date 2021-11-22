Feature: orders

Background: login with admin credentials and clicking on menu button

						Given Login with admin Creditials
    				And Click on menu button and then sales
 
  @Navigation
  Scenario: Verify orders functionality in sales
  
    
    
    When Click on orders
    Then Navigate to orders page
   
   
    When click on recurring orders
    Then Navigate to recurring orders page
    
    When click on Returns
    Then Navigate to returns page
    
    When click on gift vouchers
    Then click on giftVouchers in the dropdown
    Then navigate to Gift vouchers page
    
    When click on voucher themes in gift voucher dropdown
    Then navigate to voucher themes page
    
    When click on PayPal
    Then click on search in the dropdown
    Then navigate to the search page
    
    @Orders
    Scenario: Verifying all the functionalities in orders option
     
    When click on Orders option
    Then enter the order id in the order id text box
    Then click on filter
    
    Then click on view button
    
    Then click on UniformStore link
    
    Then click on print invoice button
    
    Then click on print shiplist button
    
    Then click on cancel button
    
    Then click on check Box
    
    @Returns
    Scenario: Verifying the functionalities in returns option
    Then click on returns option in sales drop down
    Then enter the return Id in the returnId text box
    Then click on filter button
    Then click on returns option in sales drop down
    Then click on return option again
    When selecting the check box
    Then click on delete button
    
@RecurringOrderOption

Scenario: Verifying the functionalities of options in Recurring Order option

When click on recurring orders and get text from table
And enter recurring id and click on filter
Then should display no results in the table

@GiftVoucherOption

Scenario: Ver Verifying the functionalities of options in Gift voucher option in Gift voucher dropdown

When click on GiftVouchers in gift vouchers drop down
Then navigate to giftVouchers page
Then click on check box and click on delete button

When click on voucher themes option in gift vouchers drop down
Then click on edit and enter the voucher theme name
And click on save

@PayPal
Scenario: Open search in paypal dropdown

When click on paypal option in sals drop down
Then Open search in the dropdown

@Reports
Scenario: Customer and MArrketing option in the Reports drop down

When click on Reports
Then in the dropdown click on customers
Then in the dropdown click on customers online


Then enter the IP address in the Ip  address text box
And Click on filter in in that page

When click on customer activity
Then Navigate to customer activity page
Then In the customer activity page enter Id address
And click on filter in the customer activity page

When click on order option in the Reports customers dropdown
Then Navigate to order page of customers dropdown

When click on rewards points in the customers dropdown of Reports drop down
Then navigate to rewards points page

When click on Credits options
Then navigate to customer credit report page

When click on marketing drop down
Then click on marketing reports option in the drop down
Then naviate to marketing report page

When click on Affliate option in drop down
Then Navigate to Affliate commission report page

When click on Affliate activity option in the drop down
Then Navigate to Affliate activity page

When enter Ip address in the Ip address textbox of Affliate activity report page
And click on filter in the Marketing Affliate activity page
















