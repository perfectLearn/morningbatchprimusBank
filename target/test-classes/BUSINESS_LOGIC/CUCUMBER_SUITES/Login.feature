Feature: Login feature

Background: User is successfully logged in
Given user open the "chrome" browser and exe is "D:\\Feb morning 8am batch project\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
Given user enter the url as "http://primusbank.qedgetech.com"


@SmokeTest
Scenario Outline: Login functinality with valid credentials
When user enter <username> as username
When user enter <password> as password
When user click on login button
Then user is on "Admin" page and get meesage as welcome to admin


Examples:
            |username  | password|               
            |Admin      |Admin   |
            |admin123   |admin321|
            |123admin   |#$$admin |
          
            