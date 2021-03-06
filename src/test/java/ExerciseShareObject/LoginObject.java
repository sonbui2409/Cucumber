package ExerciseShareObject;


import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import com.aventstack.extentreports.ExtentTest;
import ExerciseBaseCommon.BaseActions;
import ExerciseBaseCommon.DataTest;
import ExerciseBaseCommon.ManageObject;

public class LoginObject extends BaseActions {
	// Include xpath
	/*
	 * protected String passwd = "secret_sauce"; protected String url =
	 * "https://www.saucedemo.com/"; protected String login =
	 * "//input[@type='submit']"; protected String user =
	 * "//input[@name = 'user-name']"; protected String passbut =
	 * "//input[@id = 'password']"; protected String error =
	 * "//h3[@data-test='error']"; protected String errorbut =
	 * "//button[@class='error-button']"; protected String failure1 =
	 * "Epic sadface: Sorry, this user has been locked out."; protected String
	 * failure2 =
	 * "Epic sadface: You can only access '/inventory.html' when you are logged in."
	 * ; protected String failure3 = "Epic sadface: Username is required"; protected
	 * String failure4 = "Epic sadface: Password is required"; protected String
	 * failure5 =
	 * "Epic sadface: Username and password do not match any user in this service";
	 * //ExcelInit reader = new ExcelInit();
	 */
	// method or action into element on page

	WebDriver LocalDriver; //create a Localdriver which will be = driver to define LocalDriver in Return Class
	protected static ExtentTest LocalLog;
	
	public ExtentTest getLoglocal() {
		return LocalLog;
	}
	
	public LoginObject(WebDriver remoteDriver,ExtentTest remoteLog) {
		super (remoteDriver, remoteLog); //call constructor of Father class (baseActions)
		LocalDriver = remoteDriver;
		LocalLog = remoteLog;

	}
	
	public void updateLocalLog(ExtentTest log) {
		updateLog(log);
		LocalLog = log;
	}

	public LoginObject OpenLoginPage() {
		// GotoURL(log, url);
		GotoURL(readExl("Login", DataTest.CUrl, DataTest.Rurl));
		return this;
	}

	public InventoryObject Login() {
		/*
		 * GotoURL(log, url); InputdataXpath(log, user,
		 * "standard_user"); InputdataXpath(log, passbut, passwd);
		 * ClickXpath(log, login);
		 */
		OpenLoginPage();
		InputUserName(readExl("Login", DataTest.CUser, DataTest.Ruser));
		InputPasswd();
		ClickLogin_but();
		
		
		/*GotoURL(readExl("Login", DataTest.CUrl, DataTest.Rurl));
		InputdataXpath(readExl("Xpath", DataTest.Cxpt_login,DataTest.Rxpt_user), readExl("Login", DataTest.CUser, DataTest.Ruser));
		InputdataXpath(readExl("Xpath", DataTest.Cxpt_login, DataTest.Rxpt_passwd ), readExl("Login", DataTest.CPass, DataTest.Rpass));
		ClickXpath(readExl("Xpath", DataTest.Cxpt_login, DataTest.Rxpt_login));*/
		return ManageObject.ManageInven(LocalDriver, LocalLog);
	}

	// Input Data
	public LoginObject InputUserName(String data) {
		InputdataXpath(readExl("Xpath", DataTest.Cxpt_login, DataTest.Rxpt_user), data);
		return this;
	}

	public LoginObject InputPasswd() {
		InputdataXpath(readExl("Xpath", DataTest.Cxpt_login, DataTest.Rxpt_passwd), readExl("Login", DataTest.CPass, DataTest.Rpass));
		return this;
	}

	public LoginObject InputPasswd_error(String data) {
		InputdataXpath(readExl("Xpath", DataTest.Cxpt_login, DataTest.Rxpt_passwd), data);
		return this;
	}

	// Click
	public InventoryObject ClickLogin_but() {
		ClickXpath(readExl("Xpath", DataTest.Cxpt_login, DataTest.Rxpt_login));
		return ManageObject.ManageInven(LocalDriver, LocalLog);
	}

	// Verify
	public LoginObject Verify_fail(String expect) {
		AssertEqual(readExl("Xpath", DataTest.Cxpt_login, DataTest.Rxpt_error), expect);
		return this;
	}

	public LoginObject Verify_fail_1() {
		AssertEqual(readExl("Xpath", DataTest.Cxpt_login, DataTest.Rxpt_error),readExl("Login", DataTest.CError, DataTest.Rerrorlock ));
		return this;
	}

	/*public LoginObject Verify_fail_2(WebDriverWait wait, ExtentTest log) {
		waitclickable(wait, readExl("Xpath", DataTest.CXpath_login, DataTest.RXpath_error));
		GetTextEqual(log, readExl("Xpath", DataTest.ColXpath, 4),readExl("Login", DataTest.ColError, 2));
		waitclickable(wait, readExl("Xpath", DataTest.ColXpath, 5));
		ClickXpath(log, readExl("Xpath", DataTest.ColXpath, 5));
		return this;
	}

	public LoginObject Verify_fail_3(ExtentTest log) {
		InputdataXpath(log, readExl("Xpath", 1, 2), "aaa");
		ClickXpath(log, readExl("Xpath", 1, 3));
		GetTextEqual(log, readExl("Xpath", 1, 4), readExl("Login", DataTest.ColError, 3));
		return this;
	}

	public LoginObject Verify_fail_4(WebDriverWait wait, ExtentTest log) {
		waitvisible(wait, readExl("Xpath", 1, 1));
		InputdataXpath(log, readExl("Xpath", 1, 1), "abc");
		ClearDataxpath(log, readExl("Xpath", 1, 2));
		ClickXpath(log, readExl("Xpath", 1, 3));
		GetTextEqual( log, readExl("Xpath", 1, 4), readExl("Login", DataTest.ColError, 4));
		return this;
	}

	public LoginObject Verify_fail_5( ExtentTest log) {
		ClearDataxpath(log, readExl("Xpath", 1, 1));
		InputdataXpath(log, readExl("Xpath", 1, 1), "abc");
		ClearDataxpath(log, readExl("Xpath", 1, 2));
		InputdataXpath(log, readExl("Xpath", 1, 2), "aaa");
		ClickXpath(log, readExl("Xpath", 1, 3));
		GetTextEqual(log, readExl("Xpath", 1, 4), readExl("Login", DataTest.ColError, 5));
		return this;
	}*/

	public LoginObject Compare_login_but() {
		AssertDisplay_true(readExl("Xpath", DataTest.Cxpt_login, DataTest.Rxpt_login));
		return this;
	}

	// Read excel

	// Track SoftAssert
	public LoginObject TracksAssert(SoftAssert softAssert) {
		softAssertAll(softAssert);
		return this;
	}

}
