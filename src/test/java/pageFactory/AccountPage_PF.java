/**
 * Design Pattern used - Page Object Model (POM) by using Page Factory. 
 * The AccountPage_PF.Java file find the all the Locators available on the page. All required methods are written here.
 *
 * @author  Sachin Nagare
 * @version 1.0
 * @since   2020-01-16
 */
package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage_PF {
	
	@FindBy (id="sandbox_open")
	WebElement link_getInTouch;
	
	
	public void validateGetInTouchLink() {
		link_getInTouch.isDisplayed();
	}

}
