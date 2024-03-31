Feature: RedBus App Home Page Functionality
 
Background: Navigate to RedBus Home Page
Given I am a user of the RedBus app
When I open the RedBus app 
Then I should see the RedBus home page
 
Scenario: Search for buses
Given I am a user of the RedBus app
When I enter "<From>" , "<To>" , "<Date>"
Then I click on the search button

Scenario: User searches for train tickets
Given the user is on the RedBus home page
When the user selects the "<Train Tickets>" option from the menu
Then the user should see a list of available trains for the given route and date

Scenario: Enjoy the App Picture display
Given I am on the RedBus home page
When I scroll down 
Then I should see the "Enjoy the App" picture 
Then I should see scanner to download the app

Scenario: View Partnered with
Given I am on the RedBus home page app
When I scroll down to the Partnered with section
Then I should see a list of RTCS displayed

Scenario: View Private bus operators
Given I am on the RedBus home page app
When I scroll down to the Private Operators section
Then I should see a list of travels displayed
And I click on a specific travels
And I should be directed to the private bus details page

Scenario: Verify the display of country selector on home page
Given I am on the RedBus home page app
When I view the Global presence section
Then I should see a country selector dropdown
