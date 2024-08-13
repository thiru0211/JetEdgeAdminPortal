Feature: ADMIN

  @TC_01
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Check Page Landed to Homepage or not in Admin
    Then close the Admin Page

  @TC_02
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click export button and check page behaviour
    Then close the Admin Page

  @TC_03
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Select valid user type in the dropdown
    Then Click search button and check page behaviour
    Then close the Admin Page

  @TC_04
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Enter valid user name or email "adharshr21@gmail.com" in search box
    Then Click search button and check page behaviour
    Then close the Admin Page

  @TC_05
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    And Click save button in create user
    Then close the Admin Page

  @TC_06
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    And Click back button in create user
    Then close the Admin Page

  @TC_07
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Click all radio button in choose company field
    Then close the Admin Page

  @TC_08
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Click back button in create user
    Then close the Admin Page

  @TC_09
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Click add button in user role
    Then Click save button in user role
    Then close the Admin Page

  @TC_10
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Click add button in user role
    Then Click close button in user role
    Then close the Admin Page

  @TC_11
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Click add button in user role
    And Enter valid detail "Test Role" in user role
    Then Click save button in user role
    Then close the Admin Page

  @TC_12
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    And Click edit button in user role
    Then close the Admin Page

  @TC_13
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Select valid user role "Test Role" in user role
    And Click edit button in user role
    Then Click close button in user role
    Then close the Admin Page

  @TC_14
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Select valid user role "Test Role" in user role
    And Click edit button in user role
    And Modify valid detail in user role
    Then Click save button in user role
    Then close the Admin Page

  @TC_15
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Enter numerical values "123456" in first name field in create user
    And Check first name field in create user
    Then close the Admin Page

  @TC_16
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Enter special characters values "!@#$%" in first name field in create user
    And Check first name field in create user
    Then close the Admin Page

  @TC_17
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Enter alpha characters values "Test" in first name field in create user
    And Check first name field in create user
    Then close the Admin Page

  @TC_18
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Enter numerical values "123456" in Middle name field in create user
    And Check Middle name field in create user
    Then close the Admin Page

  @TC_19
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Enter special characters values "!@#$%" in Middle name field in create user
    And Check Middle name field in create user
    Then close the Admin Page

  @TC_20
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Enter alpha characters values "Test" in Middle name field in create user
    And Check Middle name field in create user
    Then close the Admin Page

  @TC_21
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Enter numerical values "123456" in Last name field in create user
    And Check Last name field in create user
    Then close the Admin Page

  @TC_22
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Enter special characters values "!@#$%" in Last name field in create user
    And Check Last name field in create user
    Then close the Admin Page

  @TC_23
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Enter alpha characters values "Test" in Last name field in create user
    And Check Last name field in create user
    Then close the Admin Page

  @TC_24
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Enter valid first name "Test" in create user
    And Enter valid Middle name "T" in create user
    Then Enter valid Last name "T" in create user
    And Enter valid Email "0211thiru@gmail.com" in create user
    Then Select valid user type "Operational Manager" in create user
    And Enter valid Initials "T" in create user
    Then Select valid user role "Support Team" in create user
    And Select valid Country in create user
    Then Select valid State in create user
    And Enter valid Phone "1234567890" in create user
    Then Enter valid Cell "1234567890" in create user
    And Uncheck the checkbox in active field in create user
    Then close the Admin Page

  @TC_25
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Enter valid first name "Test" in create user
    And Enter valid Middle name "T" in create user
    Then Enter valid Last name "T" in create user
    And Enter valid Email "0211thiru@gmail.com" in create user
    Then Select valid user type "Operational Manager" in create user
    And Enter valid Initials "T" in create user
    Then Select valid user role "Support Team" in create user
    And Select valid Country in create user
    Then Select valid State in create user
    And Enter valid Phone "1234567890" in create user
    Then Enter valid Cell "1234567890" in create user
    And Select the checkbox in active field
    Then close the Admin Page

  @TC_26
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Click No Radio button in Two FA
    And Click the Email Radio button
    Then close the Admin Page

  @TC_27
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Select valid group rights in process mapping
    And Select valid modify rights in process mapping
    Then Select valid user role in process mapping
    And Select valid check box in process mapping
    Then close the Admin Page

  @TC_28
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Enter valid first name "Test" in create user
    And Enter valid Middle name "T" in create user
    Then Enter valid Last name "T" in create user
    And Enter valid Email "0211thiru@gmail.com" in create user
    Then Select valid user type "Operational Manager" in create user
    And Enter valid Initials "T" in create user
    Then Select valid user role "Support Team" in create user
    And Select valid Country in create user
    Then Select valid State in create user
    And Enter valid Phone "1234567890" in create user
    Then Enter valid Cell "1234567890" in create user
    And Select the checkbox in active field
    Then Click No Radio button in Two FA
    And Click the Email Radio button
    Then Click Yes Radio button in Tail Availability
    And Click Yes Radio button in Direct Access Rights
    Then Click No Radio button in Ask Security Questions
    And Click Yes Radio button in Login to Owner Portal
    Then Click Yes Radio button in Owner Survey
    And Click Yes Radio button in GM% Report
    Then Click Yes Radio button in Trip Folder Creation
    And Click Yes Radio button in Trip Invoice
    Then Click Yes Radio button in Allow Access Rights
    And Click Admin Radio button in Role
    Then Click All Employees Radio button in Show Timsheet For
    And Select valid work day in dropdown in Time Management Setup
    Then Select valid Reporting To in dropdown in Time Management Setup
    And Click no Radio button in Regenerate Paychex File
    Then Select valid group rights in process mapping
    Then close the Admin Page

  @TC_29
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Click Jet Select radio button in create user
    Then Enter valid first name "Test" in create user
    And Enter valid Middle name "T" in create user
    Then Enter valid Last name "T" in create user
    And Enter valid Email "0211thiru@gmail.com" in create user
    Then Select valid user type "Operational Manager" in create user
    And Enter valid Initials "T" in create user
    Then Select valid user role "Support Team" in create user
    And Select valid Country in create user
    Then Select valid State in create user
    And Enter valid Phone "1234567890" in create user
    Then Enter valid Cell "1234567890" in create user
    And Select the checkbox in active field
    Then Click No Radio button in Two FA
    And Click the Email Radio button
    Then Click Yes Radio button in Tail Availability
    And Click Yes Radio button in Direct Access Rights
    Then Click No Radio button in Ask Security Questions
    And Click Yes Radio button in Login to Owner Portal
    Then Click Yes Radio button in Owner Survey
    And Click Yes Radio button in GM% Report
    Then Click Yes Radio button in Trip Folder Creation
    And Click Yes Radio button in Trip Invoice
    Then Click Yes Radio button in Allow Access Rights
    And Click Admin Radio button in Role
    Then Click All Employees Radio button in Show Timsheet For
    And Select valid work day in dropdown in Time Management Setup
    Then Select valid Reporting To in dropdown in Time Management Setup
    And Click no Radio button in Regenerate Paychex File
    Then Select valid group rights in process mapping
    Then close the Admin Page

  @TC_30
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Click Jet Edge and Jet Select radio button in create user
    Then Enter valid first name "Test" in create user
    And Enter valid Middle name "T" in create user
    Then Enter valid Last name "T" in create user
    And Enter valid Email "0211thiru@gmail.com" in create user
    Then Select valid user type "Operational Manager" in create user
    And Enter valid Initials "T" in create user
    Then Select valid user role "Support Team" in create user
    And Select valid Country in create user
    Then Select valid State in create user
    And Enter valid Phone "1234567890" in create user
    Then Enter valid Cell "1234567890" in create user
    And Select the checkbox in active field
    Then Click No Radio button in Two FA
    And Click the Email Radio button
    Then Click Yes Radio button in Tail Availability
    And Click Yes Radio button in Direct Access Rights
    Then Click No Radio button in Ask Security Questions
    And Click Yes Radio button in Login to Owner Portal
    Then Click Yes Radio button in Owner Survey
    And Click Yes Radio button in GM% Report
    Then Click Yes Radio button in Trip Folder Creation
    And Click Yes Radio button in Trip Invoice
    Then Click Yes Radio button in Allow Access Rights
    And Click Admin Radio button in Role
    Then Click All Employees Radio button in Show Timsheet For
    And Select valid work day in dropdown in Time Management Setup
    Then Select valid Reporting To in dropdown in Time Management Setup
    And Click no Radio button in Regenerate Paychex File
    Then Select valid group rights in process mapping
    Then close the Admin Page

  @TC_31
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Enter valid first name "Test" in create user
    And Enter valid Middle name "T" in create user
    Then Enter valid Last name "T" in create user
    And Enter valid Email "0211thiru@gmail.com" in create user
    Then Select valid user type "Operational Manager" in create user
    And Enter valid Initials "T" in create user
    Then Select valid user role "Support Team" in create user
    And Select valid Country in create user
    Then Select valid State in create user
    And Enter valid Phone "1234567890" in create user
    Then Enter valid Cell "1234567890" in create user
    And Select the checkbox in active field
    Then Click No Radio button in Two FA
    And Click the Email Radio button
    Then Click Yes Radio button in Tail Availability
    And Click Yes Radio button in Direct Access Rights
    Then Click No Radio button in Ask Security Questions
    And Click Yes Radio button in Login to Owner Portal
    Then Click Yes Radio button in Owner Survey
    And Click Yes Radio button in GM% Report
    Then Click Yes Radio button in Trip Folder Creation
    And Click Yes Radio button in Trip Invoice
    Then Click Yes Radio button in Allow Access Rights
    And Click Admin Radio button in Role
    Then Click All Employees Radio button in Show Timsheet For
    And Select valid work day in dropdown in Time Management Setup
    Then Select valid Reporting To in dropdown in Time Management Setup
    And Click no Radio button in Regenerate Paychex File
    Then Select valid group rights in process mapping
    And Click clear button in create user
    Then close the Admin Page

  @TC_32
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Click add user button in create user
    Then Enter valid first name "Test" in create user
    And Enter valid Middle name "T" in create user
    Then Enter valid Last name "T" in create user
    And Enter valid Email "0211thiru@gmail.com" in create user
    Then Select valid user type "Operational Manager" in create user
    And Enter valid Initials "T" in create user
    Then Select valid user role "Support Team" in create user
    And Select valid Country in create user
    Then Select valid State in create user
    And Enter valid Phone "1234567890" in create user
    Then Enter valid Cell "1234567890" in create user
    And Select the checkbox in active field
    Then Click No Radio button in Two FA
    And Click the Email Radio button
    Then Click Yes Radio button in Tail Availability
    And Click Yes Radio button in Direct Access Rights
    Then Click No Radio button in Ask Security Questions
    And Click Yes Radio button in Login to Owner Portal
    Then Click Yes Radio button in Owner Survey
    And Click Yes Radio button in GM% Report
    Then Click Yes Radio button in Trip Folder Creation
    And Click Yes Radio button in Trip Invoice
    Then Click Yes Radio button in Allow Access Rights
    And Click Admin Radio button in Role
    Then Click All Employees Radio button in Show Timsheet For
    And Select valid work day in dropdown in Time Management Setup
    Then Select valid Reporting To in dropdown in Time Management Setup
    And Click no Radio button in Regenerate Paychex File
    Then Select valid group rights in process mapping
    And Click save button in create user
    Then close the Admin Page

  @TC_33
  Scenario: Admin:User Photo
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click User Photo button in Admin
    And Select valid user type in the dropdown in User Photo
    Then Click search button in User Photo
    Then close the Admin Page

  @TC_34
  Scenario: Admin:User Photo
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click User Photo button in Admin
    And Enter valid user name or email "adharshr21@gmail.com" in search box in User Photo
    Then Click search button in User Photo
    Then close the Admin Page

  @TC_35
  Scenario: Admin:User Photo
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click User Photo button in Admin
    And Enter valid user name or email "adharshr21@gmail.com" in search box in User Photo
    Then Click search button in User Photo
    And Click edit button in the webtable
    Then Click close button in upload photo pop up
    Then close the Admin Page

  @TC_36
  Scenario: Admin:User Photo
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click User Photo button in Admin
    And Enter valid user name or email "adharshr21@gmail.com" in search box in User Photo
    Then Click search button in User Photo
    And Click edit button in the webtable
    Then Upload valid photo in the pop up
    And Click save button in upload photo pop up
    Then close the Admin Page

  @TC_37
  Scenario: Admin:Group Rights Setup
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click Group Rights Setup button in Admin
    And Click add group button in Group Rights Setup
    Then Click back button in Group Rights Setup
    Then close the Admin Page

  @TC_38
  Scenario: Admin:Group Rights Setup
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click Group Rights Setup button in Admin
    And Click add group button in Group Rights Setup
    Then Click save button in Group Rights Setup
    Then close the Admin Page

  @TC_39
  Scenario: Admin:Group Rights Setup
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click Group Rights Setup button in Admin
    And Click add group button in Group Rights Setup
    Then Enter valid group name "Test" in Group Rights Setup
    And Select valid process in dropdown "Admin" in Group Rights Setup
    Then Unselect the checkbox in Group Rights Setup
    Then Click save button in Group Rights Setup
    Then close the Admin Page

  @TC_40
  Scenario: Admin:Group Rights Setup
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click Group Rights Setup button in Admin
    And Click add group button in Group Rights Setup
    Then Enter valid group name "Test" in Group Rights Setup
    And Select valid process in dropdown "Admin" in Group Rights Setup
    Then Select the checkbox in Group Rights Setup
    Then Click save button in Group Rights Setup
    Then close the Admin Page

  @TC_41
  Scenario: Admin:Group Rights Setup
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click Group Rights Setup button in Admin
    And Click edit button in Group Rights Setup
    Then Click back button in Group Rights Setup
    Then close the Admin Page

  @TC_42
  Scenario: Admin:Group Rights Setup
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click Group Rights Setup button in Admin
    And Click edit button in Group Rights Setup
    And Modify valid details in Group Rights Setup
    Then Click save button in Group Rights Setup
    Then close the Admin Page

  @TC_43
  Scenario: Admin:IP WhiteList
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click IP WhiteList button in Admin
    And Click export button in IP WhiteList
    Then close the Admin Page

  @TC_44
  Scenario: Admin:IP WhiteList
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click IP WhiteList button in Admin
    And Click Add IP Whitelist button
    Then Click close button in IP Whitelist Details
    Then close the Admin Page

  @TC_45
  Scenario: Admin:IP WhiteList
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click IP WhiteList button in Admin
    And Click Add IP Whitelist button
    Then Click save button in IP Whitelist Details
    Then close the Admin Page

  @TC_46
  Scenario: Admin:IP WhiteList
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click IP WhiteList button in Admin
    And Click Add IP Whitelist button
    Then Enter valid IP Address "123.123.1.1" in IP Whitelist
    And Enter valid  IP Location "Test Location" in IP Whitelist
    Then Enter valid Responsible Person "Tester" in IP Whitelist
    And Enter valid notes "Test" in IP Whitelist
    Then Click clear button in IP Whitelist Details
    Then close the Admin Page

  @TC_47
  Scenario: Admin:IP WhiteList
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click IP WhiteList button in Admin
    And Click Add IP Whitelist button
    Then Enter valid IP Address "123.123.1.1" in IP Whitelist
    And Enter valid  IP Location "Test Location" in IP Whitelist
    Then Enter valid Responsible Person "Tester" in IP Whitelist
    And Enter valid notes "Test" in IP Whitelist
    Then Click save button in IP Whitelist Details
    Then close the Admin Page

  @TC_48
  Scenario: Admin:IP WhiteList
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click IP WhiteList button in Admin
    And Click edit button in IP Whitelist
    Then Click close button in IP Whitelist Details
    Then close the Admin Page

  @TC_49
  Scenario: Admin:IP WhiteList
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click IP WhiteList button in Admin
    And Click edit button in IP Whitelist
    Then Click clear button in IP Whitelist Details
    Then close the Admin Page

  @TC_50
  Scenario: Admin:IP WhiteList
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click IP WhiteList button in Admin
    And Click edit button in IP Whitelist
    And Modify valid details in IP Whitelist
    Then Click save button in IP Whitelist Details
    Then close the Admin Page

  @TC_51
  Scenario: Admin:Unlocked User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When User enter valid email id and invalid password six times to lock the user "adharshr21@gmail.com" and "123123321"
    And click the Signin button six times to lock the user
    When User enter valid email id and invalid password six times to lock the user "adharshr21@gmail.com" and "Soundharya"
    And click the Signin button six times to lock the user
    When User enter valid email id and invalid password six times to lock the user "adharshr21@gmail.com" and "ads@123"
    And click the Signin button six times to lock the user
    When User enter valid email id and invalid password six times to lock the user "adharshr21@gmail.com" and "asd@123"
    And click the Signin button six times to lock the user
    When User enter valid email id and invalid password six times to lock the user "adharshr21@gmail.com" and "asd@123"
    And click the Signin button six times to lock the user
    When User enter valid email id and invalid password six times to lock the user "adharshr21@gmail.com" and "asd@123"
    And click the Signin button six times to lock the user
    When User enter valid email id and invalid password six times to lock the user "adharshr21@gmail.com" and "asd@123"
    And click the Signin button six times to lock the user
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click Unlocked User button in Admin
    And Click unlock button in Unlocked User and check page behaviour
    Then close the Admin Page

  @TC_52
  Scenario: Admin:Country
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click Country button in Admin
    And Click export button in Country
    Then close the Admin Page

  @TC_53
  Scenario: Admin:Country
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click Country button in Admin
    And Click Add Country button
    Then Click close button in Add Country
    Then close the Admin Page

  @TC_54
  Scenario: Admin:Country
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click Country button in Admin
    And Click Add Country button
    Then Click save button in Add Country
    Then close the Admin Page

