Feature: Searchbags

Scenario: Show Bags

Given the user is the index page
When the user enters bags in the search bar
And the user clicks the search button
Then the bags list appears
