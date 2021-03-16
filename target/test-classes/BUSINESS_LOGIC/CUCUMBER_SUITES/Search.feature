Feature: Login feature

Background: User is successfully logged in
Given user open the "chrome" browser and exe is "D:\\Feb morning 8am batch project\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
Given user enter the url as "http://primusbank.qedgetech.com"
When user enter "Admin" as username
When user enter "Admin" as password
When user click on login button


@Batch
Scenario: Search functionality
When user click on branches
When user select "INDIA" as country
When user select "Andhra Pradesh" as state
When user select "Hyderabad" as city
When user click on Search button
Then application shows branches for hyderabad city

