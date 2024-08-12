Feature: USER LOG REPORT

  @TC_01
  Scenario: Login Report:Sign in Check
    Given To Check User log report User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check User log report User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check User log report
    Then Check Page Landed to Homepage or not in User log report
    Then close the User log report Page

  @TC_02
  Scenario: Login Report:Valid Check
    Given To Check User log report User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check User log report User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check User log report
    Then Click Login Report button in user log report
    # And Select valid from date in Login Report
    Then Uncheck the check box in support team tab in Login Report
    And Uncheck the check box in Owner tab in Login Report
    Then Click submit button in Login Report
    Then close the User log report Page

    @TC_03
  Scenario: Login Report:Valid Check
    Given To Check User log report User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check User log report User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check User log report
    Then Click Login Report button in user log report
    # And Select valid from date in Login Report
    Then Select the check box in support team tab in Login Report
    And Uncheck the check box in Owner tab in Login Report
    Then Click submit button in Login Report
    Then close the User log report Page

    @TC_04
  Scenario: Login Report:Valid Check
    Given To Check User log report User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check User log report User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check User log report
    Then Click Login Report button in user log report
    # And Select valid from date in Login Report
    Then Uncheck the check box in support team tab in Login Report
    And Select the check box in Owner tab in Login Report
    Then Click submit button in Login Report
    Then close the User log report Page

    @TC_05
  Scenario: Login Report:Valid Check
    Given To Check User log report User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check User log report User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check User log report
    Then Click Login Report button in user log report
    # And Select valid from date in Login Report
    Then Select the check box in support team tab in Login Report
    And Select the check box in Owner tab in Login Report
    Then Click submit button in Login Report
    Then close the User log report Page

    @TC_06
  Scenario: Login Report:Export Check
    Given To Check User log report User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check User log report User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check User log report
    Then Click Login Report button in user log report
   # # And Select valid from date in Login Report
    Then Select the check box in support team tab in Login Report
    And Select the check box in Owner tab in Login Report
    Then Click submit button in Login Report
    And Click export button in Login Report
    #Then close the User log report Page

    @TC_07
  Scenario: Login Report:Valid Check
    Given To Check User log report User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check User log report User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check User log report
    Then Click Login Report button in user log report
    # And Select valid from date in Login Report
    And Enter valid name "Soundharya Support Team" in Login Report
    Then Select the check box in support team tab in Login Report
    And Select the check box in Owner tab in Login Report
    Then Click submit button in Login Report
    Then close the User log report Page
  
    @TC_08
  Scenario: Login Report:Expand Check
    Given To Check User log report User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check User log report User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check User log report
    Then Click Login Report button in user log report
    # And Select valid from date in Login Report
    Then Select the check box in support team tab in Login Report
    And Select the check box in Owner tab in Login Report
    Then Click submit button in Login Report
    And Click expand button in Login Report
    Then close the User log report Page
    
    @TC_09
  Scenario: Crew Login:Valid Check
    Given To Check User log report User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check User log report User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check User log report
    Then Click Crew Login button in user log report
    And Select valid from date in Crew Login
    Then Click submit button in Crew Login
    Then close the User log report Page
    
    @TC_10
  Scenario: Crew Login:Export Check
    Given To Check User log report User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check User log report User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check User log report
    Then Click Crew Login button in user log report
    And Select valid from date in Crew Login
    Then Click submit button in Crew Login
    And Click export button in Crew Login
    Then close the User log report Page
    
    @TC_11
  Scenario: Crew Login:Expand Check
    Given To Check User log report User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check User log report User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check User log report
    Then Click Crew Login button in user log report
    And Select valid from date in Crew Login
    Then Click submit button in Crew Login
    And Click expand button in Crew Login
    Then close the User log report Page
    
    @TC_12
  Scenario: Dashboard:Valid Check
    Given To Check User log report User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check User log report User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check User log report
    Then Click Dashboard button in user log report
    And Select valid from date in Dashboard
    Then Uncheck the check box in support team tab
    And Uncheck the check box in Owner tab
    Then Click Run button
    Then close the User log report Page
    
    @TC_13
  Scenario: Dashboard:Valid Check
    Given To Check User log report User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check User log report User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check User log report
    Then Click Dashboard button in user log report
    And Select valid from date in Dashboard
    Then Select the check box in support team tab
    And Uncheck the check box in Owner tab
    Then Click Run button
    Then close the User log report Page
    
     @TC_14
  Scenario: Dashboard:Valid Check
    Given To Check User log report User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check User log report User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check User log report
    Then Click Dashboard button in user log report
    And Select valid from date in Dashboard
    Then Uncheck the check box in support team tab
    And Select the check box in Owner tab
    Then Click Run button
    Then close the User log report Page
    
    @TC_15
  Scenario: Dashboard:Valid Check
    Given To Check User log report User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check User log report User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check User log report
    Then Click Dashboard button in user log report
    And Select valid from date in Dashboard 
    Then Select the check box in support team tab
    And Select the check box in Owner tab
    Then Click Run button
    Then close the User log report Page
    
    @TC_16
  Scenario: Dashboard:Valid Check
    Given To Check User log report User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check User log report User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check User log report
    Then Click Dashboard button in user log report
    And Select valid from date in Dashboard
    Then Select the check box in support team tab
    And Select the check box in Owner tab
    Then Click Run button
    And Click View button in Dashboard
    Then Click close button in Dashboard
    Then close the User log report Page
    
    @TC_17
  Scenario: Dashboard:Valid Check
    Given To Check User log report User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check User log report User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check User log report
    Then Click Dashboard button in user log report
    And Select valid from date in Dashboard
    Then Select the check box in support team tab
    And Select the check box in Owner tab
    Then Click Run button
    And Click screen log button in Dashboard
    And Click View button in screen log in Dashboard 
    Then Click close button in Dashboard
    Then close the User log report Page
    

  