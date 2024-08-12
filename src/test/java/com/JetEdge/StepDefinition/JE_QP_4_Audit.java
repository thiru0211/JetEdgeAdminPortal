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

public class JE_QP_4_Audit {
	public WebDriver driver;
	public WebElement ele, ele1, ele2, ele3, ele4, ele5, ele6, ele7, ele8, ele9;
	public WebDriverWait wait;

	@Given("To Check Audit User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=new");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check Audit User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		ele1=driver.findElement(By.id("txtUserName"));
		ele1.clear();
		ele1.sendKeys(UserName);
		ele2=driver.findElement(By.id("txtPassword"));
		ele2.clear();
		ele2.sendKeys(Password);
		System.out.print("\u001B[1mUsername and password entered\u001B[0m");

	}

	@And("click the Signin button To Check Audit")
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

	@And("close the Audit Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.print("\u001B[1mPage is closed\u001B[0m");

	}

	@Then("Check Page Landed to Homepage or not in Audit")
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

	@Then("Click Run Report button in Audit")
	public void click_create_user_button_in_admin() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("EXCRUN")));
		ele1 = driver.findElement(By.id("EXCRUN"));
		ele1.click();
	}
	@And("Select valid from date in Run Report")
	public void select_valid_from_date_in_Run_report() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtStartDate")));
		ele1 = driver.findElement(By.id("txtStartDate"));
		ele1.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cal1_day_0_0")));
		ele2 = driver.findElement(By.id("cal1_day_0_0"));
		ele2.click();
		driver.switchTo().defaultContent();
	}
	@Then("Select valid to date in Run Report")
	public void select_valid_to_date_in_run_report() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtEndDate")));
		ele1 = driver.findElement(By.id("txtEndDate"));
		ele1.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cal2_day_5_6")));
		ele2 = driver.findElement(By.id("cal2_day_5_6"));
		ele2.click();
		driver.switchTo().defaultContent();
	}
	@And("Click view button in run report")
	public void click_view_button_in_run_report() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ButSubmit")));
		ele1 = driver.findElement(By.id("ButSubmit"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	@Then("Click view button in Audit details")
	public void click_view_button_in_audit_details() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imbEdit")));
		ele1 = driver.findElement(By.id("imbEdit"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	@And("Click close buttoon in crew missing trips")
	public void click_close_buttoon_in_crew_missing_trips() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgClose")));
		ele1 = driver.findElement(By.id("imgClose"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	

}
