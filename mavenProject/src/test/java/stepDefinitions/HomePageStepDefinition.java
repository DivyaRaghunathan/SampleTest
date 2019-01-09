package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pagePackage.HomePageClass;

public class HomePageStepDefinition extends HomePageClass{
	
	@Given("^I want to open browser \"(.*)\"$")
	public void open_browser(String browser){
		openBrowser(browser);		
	}
	
	@And ("^I want to launch the application \"(.*)\"$")
	public void launch_app(String url){
		navigateURL(url);
	}
	
	@And("^I want to enter to text box \"(.*)\" and a value is \"(.*)\"$")
	public void enter_text(String xpath, String value){
		enterText(xpath, value);
	}
	
	@Then ("^I want to click on \"(.*)\" text box$")
	public void want_click_button (String xpath){
		clickButton(xpath);
	}

}
