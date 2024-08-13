package com.JetEdge.StepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JE_QP_3_UserLogReport {
	public WebDriver driver;
	public WebElement ele, ele1, ele2, ele3, ele4, ele5, ele6, ele7, ele8, ele9;
	public WebDriverWait wait;

	@Given("To Check User log report User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=new");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check User log report User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		ele1=driver.findElement(By.id("txtUserName"));
		ele1.clear();
		ele1.sendKeys(UserName);
		ele2=driver.findElement(By.id("txtPassword"));
		ele2.clear();
		ele2.sendKeys(Password);
		System.out.print("\u001B[1mUsername and password entered\u001B[0m");

	}

	@And("click the Signin button To Check User log report")
	public void click_the_SignIn_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.print("\u001B[1mLogin button clicked\u001B[0m");
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.print("\u001B[1mAlert message is displayed like : \u001B[0m" + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.print("\u001B[1mNo Alert message is displayed\u001B[0m");
		}

	}

	@And("close the User log report Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.print("\u001B[1mPage is closed\u001B[0m");

	}

	@Then("Check Page Landed to Homepage or not in User log report")
	public void Click_the_menu_icon_in_homepage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("lblModuleName")));
		ele = driver.findElement(By.id("lblModuleName"));
		if(ele.isDisplayed()) {
			System.out.println("Page landed to homepage");
		}
		else {
			System.out.println("Page doesnot landed to homepage");
		}
	}

	@Then("Click Login Report button in user log report")
	public void click_create_user_button_in_admin() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[2]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[2]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ADMUSRLOG")));
		ele1 = driver.findElement(By.id("ADMUSRLOG"));
		ele1.click();
	}
	@And("Select valid from date in Login Report")
	public void select_valid_from_date_in_login_report() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtSchFromDate")));
		ele1 = driver.findElement(By.id("txtSchFromDate"));
		ele1.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender1_title")));
		ele2 = driver.findElement(By.id("CalendarExtender1_title"));
		ele2.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender1_month_0_0")));
		ele3 = driver.findElement(By.id("CalendarExtender1_month_0_0"));
		ele3.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender1_day_0_0")));
		ele4 = driver.findElement(By.id("CalendarExtender1_day_0_0"));
		ele4.click();
		driver.switchTo().defaultContent();
	}
	@Then("Uncheck the check box in support team tab in Login Report")
	public void uncheck_the_check_box_in_support_team_tab_in_login_report() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cbInclude")));
		ele1 = driver.findElement(By.id("cbInclude"));
		if(ele1.isSelected()) {
			System.out.println("Checkbox is already selected");
			ele1.click();
		}
		else {
			System.out.println("Checkbox is not selected");
		}
		driver.switchTo().defaultContent();
	}
	@And("Uncheck the check box in Owner tab in Login Report")
	public void uncheck_the_check_box_in_owner_tab_in_login_report() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cbOwner")));
		ele1 = driver.findElement(By.id("cbOwner"));
		if(ele1.isSelected()) {
			System.out.println("Checkbox is already selected");
			ele1.click();
		}
		else {
			System.out.println("Checkbox is not selected");
		}
		driver.switchTo().defaultContent();
	}
	@Then("Click submit button in Login Report")
	public void click_submit_button_in_login_report() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSubmit")));
		ele1 = driver.findElement(By.id("btnSubmit"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	@Then("Select the check box in support team tab in Login Report")
	public void select_the_check_box_in_support_team_tab_in_login_report() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cbInclude")));
		ele1 = driver.findElement(By.id("cbInclude"));
		if(ele1.isSelected()) {
			System.out.println("Checkbox is already selected");
		}
		else {
			System.out.println("Checkbox is not selected");
			ele1.click();
		}
		driver.switchTo().defaultContent();
	}

	@And("Select the check box in Owner tab in Login Report")
	public void select_the_check_box_in_owner_tab_in_login_report() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cbOwner")));
		ele1 = driver.findElement(By.id("cbOwner"));
		if(ele1.isSelected()) {
			System.out.println("Checkbox is already selected");
		}
		else {
			System.out.println("Checkbox is not selected");
			ele1.click();
		}
		driver.switchTo().defaultContent();
	}

	@And("Click export button in Login Report")
	public void click_export_button_in_login_report() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cbOwner")));
		ele1 = driver.findElement(By.id("cbOwner"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	@Then("Click Crew Login button in user log report")
	public void click_crew_login_button_in_user_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[2]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[2]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CREWLOG")));
		ele1 = driver.findElement(By.id("CREWLOG"));
		ele1.click();
	}
	@And("Select valid from date in Crew Login")
	public void select_valid_from_date_in_crew_login() throws InterruptedException {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtSchFromDate")));
		ele1 = driver.findElement(By.id("txtSchFromDate"));
		ele1.click();
		Thread.sleep(2000);
		//Month click
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender1_title")));
		ele2 = driver.findElement(By.id("CalendarExtender1_title"));
		ele2.click();
		Thread.sleep(2000);
		//Year click
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender1_title")));
		ele3 = driver.findElement(By.id("CalendarExtender1_title"));
		ele3.click();
		Thread.sleep(2000);
		//Year select
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender1_year_0_0")));
		ele4 = driver.findElement(By.id("CalendarExtender1_year_0_0"));
		ele4.click();
		Thread.sleep(2000);
		//Month select
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender1_month_0_0")));
		ele5 = driver.findElement(By.id("CalendarExtender1_month_0_0"));
		ele5.click();
		Thread.sleep(2000);
		//Date select
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender1_day_0_0")));
		ele6 = driver.findElement(By.id("CalendarExtender1_day_0_0"));
		ele6.click();
		driver.switchTo().defaultContent();
	}
	@Then("Click submit button in Crew Login")
	public void click_submit_button_in_crew_login() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSubmit")));
		ele1 = driver.findElement(By.id("btnSubmit"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	@And("Click export button in Crew Login")
	public void click_export_button_in_crew_login() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnExport")));
		ele1 = driver.findElement(By.id("btnExport"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	@And("Click expand button in Crew Login")
	public void click_expand_button_in_crew_login() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[3]/table[3]/tbody/tr[2]/td/div/table/tbody/tr[2]/td[1]/a/img")));
		ele1 = driver.findElement(By.xpath("/html/body/form/div[3]/table[3]/tbody/tr[2]/td/div/table/tbody/tr[2]/td[1]/a/img"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	@Then("Click Dashboard button in user log report")
	public void click_dashboard_button_in_user_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[2]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[2]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ADMUSERRDASH")));
		ele1 = driver.findElement(By.id("ADMUSERRDASH"));
		ele1.click();
	}
	@And("Select valid from date in Dashboard")
	public void select_valid_from_date_in_dashboard() throws InterruptedException {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtFromDate")));
		ele1 = driver.findElement(By.id("txtFromDate"));
		ele1.click();
		Thread.sleep(2000);
		//Month click
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender1_title")));
		ele2 = driver.findElement(By.id("CalendarExtender1_title"));
		ele2.click();
		Thread.sleep(2000);
		//Year click
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender1_title")));
		ele3 = driver.findElement(By.id("CalendarExtender1_title"));
		ele3.click();
		Thread.sleep(2000);
		//Year select
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender1_year_0_0")));
		ele4 = driver.findElement(By.id("CalendarExtender1_year_0_0"));
		ele4.click();
		Thread.sleep(2000);
		//Month select
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender1_month_0_0")));
		ele5 = driver.findElement(By.id("CalendarExtender1_month_0_0"));
		ele5.click();
		Thread.sleep(2000);
		//Date select
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender1_day_0_0")));
		ele6 = driver.findElement(By.id("CalendarExtender1_day_0_0"));
		ele6.click();
		driver.switchTo().defaultContent();
	}
	@Then("Uncheck the check box in support team tab")
	public void uncheck_the_check_box_in_support_team_tab() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cbInclude")));
		ele1 = driver.findElement(By.id("cbInclude"));
		if(ele1.isSelected()) {
			System.out.println("Checkbox is already selected");
			ele1.click();
		}
		else {
			System.out.println("Checkbox is not selected");
		}
		driver.switchTo().defaultContent();
	}
	
	@Then("Select the check box in support team tab")
	public void select_the_check_box_in_support_team_tab() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cbInclude")));
		ele1 = driver.findElement(By.id("cbInclude"));
		if(ele1.isSelected()) {
			System.out.println("Checkbox is already selected");
		}
		else {
			System.out.println("Checkbox is not selected");
			ele1.click();
		}
		driver.switchTo().defaultContent();
	}
	
	@And("Uncheck the check box in Owner tab")
	public void uncheck_the_check_box_in_owner_tab() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cbOwner")));
		ele1 = driver.findElement(By.id("cbOwner"));
		if(ele1.isSelected()) {
			System.out.println("Checkbox is already selected");
			ele1.click();
		}
		else {
			System.out.println("Checkbox is not selected");
		}
		driver.switchTo().defaultContent();
	}
	
	@And("Select the check box in Owner tab")
	public void select_the_check_box_in_owner_tab() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cbOwner")));
		ele1 = driver.findElement(By.id("cbOwner"));
		if(ele1.isSelected()) {
			System.out.println("Checkbox is already selected");
		}
		else {
			System.out.println("Checkbox is not selected");
			ele1.click();
		}
		driver.switchTo().defaultContent();
	}
	
	@Then("Click Run button")
	public void click_run_button() throws InterruptedException {
		Thread.sleep(3000);
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnRun")));
		ele1 = driver.findElement(By.id("btnRun"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	@And("Click View button in Dashboard")
	public void click_view_button_in_dashboard() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvUsers_imbView_0")));
		ele1 = driver.findElement(By.id("gvUsers_imbView_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	@And("Click View button in screen log in Dashboard")
	public void click_view_button_in_screen_login_dashboard() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvScreen_imbView_0")));
		ele1 = driver.findElement(By.id("gvScreen_imbView_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	@Then("Click close button in Dashboard")
	public void click_close_button_in_dashboard() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnUserClose")));
		ele1 = driver.findElement(By.id("btnUserClose"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	@And("Click screen log button in Dashboard")
	public void click_screen_log_button_in_dashboard() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ahour")));
		ele1 = driver.findElement(By.id("ahour"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Enter valid name {string} in Login Report")
	public void enter_valid_name_in_login_report(String UserName) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtSearch")));
		ele1 = driver.findElement(By.id("txtSearch"));
		ele1.sendKeys(UserName);
		driver.switchTo().defaultContent();
	}

	@And("Click expand button in Login Report")
	public void click_expand_button_in_login_report() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgdiv148565")));
		ele1 = driver.findElement(By.xpath("/html/body/form/div[3]/table[3]/tbody/tr[2]/td/div/table/tbody/tr[2]/td[1]/a/img"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
}
