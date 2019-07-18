package com.stepdefination;

import java.util.List;
import java.util.Map;

import org.Tarrifplan.objectrepository.Testbase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.stepdefination.Hooks;

import org.Tarrifplan.objectrepository.Addcustomerpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addcutomersteps extends Testbase {
	static WebDriver driver;

	@Given("the user should be telecom homepage and click the add customer")
	public void the_user_should_be_telecom_homepage_and_click_the_add_customer() {
		Hooks.driver.get("http://demo.guru99.com/telecom/addcustomer.php");
	}

	@When("The user provide valid details")
	public void the_user_provide_valid_details(io.cucumber.datatable.DataTable custdetails) {
		List<Map<String, String>> cust = custdetails.asMaps(String.class, String.class);
		Addcustomerpage customer = new Addcustomerpage();
		customer.getRdo_done().click();

		customer.getTxt_fname().sendKeys(cust.get(0).get("fname"));
		customer.getTxt_lname().sendKeys(cust.get(0).get("lname"));
		customer.getTxt_email().sendKeys(cust.get(0).get("email"));
		customer.getTxt_address().sendKeys(cust.get(0).get("address"));
		customer.getTxt_phnnum().sendKeys(cust.get(0).get("phone"));
	}

	@When("The user submits the form")
	public void the_user_submits_the_form() {
		Addcustomerpage customer = new Addcustomerpage();
		customer.getBtn_submit().click();
	}

	@Then("To genatrate the customer id")
	public void to_genatrate_the_customer_id() {
		Assert.assertTrue(Hooks.driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}

}
