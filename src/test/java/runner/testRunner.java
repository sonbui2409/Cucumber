package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			
			features = "src/test/java/features", //path for features package
			glue = {"steps"}, //path for steps package
			plugin = {
					"pretty:My_Report/cucumber-pretty.txt",
					"json:My_Report/cucumber.json",
					"junit:My_Report/cucumber.xml",
					"html:My_Report/cucumber-report" //report of cucumber
					//"com.cucumber.listener.ExtentCucumberFormatter:My_Report/cucumber-ExetentReport.html" //report following extent report format
			}
)

public class testRunner {
		
		//@AfterClass
		public static void writeReport() {
			Reporter.loadXMLConfig(new File(System.getProperty("user.dir" + "/Extent-Config.xml")));
			
			
			Reporter.setSystemInfo("User Name", "Shin Black");
			Reporter.setSystemInfo("Application Name", "Test Web");
			Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
			Reporter.setSystemInfo("Environment", "Production");
			Reporter.setTestRunnerOutput("Cucumber Framework Reports");
			
		}

}
