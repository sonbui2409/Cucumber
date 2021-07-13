package steps;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginSteps {
	WebDriver driver;
	//@Before
	public void initdriver() {
		if (driver == null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
	}
	@After
	public void closedriver() {
		driver.close();
	}
	
	@Given("^I want to use \"([^\"]*)\"$")
	public void i_want_to_use(String browser) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if (browser.toLowerCase().equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.toLowerCase().equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}	
		
		driver.manage().window().maximize();
	}
	
	@Given("^I want to login to page \"([^\"]*)\"$")
	public void i_want_to_login_to_page(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(url);

	}

	@When("^I input username as \"([^\"]*)\"$")
	public void i_input_username_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name = 'uid']")).sendKeys(arg1);
	}

	@When("^I input password as \"([^\"]*)\"$")
	public void i_input_password_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(arg1);

	}

	@When("^I Click to login button$")
	public void i_Click_to_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name = 'btnLogin']")).click();
	}

	@Then("^I can see the home page$")
	public void i_can_see_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String exp = "http://demo.guru99.com/v4/manager/Managerhomepage.php";
		Assert.assertEquals(exp, driver.getCurrentUrl());
	}

}
