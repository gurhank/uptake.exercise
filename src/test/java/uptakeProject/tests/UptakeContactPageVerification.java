package uptakeProject.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import uptakeProject.pages.ContactPage;
import uptakeProject.pages.HomePage;
import uptakeProject.utils.Driver;

public class UptakeContactPageVerification {

	WebDriver driver;

	@BeforeClass
	public static void setUp() throws Exception {
		Driver.getDriver().manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		Driver.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	@Test
	public void verifyContactPage() throws InterruptedException {

		Driver.getDriver().get("http://uptake.com");
		HomePage homePage = new HomePage();
		
		
		homePage.goToContactPage();
		
		Thread.sleep(2000);
		
		/* Going to 'Contact us' page
		 * Asserting expected title "Contact Us" is matching the actual title
		 * Navigating back to HomePage
		 * Asserting the actual title and the expected title
		 * 
		 */
		assertTrue(new ContactPage().firstName.isDisplayed());
		assertEquals("Contact Us", Driver.getDriver().getTitle());

		Driver.getDriver().navigate().back();

		assertEquals("Analytics for the industrial internet", Driver.getDriver().getTitle());

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(1500);
		Driver.getDriver().close();
	}

}