@TC_55
  Scenario: Admin:Country
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click Country button in Admin
    And Click Add Country button
    Then Enter valid "TE" CodeX2 details
    And Enter valid "IND" Country Code details
    Then Enter valid "INDIA" Country Name details
    And Uncheck the checkbox in active field in country
    Then Click clear button in Add Country
    Then close the Admin Page
    
  @TC_56
  Scenario: Admin:Country
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click Country button in Admin
    And Click Add Country button
    Then Enter valid "TE" CodeX2 details
    And Enter valid "IND" Country Code details
    Then Enter valid "INDIA" Country Name details
    And Uncheck the checkbox in active field in country
    Then Click save button in Add Country
    Then close the Admin Page


  @TC_57
  Scenario: Admin:Country
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click Country button in Admin
    And Click Add Country button
    Then Enter valid "TE" CodeX2 details
    And Enter valid "IND" Country Code details
    Then Enter valid "INDIA" Country Name details
    And Select the checkbox in active field in country
    Then Click save button in Add Country
    Then close the Admin Page

  @TC_57a
  Scenario: Admin:Country
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click Country button in Admin
    And Click edit button in the webtable in Add Country
    Then Click close button in Add Country
    Then close the Admin Page

  @TC_58
  Scenario: Admin:Country
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click Country button in Admin
    And Click edit button in the webtable in Add Country
    Then Click clear button in Add Country
    Then close the Admin Page

  @TC_59
  Scenario: Admin:Country
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click Country button in Admin
    And Click edit button in the webtable in Add Country
    And Modify valid details in Add Country
    Then Click save button in Add Country
    Then close the Admin Page

  @TC_60
  Scenario: Admin:State
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click State button in Admin
    And Select valid country name in the dropdown
    Then close the Admin Page

  @TC_61
  Scenario: Admin:State
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click State button in Admin
    And Select valid country name in the dropdown
    Then Click export button in state
    Then close the Admin Page

  @TC_62
  Scenario: Admin:State
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click State button in Admin
    And Click add state button
    Then Click Back button in add state
    Then close the Admin Page

  @TC_63
  Scenario: Admin:State
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click State button in Admin
    And Click add state button
    Then Select valid country in add state
    And Enter valid State Name in add state
    Then Enter valid State Code in add state
    And Uncheck the chekbox in active field
    Then Click Clear button in add state
    Then close the Admin Page

  @TC_64
  Scenario: Admin:State
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click State button in Admin
    And Click add state button
    Then Select valid country in add state
    And Enter valid State Name in add state
    Then Enter valid State Code in add state
    And Uncheck the chekbox in active field
    Then Click save button in add state
    Then close the Admin Page

  @TC_65
  Scenario: Admin:State
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click State button in Admin
    And Click add state button
    Then Select valid country in add state
    And Enter valid State Name in add state
    Then Enter valid State Code in add state
    And Select the chekbox in active field
    Then Click save button in add state
    Then close the Admin Page

  @TC_66
  Scenario: Admin:State
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click State button in Admin
    And Select valid country name in the dropdown
    And Click edit button in state
    Then Click Back button in add state
    Then close the Admin Page

  @TC_67
  Scenario: Admin:State
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click State button in Admin
    And Click edit button in state
    Then Click Clear button in add state
    Then close the Admin Page

  @TC_68
  Scenario: Admin:State
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click State button in Admin
    And Click edit button in state
    And Modify valid details in add state
    Then Click save button in add state
    Then close the Admin Page

  @TC_69
  Scenario: Admin:Reset Password
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click Reset Password button in Admin
    And Click owner radio button in Reset Password
    Then Click view button in Reset Password
    And Click close button in Reset Password
    Then close the Admin Page

  @TC_70
  Scenario: Admin:Reset Password
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click Reset Password button in Admin
    And Click owner radio button in Reset Password
    Then Click view button in Reset Password
    And Click save button in Reset Password
    Then close the Admin Page

  @TC_71
  Scenario: Admin:Reset Password
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click Reset Password button in Admin
    And Click owner radio button in Reset Password
    Then Click view button in Reset Password
    And Enter valid New password "Soundharya@123" in Reset Password
    Then Enter valid Confirm password "Soundharya@123" in Reset Password
    And Click save button in Reset Password
    Then close the Admin Page

  @TC_72
  Scenario: Admin:Reset Password
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click Reset Password button in Admin
    And Click Jet Edge radio button in Reset Password
    Then Click view button for "soundharya@sankarasoftware.com" in Jet Edge in Reset Password
    And Enter valid New password "Soundharya@123" in Jet Edge in Reset Password
    Then Enter valid Confirm password "Soundharya@123" in Jet Edge in Reset Password
    And Click save button in Reset Password
    Then Click No button in information page
    And Click close button in alert pop up
    Then close the Admin Page

  @TC_73
  Scenario: Admin:Reset Password
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When Enter valid user name "soundharya@sankarasoftware.com"
    And Enter new password "Soundharya@123"
    And click the Signin button To Check Admin
    Then Check page landed to homepage or not
    Then close the Admin Page

  #Extra scenarios based on Vinothini Scripts
  
  @TC_74
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Select valid user type "Maintanance Manager" in the dropdown
    And Enter valid user name or email "adharshr21@gmail.com" in search box
    Then Click search button and check page behaviour
    Then click edit button in the webtable in create user
    And Click back button in create user
    Then close the Admin Page

  @TC_75
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Select valid user type in the dropdown
    And Enter valid user name or email "adharshr21@gmail.com" in search box
    Then Click search button and check page behaviour
    Then click edit button in the webtable in create user
    And Click clear button in create user
    Then close the Admin Page

  @TC_76
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Select valid user type in the dropdown
    And Enter valid user name or email "adharshr21@gmail.com" in search box
    Then Click search button and check page behaviour
    Then click edit button in the webtable in create user
    And Click clear button in create user
    Then Click save button in create user
    Then close the Admin Page

  @TC_77
  Scenario: Admin:Create User
    Given To Check Admin User is navigating to JetEdge URL is "http://192.168.1.33/CIADMIN/Login.aspx"
    When To Check Admin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Admin
    Then Click create user button in Admin
    And Select valid user type in the dropdown
    And Enter valid user name or email "adharshr21@gmail.com" in search box
    Then Click search button and check page behaviour
    Then click edit button in the webtable in create user
    And Modify valid details in create user
    Then Click save button in create user
    Then close the Admin Page
