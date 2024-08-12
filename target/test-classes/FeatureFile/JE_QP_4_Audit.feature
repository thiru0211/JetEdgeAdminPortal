Feature: AUDIT

  @TC_01
  Scenario: Audit:Sign in Check
    Given To Check Audit User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Audit User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Audit
    Then Check Page Landed to Homepage or not in Audit
    Then close the Audit Page

  @TC_02
  Scenario: Audit:Valid Check
    Given To Check Audit User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Audit User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Audit
    Then Click Run Report button in Audit
    And Select valid from date in Run Report
    Then Select valid to date in Run Report
    And Click view button in run report
    Then Click view button in Audit details
    And Click close buttoon in crew missing trips
    Then close the Audit Page
    
    