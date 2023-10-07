package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class jf {
	ChromeDriver ob;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   System.out.println("on login page");
	   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		//id=user
		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    
		System.out.println("Entering username and password");
ob.findElementById("user").sendKeys("Dhivyakarthi123");
		
		//name=pass
		ob.findElementByName("pass").sendKeys("12345");
		
		
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("clicking on login button");
		//classname=btn_log
				ob.findElementByClassName("btn_log").click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	  System.out.println("in home page ");
	  ob.quit();
	}



}
