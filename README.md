# propertyFinderCucumberTests
A BDD based sample project which automates some scenarios for PropertyFinder Webapp using Selenium WebDriver and Java. Reports are generated using ExtentReports.js.

Some of the attiributes of the project: 

- Cucumber BDD
- Configurable URLs
- Failed Scenarios Screenshots
- Browsers: Chrome, Firefox, Headless ChromeDriver
- Reports in HTML (ExtentReports)

# Details of Coverage:
## Feature:Search Agents: 

Tests cover following flows in two scenarios:

Scenario 1: Search for an Agent based on language preferences,
  retrieve the count, then further filter the results
  on location, retrieve count again and assert that
  result count has reduced.
  
    1) Open https://propertyfinder.ae
    2) Click on FIND AGENTS tab (present on top panel) 
    3) Filter agents who can speak "HINDI, ENGLISH, ARABIC"
    4) Click on Search
    5) Note down the total count of agents
    6) Now further filter agents from India
    7) Note down the total count of agents
    8) Assert that latest count is less than the previous count

 
Scenario 2: Capture Details of the first Agent listed on the Agents Page

    1) Open https://propertyfinder.ae
    2) Click on FIND AGENTS tab (present on top panel) 
    3) Select First agent
    4) Capture following info in a text file
        i) Name
        ii) Nationality
        iii) Languages
        iv) License No
        v) About Me
        vi) Phone Number
        vii) Company Name
        viii) Experience
        ix) No of active listings
        x) LinkedIn URL (if present)

    5) Capture Screenshot of the page
    6) Change language to Arabic (top right corner)
    7) Capture screenshot again
 

## Feature: Search Property:

  Scenario 1: Search for a VILLA based on location and Minimum and Maximum bedrooms criteria, sort
  the results on price low to high and export the results into a CSV file

    1) Open http://propertyfinder.qa
    2) Search for VILLA to BUY in location THE PEARL with minimum 3BEDS and maximum 7BEDS
    3) Sort the villas from maximum price to lowest price
    4) Fetch all the prices of the listing and save it in a csv file with format : listing title - price

## How to Run:
- Place the chrome and Firefox driver binaries in C:/drivers/ folder. (this path can be changed in BrowserInvoke.java class) 
- Create a folder named 'Test' as C:/Test to contain screenshot and output files (this path can be changed in Utils.java class) 
- Run tests by executing TestRunner.java class using your IDE or maven by using the command: 
        mvn test -Dcucumber.options="src/test/resources"
        
## Reports:
  Two kinds of reports are generated:
  - Cucumber default JSON and HTML (target/htmlreport/index.html) - Not so pretty!
  - ExtentReport HTML (target/testReport.html) - JS based pretty report


