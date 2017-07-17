package uptakeProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import uptakeProject.utils.Driver;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(){
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//a[.='Privacy Policy']")
	public WebElement privacyPolicyLink;
	
	@FindBy(xpath = "//button[@class='real-button ui primary button cta']")
	public WebElement contactButton;
	
	public void goToContactPage(){
		contactButton.click();
	}
	

}
