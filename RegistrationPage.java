package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage {
	WebDriver driver;
	
	
	//for signin 
	//driver.findElement(By.xpath("//a[normalize-space(text())='Sign in'] ")).click();
	public void ClickCreateccountButton()
	{
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
	}
	public void EnterEmailId(String email)
	{
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys(email);
	}
	public void selectGenderType()
	{
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
	}
	public void EnterFirstName(String firstName)
	{
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys(firstName);
	}
	public void EnterLastName(String lastName)
	{
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys(lastName);	
	}
	public void EnteraEmailId(String password)
	{
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys(password);	
	}
	public void SelectDate()
	{
		SelectByText(By.xpath("//select[@id='days']"),"Days","29");
	}
	public void SelectMonth()
	{
		SelectByText(By.xpath("//select[@id='months']"),"Months","September ");
	}
	public void SelectYear()
	{
		SelectByText(By.xpath("//select[@id='years']"),"Years","1997");
	}
	public void SelectCheckBox1()
	{
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
	}
	public void SelectCheckBox2()
	{
		driver.findElement(By.xpath("///input[@id='optin']")).click();
	}
	public void EnterCompany(String companyName)
	{
		Enter(By.xpath("//input[@id='company']"),"Company",companyName);
	}
	public void EnterAddress(String address)
	{
		Enter(By.xpath("//input[@id='address1']"),"address1",address);
	}
	public void EnterCity(String city)
	{
		Enter(By.xpath("//input[@id='city']"),"City",city);
	}
	public void SelectState(String state)
	{
		SelectByText(By.xpath("//select[@id='id_state']"),"State",state);
	}
	public void EnterZipCode(String zipCode)
	{
		Enter(By.xpath("//input[@id='postcode']"),"Postcode",zipCode);
	}
	public void SelectCountry(String country)
	{
		SelectByText(By.xpath("//select[@id='id_country']"),"Country",country);
	}
	public void EnterMobileNumber(String mobileNumber)
	{
		Enter(By.xpath("//input[@id='phone_mobile']"),"MobileNumber",mobileNumber);
	}
	public void ClickRegister()
	{
		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
	}
	public void ConfirmAccountPage()
	{
		
	}

}
