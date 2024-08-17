package com.JetEdge.StepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
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

public class JE_QP_2_Admin {
	public WebDriver driver;
	public WebElement ele, ele1, ele2, ele3, ele4, ele5, ele6, ele7, ele8, ele9;
	public WebDriverWait wait;

	@Given("To Check Admin User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=new");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check Admin User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		ele1=driver.findElement(By.id("txtUserName"));
		ele1.clear();
		ele1.sendKeys(UserName);
		ele2=driver.findElement(By.id("txtPassword"));
		ele2.clear();
		ele2.sendKeys(Password);
		System.out.print("\u001B[1mUsername and password entered\u001B[0m");

	}

	@And("click the Signin button To Check Admin")
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

	@And("close the Admin Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.print("\u001B[1mPage is closed\u001B[0m");

	}

	@Then("Check Page Landed to Homepage or not in Admin")
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

	@Then("Click create user button in Admin")
	public void click_create_user_button_in_admin() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[1]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[1]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("MGNTADMUSR")));
		ele1 = driver.findElement(By.id("MGNTADMUSR"));
		ele1.click();
	}
	
	@And("Click export button and check page behaviour")
	public void click_export_button_and_check_page_behaviour() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnExport")));
		ele1 = driver.findElement(By.id("btnExport"));
		ele1.click();
		driver.switchTo().defaultContent();
	}

	@And("Select valid user type in the dropdown")
	public void select_valid_user_type_in_the_dropdown() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlFUserType")));
		ele1 = driver.findElement(By.id("ddlFUserType"));
		Select sel=new Select(ele1);
		sel.selectByIndex(0);
		driver.switchTo().defaultContent();
	}
	
	@Then("Click search button and check page behaviour")
	public void click_search_button_and_check_page_behaviour() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSearch")));
		ele1 = driver.findElement(By.id("btnSearch"));
		ele1.click();
	}
	
	@And("Enter valid user name or email {string} in search box")
	public void enter_valid_user_name_or_email_in_search_box(String Email) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtSearch")));
		ele1 = driver.findElement(By.id("txtSearch"));
		ele1.sendKeys(Email);
		driver.switchTo().defaultContent();
	}

	@And("Click add user button in create user")
	public void click_add_user_button_in_create_user() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnAddNew")));
		ele1 = driver.findElement(By.id("btnAddNew"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Click save button in create user")
	public void click_save_button_in_create_user() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSave")));
		ele1 = driver.findElement(By.id("btnSave"));
		ele1.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message Displayed like : "+text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No Alert Message Displayed");
		}
		driver.switchTo().defaultContent();
	}

	@And("Click back button in create user")
	public void click_back_button_in_create_user() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnBack")));
		ele1 = driver.findElement(By.id("btnBack"));
		ele1.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click all radio button in choose company field")
	public void click_all_radio_button_in_choose_company_field() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rblCompany_1")));
		ele1 = driver.findElement(By.id("rblCompany_1"));
		ele1.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rblCompany_2")));
		ele2 = driver.findElement(By.id("rblCompany_2"));
		ele2.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rblCompany_0")));
		ele3 = driver.findElement(By.id("rblCompany_0"));
		ele3.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Click Back button in choose company field")
	public void click_back_button_in_choose_company_field() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnBack")));
		ele1 = driver.findElement(By.id("btnBack"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click add button in user role")
	public void click_add_button_in_user_role() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgAdd")));
		ele1 = driver.findElement(By.id("imgAdd"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click save button in user role")
	public void click_save_button_in_user_role() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnCSave")));
		ele1 = driver.findElement(By.id("btnCSave"));
		ele1.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message Displayed like : "+text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No Alert Message Displayed");
		}
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message Displayed like : "+text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No Alert Message Displayed");
		}
		driver.switchTo().defaultContent();
	}
	
	@Then("Click close button in user role")
	public void click_close_button_in_user_role() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnCClose")));
		ele1 = driver.findElement(By.id("btnCClose"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter valid detail {string} in user role")
	public void enter_valid_detail_in_user_role(String UserRole) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtUserRole")));
		ele1 = driver.findElement(By.id("txtUserRole"));
		ele1.sendKeys(UserRole);
		driver.switchTo().defaultContent();
	}
	
	@Then("Click edit button in user role")
	public void click_edit_button_in_user_role() throws InterruptedException {
		Thread.sleep(2000);
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgTypeUpdate")));
		ele1 = driver.findElement(By.id("imgTypeUpdate"));
		ele1.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message Displayed like : "+text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No Alert Message Displayed");
		}
		driver.switchTo().defaultContent();
	}
	
	@Then("Select valid user role {string} in user role")
	public void select_valid_user_role_in_user_role(String UserRole) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlUserRole")));
		ele1 = driver.findElement(By.id("ddlUserRole"));
		Select sel=new Select(ele1);
		sel.selectByVisibleText(UserRole);
		driver.switchTo().defaultContent();
	}
	
	@And("Modify valid detail in user role")
	public void modify_valid_detail_in_user_role() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtUserRole")));
		ele1 = driver.findElement(By.id("txtUserRole"));
		String text = ele1.getAttribute("value");
		ele2 = driver.findElement(By.id("txtUserRole"));
		ele2.clear();
		ele2.sendKeys(text);
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter numerical values {string} in first name field in create user")
	public void enter_numerical_values_in_first_name_field_in_create_user(String FirstName) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtFirstName")));
		ele1 = driver.findElement(By.id("txtFirstName"));
		ele1.sendKeys(FirstName);
		driver.switchTo().defaultContent();
	}
	
	@And("Check first name field in create user")
	public void check_first_name_field_in_create_user() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtFirstName")));
		ele1 = driver.findElement(By.id("txtFirstName"));
		String text = ele1.getAttribute("value");
		if(text.isEmpty()) {
			System.out.println("First Name Field is Empty");
		}
		else {
			System.out.println("First Name Field is not Empty");
		}
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter special characters values {string} in first name field in create user")
	public void enter_special_characters_values_in_first_name_field_in_create_user(String FirstName) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtFirstName")));
		ele1 = driver.findElement(By.id("txtFirstName"));
		ele1.sendKeys(FirstName);
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter alpha characters values {string} in first name field in create user")
	public void enter_alpha_characters_values_in_first_name_field_in_create_user(String FirstName) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtFirstName")));
		ele1 = driver.findElement(By.id("txtFirstName"));
		ele1.sendKeys(FirstName);
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter numerical values {string} in Middle name field in create user")
	public void enter_numerical_values_in_middle_name_field_in_create_user(String MiddleName) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtMiddleName")));
		ele1 = driver.findElement(By.id("txtMiddleName"));
		ele1.sendKeys(MiddleName);
		driver.switchTo().defaultContent();
	}
	
	@And("Check Middle name field in create user")
	public void check_middle_name_field_in_create_user() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtMiddleName")));
		ele1 = driver.findElement(By.id("txtMiddleName"));
		String text = ele1.getAttribute("value");
		if(text.isEmpty()) {
			System.out.println("First Name Field is Empty");
		}
		else {
			System.out.println("First Name Field is not Empty");
		}
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter special characters values {string} in Middle name field in create user")
	public void enter_special_characters_values_in_middle_name_field_in_create_user(String MiddleName) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtMiddleName")));
		ele1 = driver.findElement(By.id("txtMiddleName"));
		ele1.sendKeys(MiddleName);
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter alpha characters values {string} in Middle name field in create user")
	public void enter_alpha_characters_values_in_middle_name_field_in_create_user(String MiddleName) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtMiddleName")));
		ele1 = driver.findElement(By.id("txtMiddleName"));
		ele1.sendKeys(MiddleName);
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter numerical values {string} in Last name field in create user")
	public void enter_numerical_values_in_last_name_field_in_create_user(String LastName) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtLastName")));
		ele1 = driver.findElement(By.id("txtLastName"));
		ele1.sendKeys(LastName);
		driver.switchTo().defaultContent();
	}
	
	@And("Check Last name field in create user")
	public void check_last_name_field_in_create_user() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtLastName")));
		ele1 = driver.findElement(By.id("txtLastName"));
		String text = ele1.getAttribute("value");
		if(text.isEmpty()) {
			System.out.println("First Name Field is Empty");
		}
		else {
			System.out.println("First Name Field is not Empty");
		}
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter special characters values {string} in Last name field in create user")
	public void enter_special_characters_values_in_last_name_field_in_create_user(String LastName) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtLastName")));
		ele1 = driver.findElement(By.id("txtLastName"));
		ele1.sendKeys(LastName);
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter alpha characters values {string} in Last name field in create user")
	public void enter_alpha_characters_values_in_last_name_field_in_create_user(String LastName) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtLastName")));
		ele1 = driver.findElement(By.id("txtLastName"));
		ele1.sendKeys(LastName);
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter valid first name {string} in create user")
	public void enter_valid_first_name_in_create_user(String FirstName) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtFirstName")));
		ele1 = driver.findElement(By.id("txtFirstName"));
		ele1.sendKeys(FirstName);
		driver.switchTo().defaultContent();
	}
	
	@And("Enter valid Middle name {string} in create user")
	public void enter_valid_middle_name_in_create_user(String MiddleName) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtMiddleName")));
		ele1 = driver.findElement(By.id("txtMiddleName"));
		ele1.sendKeys(MiddleName);
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter valid Last name {string} in create user")
	public void enter_valid_last_name_in_create_user(String LastName) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtLastName")));
		ele1 = driver.findElement(By.id("txtLastName"));
		ele1.sendKeys(LastName);
		driver.switchTo().defaultContent();
	}
	
	@And("Enter valid Email {string} in create user")
	public void enter_valid_email_in_create_user(String Email) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtEmail")));
		ele1 = driver.findElement(By.id("txtEmail"));
		ele1.sendKeys(Email);
		driver.switchTo().defaultContent();
	}
	
	@Then("Select valid user type {string} in create user")
	public void select_valid_user_type_in_create_user(String UserType) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlUserType")));
		ele1 = driver.findElement(By.id("ddlUserType"));
		Select sel=new Select(ele1);
		sel.selectByVisibleText(UserType);
		driver.switchTo().defaultContent();
	}
	
	@And("Enter valid Initials {string} in create user")
	public void enter_valid_initials_in_create_user(String Initials) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtInitials")));
		ele1 = driver.findElement(By.id("txtInitials"));
		ele1.sendKeys(Initials);
		driver.switchTo().defaultContent();
	}
	
	@Then("Select valid user role {string} in create user")
	public void select_valid_user_role_in_create_user(String UserRole) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlUserRole")));
		ele1 = driver.findElement(By.id("ddlUserRole"));
		Select sel=new Select(ele1);
		sel.selectByVisibleText(UserRole);
		driver.switchTo().defaultContent();
	}
	
	@And("Select valid Country in create user")
	public void select_valid_country_in_create_user() throws InterruptedException {
		Thread.sleep(2000);
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlCountry")));
		ele1 = driver.findElement(By.id("ddlCountry"));
		Select sel=new Select(ele1);
		sel.selectByIndex(1);
		driver.switchTo().defaultContent();
	}
	
	@Then("Select valid State in create user")
	public void select_valid_state_in_create_user() throws InterruptedException {
		Thread.sleep(2000);
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlState")));
		ele1 = driver.findElement(By.id("ddlState"));
		Select sel=new Select(ele1);
		sel.selectByIndex(1);
		driver.switchTo().defaultContent();
	}
	
	@And("Enter valid Phone {string} in create user")
	public void enter_valid_phone_in_create_user(String Phone) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtPhone")));
		ele1 = driver.findElement(By.id("txtPhone"));
		ele1.sendKeys(Phone);
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter valid Cell {string} in create user")
	public void enter_valid_cell_in_create_user(String Cell) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtCell")));
		ele1 = driver.findElement(By.id("txtCell"));
		ele1.sendKeys(Cell);
		driver.switchTo().defaultContent();
	}
	
	@And("Uncheck the checkbox in active field in create user")
	public void uncheck_the_checkbox_in_active_field_in_create_user() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cbActiveAgent")));
		ele1 = driver.findElement(By.id("cbActiveAgent"));
		if(ele1.isSelected()) {
			System.out.println("Checkbox is already selected");
			ele1.click();
		}
		else {
			System.out.println("Checkbox is not selected");
		}
		driver.switchTo().defaultContent();
	}
	
	@Then("Select the checkbox in active field")
	public void select_the_checkbox_in_active_field() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cbActiveAgent")));
		ele1 = driver.findElement(By.id("cbActiveAgent"));
		if(ele1.isSelected()) {
			System.out.println("Checkbox is already selected");
		}
		else {
			System.out.println("Checkbox is not selected");
			ele1.click();
		}
		driver.switchTo().defaultContent();
	}

	@Then("Click No Radio button in Two FA")
	public void click_no_radio_button_in_two_fa() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rdotwofa_1")));
		ele1 = driver.findElement(By.id("rdotwofa_1"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Click the Email Radio button")
	public void click_the_Email_radio_button() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rdoflag_0")));
		ele1 = driver.findElement(By.id("rdoflag_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Select valid group rights in process mapping")
	public void select_valid_group_rights_in_process_mapping() throws InterruptedException {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.className("dropDownStyles2")));
		Thread.sleep(2000);
		//For Admin
		ele1=driver.findElement(By.id("gvProcess_ddlGroupRights_0"));
		Select sel=new Select(ele1);
		sel.selectByIndex(1);
		//Management
		ele2=driver.findElement(By.id("gvProcess_ddlGroupRights_1"));
		Select sel1=new Select(ele2);
		sel1.selectByIndex(1);
		//Analytics
		ele3=driver.findElement(By.id("gvProcess_ddlGroupRights_2"));
		Select sel2=new Select(ele3);
		sel2.selectByIndex(1);
		//FET
		ele4=driver.findElement(By.id("gvProcess_ddlGroupRights_3"));
		Select sel3=new Select(ele4);
		sel3.selectByIndex(1);
		//Maintenance
		ele5=driver.findElement(By.id("gvProcess_ddlGroupRights_4"));
		Select sel4=new Select(ele5);
		sel4.selectByIndex(1);
		//Document Management
		ele6=driver.findElement(By.id("gvProcess_ddlGroupRights_6"));
		Select sel5=new Select(ele6);
		sel5.selectByIndex(1);
		//Analytics2.0
		ele7=driver.findElement(By.id("gvProcess_ddlGroupRights_12"));
		Select sel6=new Select(ele7);
		sel6.selectByIndex(1);
		//Time Management
		ele8=driver.findElement(By.id("gvProcess_ddlGroupRights_13"));
		Select sel7=new Select(ele8);
		sel7.selectByIndex(1);
		//Quote
		ele9=driver.findElement(By.id("gvProcess_ddlGroupRights_15"));
		Select sel8=new Select(ele9);
		sel8.selectByIndex(1);
		//Dashboard
		WebElement ele10=driver.findElement(By.id("gvProcess_ddlGroupRights_20"));
		Select sel9=new Select(ele10);
		sel9.selectByIndex(1);
		driver.switchTo().defaultContent();
	}
	
	@And("Select valid modify rights in process mapping")
	public void select_valid_modify_rights_in_process_mapping() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvProcess_ddlDeleteRights_7")));
		//For IT Management
		ele1=driver.findElement(By.id("gvProcess_ddlDeleteRights_7"));
		Select sel=new Select(ele1);
		sel.selectByIndex(1);
		//Digital Pricing
		ele2=driver.findElement(By.id("gvProcess_ddlDeleteRights_14"));
		Select sel1=new Select(ele2);
		sel1.selectByIndex(1);
		driver.switchTo().defaultContent();
	}
	
	@Then("Select valid user role in process mapping")
	public void select_valid_user_role_in_process_mapping() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvProcess_ddlRole_4")));
		//For Maintenance
		ele1=driver.findElement(By.id("gvProcess_ddlRole_4"));
		Select sel=new Select(ele1);
		sel.selectByIndex(0);
		//IT Management
		ele2=driver.findElement(By.id("gvProcess_ddlRole_7"));
		Select sel1=new Select(ele2);
		sel1.selectByIndex(0);
		//Quote
		ele3=driver.findElement(By.id("gvProcess_ddlRole_15"));
		Select sel2=new Select(ele3);
		sel2.selectByIndex(0);
		//FOSMOB
		ele4=driver.findElement(By.id("gvProcess_ddlRole_17"));
		Select sel3=new Select(ele4);
		sel3.selectByIndex(0);
		driver.switchTo().defaultContent();
	}
	
	@And("Select valid check box in process mapping")
	public void select_valid_check_box_in_process_mapping() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvProcess_checkAll")));
		ele1 = driver.findElement(By.id("gvProcess_checkAll"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click Yes Radio button in Tail Availability")
	public void click_yes_radio_button_in_tail_availability() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rdMTDFlag_0")));
		ele1 = driver.findElement(By.id("rdMTDFlag_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Click Yes Radio button in Direct Access Rights")
	public void click_yes_radio_button_in_direct_access_rights() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rdoDAR_0")));
		ele1 = driver.findElement(By.id("rdoDAR_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click No Radio button in Ask Security Questions")
	public void click_no_radio_button_in_ask_security_questions() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rdoSQ_1")));
		ele1 = driver.findElement(By.id("rdoSQ_1"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Click Yes Radio button in Login to Owner Portal")
	public void click_yes_radio_button_in_login_to_owner_portal() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rdoAdminOwner_1")));
		ele1 = driver.findElement(By.id("rdoAdminOwner_1"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click Yes Radio button in Owner Survey")
	public void click_yes_radio_button_in_owner_survey() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rdosurvey_1")));
		ele1 = driver.findElement(By.id("rdosurvey_1"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Click Yes Radio button in GM% Report")
	public void click_yes_radio_button_in_gm_report() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rdoGM_1")));
		ele1 = driver.findElement(By.id("rdoGM_1"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click Yes Radio button in Trip Folder Creation")
	public void click_yes_radio_button_in_trip_folder_creation() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rdoTripFolder_1")));
		ele1 = driver.findElement(By.id("rdoTripFolder_1"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Click Yes Radio button in Trip Invoice")
	public void click_yes_radio_button_in_trip_invoice() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rdoTripInvoice_1")));
		ele1 = driver.findElement(By.id("rdoTripInvoice_1"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click Yes Radio button in Allow Access Rights")
	public void click_yes_radio_button_in_allow_access_rights() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rblTMSAllowAccess_0")));
		ele1 = driver.findElement(By.id("rblTMSAllowAccess_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Click Admin Radio button in Role")
	public void click_admin_radio_button_in_role() throws InterruptedException {
		Thread.sleep(2000);
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rblTMSRole_0")));
		ele1 = driver.findElement(By.id("rblTMSRole_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click All Employees Radio button in Show Timsheet For")
	public void click_all_employees_radio_button_in_show_timsheet_for() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rblShowTSFor_0")));
		ele1 = driver.findElement(By.id("rblShowTSFor_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Select valid work day in dropdown in Time Management Setup")
	public void select_valid_work_day_in_dropdown_in_time_management_setup() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlWorkDay")));
		ele1 = driver.findElement(By.id("ddlWorkDay"));
		Select sel=new Select(ele1);
		sel.selectByIndex(1);
		driver.switchTo().defaultContent();
	}
	
	@Then("Select valid Reporting To in dropdown in Time Management Setup")
	public void select_valid_reporting_to_in_dropdown_in_time_management_setup() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlReporting")));
		ele1 = driver.findElement(By.id("ddlReporting"));
		Select sel=new Select(ele1);
		sel.selectByVisibleText("Soundharya Support Team");
		driver.switchTo().defaultContent();
	}
	
	@And("Click no Radio button in Regenerate Paychex File")
	public void click_no_radio_button_in_regenerate_paychex_file() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rdopayCheck_0")));
		ele1 = driver.findElement(By.id("rdopayCheck_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click Jet Select radio button in create user")
	public void click_jet_select_radio_button_in_create_user() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rblCompany_1")));
		ele1 = driver.findElement(By.id("rblCompany_1"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click Jet Edge and Jet Select radio button in create user")
	public void click_jet_edge_and_jet_select_radio_button_in_create_user() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rblCompany_2")));
		ele1 = driver.findElement(By.id("rblCompany_2"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Click clear button in create user")
	public void click_clear_button_in_create_user() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClear")));
		ele1 = driver.findElement(By.id("btnClear"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click User Photo button in Admin")
	public void click_user_photo_button_in_admin() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[1]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[1]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("MGNTUSRPHOTO")));
		ele1 = driver.findElement(By.id("MGNTUSRPHOTO"));
		ele1.click();
	}
	
	@And("Select valid user type in the dropdown in User Photo")
	public void select_valid_user_type_in_the_dropdown_in_user_photo() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlFUserType")));
		ele1 = driver.findElement(By.id("ddlFUserType"));
		Select sel=new Select(ele1);
		sel.selectByIndex(1);
		driver.switchTo().defaultContent();
	}
	
	@Then("Click search button in User Photo")
	public void click_search_button_in_user_photo() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSearch")));
		ele1 = driver.findElement(By.id("btnSearch"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Enter valid user name or email {string} in search box in User Photo")
	public void enter_valid_user_name_or_email_in_search_box_in_user_photo(String Email) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtSearch")));
		ele1 = driver.findElement(By.id("txtSearch"));
		ele1.sendKeys(Email);
		driver.switchTo().defaultContent();
	}
	
	@And("Click edit button in the webtable")
	public void click_edit_button_in_the_webtable() throws InterruptedException {
		Thread.sleep(2000);
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvUser_imbView_0")));
		ele1 = driver.findElement(By.id("gvUser_imbView_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click close button in upload photo pop up")
	public void click_close_button_in_upload_photo_pop_up() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Image1")));
		ele1 = driver.findElement(By.id("Image1"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Upload valid photo in the pop up")
	public void upload_valid_photo_in_the_pop_up() throws InterruptedException, AWTException {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[3]/table/tbody/tr[2]/td/table/tbody/tr[4]/td")));
		//Upload the file
		driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/table/tbody/tr[2]/td/table/tbody/tr[4]/td")).click();
		Thread.sleep(2000);
		String FilePath="C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeAdminPortal\\Files\\Screenshot 2024-08-07 114619.png";
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}
	
	@And("Click save button in upload photo pop up")
	public void click_save_button_in_upload_photo_pop_up() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnRepAddtoList")));
		ele1 = driver.findElement(By.id("btnRepAddtoList"));
		ele1.click();
	}
	
	@Then("Click Group Rights Setup button in Admin")
	public void click_group_rights_setup_button_in_admin() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[1]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[1]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("MGNTADMGS")));
		ele1 = driver.findElement(By.id("MGNTADMGS"));
		ele1.click();
	}
	
	@And("Click add group button in Group Rights Setup")
	public void click_add_group_button_in_group_rights_setup() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnAddNew")));
		ele1 = driver.findElement(By.id("btnAddNew"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click back button in Group Rights Setup")
	public void click_back_button_in_group_rights_setup() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnBack")));
		ele1 = driver.findElement(By.id("btnBack"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click save button in Group Rights Setup")
	public void click_save_button_in_group_rights_setup() throws InterruptedException {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSave")));
		ele1 = driver.findElement(By.id("btnSave"));
		ele1.click();
		Thread.sleep(5000);
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.print("\u001B[1mAlert message is displayed like : \u001B[0m" + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.print("\u001B[1mNo Alert message is displayed\u001B[0m");
		}
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter valid group name {string} in Group Rights Setup")
	public void enter_valid_group_name_in_group_rights_setup(String GrpName) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtGroupName")));
		ele1 = driver.findElement(By.id("txtGroupName"));
		ele1.sendKeys(GrpName);
		driver.switchTo().defaultContent();
	}
	
	@And("Select valid process in dropdown {string} in Group Rights Setup")
	public void select_valid_process_in_dropdown_in_group_rights_setup(String Process) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlProcess")));
		ele1 = driver.findElement(By.id("ddlProcess"));
		Select sel=new Select(ele1);
		sel.selectByVisibleText(Process);
		driver.switchTo().defaultContent();
	}
	
	@Then("Unselect the checkbox in Group Rights Setup")
	public void unselect_the_checkbox_in_group_rights_setup() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("chStaus")));
		ele1 = driver.findElement(By.id("chStaus"));
		if(ele1.isSelected()) {
			System.out.println("Checkbox is already selected");
			ele1.click();
		}
		else {
			System.out.println("Checkbox is not selected");
		}
		driver.switchTo().defaultContent();
	}
	
	@Then("Select the checkbox in Group Rights Setup")
	public void select_the_checkbox_in_group_rights_setup() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("chStaus")));
		ele1 = driver.findElement(By.id("chStaus"));
		if(ele1.isSelected()) {
			System.out.println("Checkbox is already selected");
		}
		else {
			System.out.println("Checkbox is not selected");
			ele1.click();
		}
		driver.switchTo().defaultContent();
	}
	
	@And("Click edit button in Group Rights Setup")
	public void click_edit_button_in_group_rights_setup() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvGroup_imbEdit_0")));
		ele1 = driver.findElement(By.id("gvGroup_imbEdit_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Modify valid details in Group Rights Setup")
	public void modify_valid_details_in_group_rights_setup() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtGroupName")));
		ele1 = driver.findElement(By.id("txtGroupName"));
		String text = ele1.getAttribute("value");
		ele1.clear();
		ele2 = driver.findElement(By.id("txtGroupName"));
		ele2.sendKeys(text);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvScreen_chkStatus_0")));
		ele3 = driver.findElement(By.id("gvScreen_chkStatus_0"));
		if(ele3.isSelected()) {
			System.out.println("Checkbox is already selected");
			ele3.click();
			ele3.click();
		}
		else {
			System.out.println("Checkbox is not selected");
		}
		driver.switchTo().defaultContent();
	}
	
	@Then("Click IP WhiteList button in Admin")
	public void click_ip_white_list_button_in_admin() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[1]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[1]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("MGNTADMIP")));
		ele1 = driver.findElement(By.id("MGNTADMIP"));
		ele1.click();
	}
	
	@And("Click export button in IP WhiteList")
	public void click_export_button_in_ip_white_list() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnExport")));
		ele1 = driver.findElement(By.id("btnExport"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Click Add IP Whitelist button")
	public void click_add_ip_whitelist_button() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnAddNew")));
		ele1 = driver.findElement(By.id("btnAddNew"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click close button in IP Whitelist Details")
	public void click_close_button_in_ip_whitelist_details() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClose")));
		ele1 = driver.findElement(By.id("btnClose"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click save button in IP Whitelist Details")
	public void click_save_button_in_ip_whitelist_details() throws InterruptedException {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSave")));
		ele1 = driver.findElement(By.id("btnSave"));
		ele1.click();
		Thread.sleep(3000);
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.print("\u001B[1mAlert message is displayed like : \u001B[0m" + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.print("\u001B[1mNo Alert message is displayed\u001B[0m");
		}
		
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter valid IP Address {string} in IP Whitelist")
	public void enter_valid_ip_address_in_ip_whitelist(String IPAddress) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtIP")));
		ele1 = driver.findElement(By.id("txtIP"));
		ele1.sendKeys(IPAddress);
		driver.switchTo().defaultContent();
	}
	
	@And("Enter valid  IP Location {string} in IP Whitelist")
	public void enter_valid_ip_location_in_ip_whitelist(String IPLocation) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtLocation")));
		ele1 = driver.findElement(By.id("txtLocation"));
		ele1.sendKeys(IPLocation);
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter valid Responsible Person {string} in IP Whitelist")
	public void enter_valid_responsible_person_in_ip_whitelist(String RespPerson) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtPerson")));
		ele1 = driver.findElement(By.id("txtPerson"));
		ele1.sendKeys(RespPerson);
		driver.switchTo().defaultContent();
	}
	
	@And("Enter valid notes {string} in IP Whitelist")
	public void enter_valid_notes_in_ip_whitelist(String Notes) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtNotes")));
		ele1 = driver.findElement(By.id("txtNotes"));
		ele1.sendKeys(Notes);
		driver.switchTo().defaultContent();
	}
	
	@Then("Click clear button in IP Whitelist Details")
	public void click_clear_button_in_ip_whitelist_details() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClear")));
		ele1 = driver.findElement(By.id("btnClear"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Click edit button in IP Whitelist")
	public void click_edit_button_in_ip_whitelist() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvIPAddress_imbEdit_0")));
		ele1 = driver.findElement(By.id("gvIPAddress_imbEdit_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Modify valid details in IP Whitelist")
	public void modify_valid_details_in_ip_whitelist() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtIP")));
		ele1 = driver.findElement(By.id("txtIP"));
		String text = ele1.getAttribute("value");
		ele1.clear();
		ele2 = driver.findElement(By.id("txtIP"));
		ele2.sendKeys(text);
		driver.switchTo().defaultContent();
	}
	
	@Then("Click Unlocked User button in Admin")
	public void click_unlocked_user_button_in_admin() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[1]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[1]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ADMULUSR")));
		ele1 = driver.findElement(By.id("ADMULUSR"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Click unlock button in Unlocked User and check page behaviour")
	public void click_unlock_button_in_unlocked_user() throws InterruptedException {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvUsers_imbEnable_0")));
		ele1 = driver.findElement(By.id("gvUsers_imbEnable_0"));
		ele1.click();
		Thread.sleep(2000);
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.print("\u001B[1mAlert message is displayed like : \u001B[0m" + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.print("\u001B[1mNo Alert message is displayed\u001B[0m");
		}
		driver.switchTo().defaultContent();
	}
	
	@And("Check unlock message is displayed or not")
	public void check_unlock_message_is_displayed_or_not() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.print("\u001B[1mAlert message is displayed like : \u001B[0m" + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.print("\u001B[1mNo Alert message is displayed\u001B[0m");
		}
		driver.switchTo().defaultContent();
	}
	
	@When("User enter valid email id and invalid password six times to lock the user {string} and {string}")
	public void user_enter_valid_email_id_and_invalid_password_six_times_to_lock_the_user_and(String UserName, String Password) {
		ele1=driver.findElement(By.id("txtUserName"));
		ele1.clear();
		ele1.sendKeys(UserName);
		ele2=driver.findElement(By.id("txtPassword"));
		ele2.clear();
		ele2.sendKeys(Password);
	}
	
	@And("click the Signin button six times to lock the user")
	public void click_the_signin_button_six_times_to_lock_the_user() throws InterruptedException {
		ele1= driver.findElement(By.id("ibLogin"));
		ele1.click();
		ele2=driver.findElement(By.id("lblInvalidLogin"));
		String text1 = ele2.getText();
		System.out.println(text1);
	}
	
	@Then("Click Country button in Admin")
	public void click_country_button_in_admin() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[1]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[1]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("MGNTADMCOU")));
		ele1 = driver.findElement(By.id("MGNTADMCOU"));
		ele1.click();
	}
	
	@And("Click export button in Country")
	public void click_export_button_in_country() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnExport")));
		ele1 = driver.findElement(By.id("btnExport"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Click Add Country button")
	public void click_add_country_button() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnAddNew")));
		ele1 = driver.findElement(By.id("btnAddNew"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click close button in Add Country")
	public void click_close_button_in_add_country() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClose")));
		ele1 = driver.findElement(By.id("btnClose"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click save button in Add Country")
	public void click_save_button_in_add_country() throws InterruptedException {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ButSubmit")));
		ele1 = driver.findElement(By.id("ButSubmit"));
		ele1.click();
		Thread.sleep(3000);
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.print("\u001B[1mAlert message is displayed like : \u001B[0m" + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.print("\u001B[1mNo Alert message is displayed\u001B[0m");
		}
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter valid {string} CodeX2 details")
	public void enter_valid_code_x2_details(String CodeX2) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtCodeX2")));
		ele1 = driver.findElement(By.id("txtCodeX2"));
		ele1.sendKeys(CodeX2);
		driver.switchTo().defaultContent();
	}
	
	@And("Enter valid {string} Country Code details")
	public void enter_valid_country_code_details(String CounCode) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtCountryCode")));
		ele1 = driver.findElement(By.id("txtCountryCode"));
		ele1.sendKeys(CounCode);
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter valid {string} Country Name details")
	public void enter_valid_country_name_details(String CounName) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtCountryName")));
		ele1 = driver.findElement(By.id("txtCountryName"));
		ele1.sendKeys(CounName);
		driver.switchTo().defaultContent();
	}
	
	@And("Uncheck the checkbox in active field in country")
	public void uncheck_the_checkbox_in_active_field() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("chStaus")));
		ele1 = driver.findElement(By.id("chStaus"));
		if(ele1.isSelected()) {
			System.out.println("Check box is already selected");
		ele1.click();
		}
		else {
			System.out.println("Checkbox is not selected");
		}
		driver.switchTo().defaultContent();
	}
	
	@Then("Click clear button in Add Country")
	public void click_clear_button_in_add_country() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClear")));
		ele1 = driver.findElement(By.id("btnClear"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Select the checkbox in active field in country")
	public void select_the_checkbox_in_active_field_in_country() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("chStaus")));
		ele1 = driver.findElement(By.id("chStaus"));
		if(ele1.isSelected()) {
			System.out.println("Check box is already selected");
		}
		else {
			System.out.println("Checkbox is not selected");
			ele1.click();
		}
		driver.switchTo().defaultContent();
	}
	
	@And("Click edit button in the webtable in Add Country")
	public void click_edit_button_in_the_webtable_in_add_country() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvCountry_imbEdit_4")));
		ele1 = driver.findElement(By.id("gvCountry_imbEdit_4"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Modify valid details in Add Country")
	public void modify_valid_details_in_add_country() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtCountryCode")));
		ele1 = driver.findElement(By.id("txtCountryCode"));
		String text = ele1.getAttribute("value");
		ele1.clear();
		ele2 = driver.findElement(By.id("txtCountryCode"));
		ele2.sendKeys(text);
		driver.switchTo().defaultContent();
	}
	
	@Then("Click State button in Admin")
	public void click_state_button_in_admin() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[1]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[1]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("MGNTADMSTA")));
		ele1 = driver.findElement(By.id("MGNTADMSTA"));
		ele1.click();
	}
	
	@And("Select valid country name in the dropdown")
	public void select_valid_country_name_in_the_dropdown() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlFilterCountry")));
		ele1 = driver.findElement(By.id("ddlFilterCountry"));
		Select sel=new Select(ele1);
		sel.selectByVisibleText("ANTARCTICA");
		driver.switchTo().defaultContent();
	}
	
	@Then("Click export button in state")
	public void click_export_button_in_state() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnExport")));
		ele1 = driver.findElement(By.id("btnExport"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Click add state button")
	public void click_add_state_button() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnAddNew")));
		ele1 = driver.findElement(By.id("btnAddNew"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click Back button in add state")
	public void click_back_button_in_add_state() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClose")));
		ele1 = driver.findElement(By.id("btnClose"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Select valid country in add state")
	public void select_valid_country_in_add_state() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlCountry")));
		ele1 = driver.findElement(By.id("ddlCountry"));
		Select sel=new Select(ele1);
		sel.selectByVisibleText("INDIA");
		driver.switchTo().defaultContent();
	}
	
	@And("Enter valid State Name in add state")
	public void enter_valid_state_name_in_add_state() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClose")));
		ele1 = driver.findElement(By.id("btnClose"));
		ele1.sendKeys("TamilNadu");
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter valid State Code in add state")
	public void enter_valid_state_code_in_add_state() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClose")));
		ele1 = driver.findElement(By.id("btnClose"));
		ele1.sendKeys("TN");
		driver.switchTo().defaultContent();
	}
	
	@And("Uncheck the chekbox in active field")
	public void uncheck_the_chekbox_in_active_field() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("chStaus")));
		ele1 = driver.findElement(By.id("chStaus"));
		if(ele1.isSelected()) {
			System.out.println("Check box is already selected");
		ele1.click();
		}
		else {
			System.out.println("Checkbox is not selected");
		}
		driver.switchTo().defaultContent();
	}
	
	@Then("Click Clear button in add state")
	public void click_clear_button_in_add_state() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClear")));
		ele1 = driver.findElement(By.id("btnClear"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click save button in add state")
	public void click_save_button_in_add_state() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ButSubmit")));
		ele1 = driver.findElement(By.id("ButSubmit"));
		ele1.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.print("\u001B[1mAlert message is displayed like : \u001B[0m" + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.print("\u001B[1mNo Alert message is displayed\u001B[0m");
		}
		driver.switchTo().defaultContent();
	}
	
	@And("Click edit button in state")
	public void click_edit_button_in_state() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvState_imbEdit_0")));
		ele1 = driver.findElement(By.id("gvState_imbEdit_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Select the chekbox in active field")
	public void select_the_chekbox_in_active_field() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("chStaus")));
		ele1 = driver.findElement(By.id("chStaus"));
		if(ele1.isSelected()) {
			System.out.println("Check box is already selected");
		}
		else {
			System.out.println("Checkbox is not selected");
			ele1.click();
		}
		driver.switchTo().defaultContent();
	}
	
	@Then("Modify valid details in add state")
	public void modify_valid_details_in_add_state() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtStateName")));
		ele1 = driver.findElement(By.id("txtStateName"));
		String text = ele1.getAttribute("value");
		ele1.clear();
		ele2 = driver.findElement(By.id("txtStateName"));
		ele2.sendKeys(text);
		driver.switchTo().defaultContent();
	}
	
	@Then("Click Reset Password button in Admin")
	public void click_reset_password_button_in_admin() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[1]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[1]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("RSTPWD")));
		ele1 = driver.findElement(By.id("RSTPWD"));
		ele1.click();
	}
	
	@And("Click owner radio button in Reset Password")
	public void click_owner_radio_button_in_reset_password() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rbUser_0")));
		ele1 = driver.findElement(By.id("rbUser_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click view button in Reset Password")
	public void click_view_button_in_reset_password() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvUser_imbView_240")));
		ele1 = driver.findElement(By.id("gvUser_imbView_240"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click view button for {string} in Jet Edge in Reset Password")
	public void click_view_button_in_jet_edge_in_reset_password(String UserMail) throws InterruptedException {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("gvUser_imbView_404"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",ele1);
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvUser_imbView_409")));
		ele2 = driver.findElement(By.id("gvUser_imbView_409"));
		ele2.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Click close button in Reset Password")
	public void click_close_button_in_reset_password() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgClose")));
		ele1 = driver.findElement(By.id("imgClose"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click save button in Reset Password")
	public void click_save_button_in_reset_password() throws InterruptedException {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnUpdatePassword")));
		ele1 = driver.findElement(By.id("btnUpdatePassword"));
		ele1.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.print("\u001B[1mAlert message is displayed like : \u001B[0m" + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.print("\u001B[1mNo Alert message is displayed\u001B[0m");
		}
		driver.switchTo().defaultContent();
	}
	
	@And("Enter valid New password {string} in Reset Password")
	public void enter_valid_new_password_in_reset_password(String NewPass) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtNewPassword")));
		ele1 = driver.findElement(By.id("txtNewPassword"));
		ele1.clear();
		ele2 = driver.findElement(By.id("txtNewPassword"));
		ele2.sendKeys(NewPass);
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter valid New password {string} in Jet Edge in Reset Password")
	public void enter_valid_new_password_in_jet_edge_in_reset_password(String NewPass) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtNewPassword")));
		ele1 = driver.findElement(By.id("txtNewPassword"));
		ele1.clear();
		ele2 = driver.findElement(By.id("txtNewPassword"));
		ele2.sendKeys(NewPass);
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter valid Confirm password {string} in Reset Password")
	public void enter_valid_confirm_password_in_reset_password(String ConfPass) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtConfirmPassword")));
		ele1 = driver.findElement(By.id("txtConfirmPassword"));
		ele1.clear();
		ele2 = driver.findElement(By.id("txtConfirmPassword"));
		ele2.sendKeys(ConfPass);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("lblUserEmail")));
		ele3 = driver.findElement(By.id("lblUserEmail"));
		ele3.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter valid Confirm password {string} in Jet Edge in Reset Password")
	public void enter_valid_confirm_password_in_jet_edge_in_reset_password(String ConfPass) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtConfirmPassword")));
		ele1 = driver.findElement(By.id("txtConfirmPassword"));
		ele1.clear();
		ele2 = driver.findElement(By.id("txtConfirmPassword"));
		ele2.sendKeys(ConfPass);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("lblUserEmail")));
		ele3 = driver.findElement(By.id("lblUserEmail"));
		ele3.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Click Jet Edge radio button in Reset Password")
	public void click_jet_edge_radio_button_in_reset_password() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rbUser_1")));
		ele1 = driver.findElement(By.id("rbUser_1"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@When("Enter valid user name {string}")
	public void enter_valid_user_name(String UserName) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
	}
	
	@When("Enter new password {string}")
	public void enter_new_password(String Password) {
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
	}
	
	@Then("Check page landed to homepage or not")
	public void check_page_landed_to_homepage_or_not() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lblModuleName")));
		ele1 = driver.findElement(By.id("lblModuleName"));
		if(ele1.isDisplayed()) {
			System.out.println("Page landed to homepage");
		}
		else {
			System.out.println("Page doesnot landed to homepage");
		}
		driver.switchTo().defaultContent();
	}
	
	@And("Select valid user type {string} in the dropdown")
	public void select_valid_user_type_in_the_dropdown(String UserMailId) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlFUserType")));
		ele1 = driver.findElement(By.id("ddlFUserType"));
		Select sel=new Select(ele1);
		sel.selectByVisibleText(UserMailId);
		driver.switchTo().defaultContent();
	}
	
	@Then("click edit button in the webtable in create user")
	public void click_edit_button_in_the_webtable_in_create_user() throws InterruptedException {
		Thread.sleep(2000);
//		try {
//			ele=driver.findElement(By.id("loadFrame"));
//			driver.switchTo().frame(ele);
//		} catch (NoSuchElementException e) {
//			System.out.println("No Frame is present in the screen");
//		}
//		ele=driver.findElement(By.id("loadFrame"));
//		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvUser_imbView_0")));
		ele1 = driver.findElement(By.id("gvUser_imbView_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Modify valid details in create user")
	public void modify_valid_details_in_create_user() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtFirstName")));
		ele1 = driver.findElement(By.id("txtFirstName"));
		String text = ele1.getAttribute("value");
		ele1.clear();
		ele2 = driver.findElement(By.id("txtFirstName"));
		ele2.sendKeys(text);
		driver.switchTo().defaultContent();
	}
	
	@Then("Click No button in information page")
	public void click_no_button_in_information_page() throws InterruptedException {
		Thread.sleep(2000);
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnConfirmationNo")));
		ele1 = driver.findElement(By.id("btnConfirmationNo"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Click close button in alert pop up")
	public void click_close_button_in_alert_pop_up() throws InterruptedException {
		Thread.sleep(2000);
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClose")));
		ele1 = driver.findElement(By.id("btnClose"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
}