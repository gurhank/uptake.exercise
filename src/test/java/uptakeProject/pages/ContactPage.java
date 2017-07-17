package uptakeProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import uptakeProject.utils.Driver;

public class ContactPage {

	WebDriver driver;
	
	public ContactPage(){
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "firstname")
	public WebElement firstName;
	
	@FindBy(name = "lastname")
	public WebElement lastName;
	
}
