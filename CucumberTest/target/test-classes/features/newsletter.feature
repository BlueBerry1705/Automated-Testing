Feature: newsletter

Scenario: Suscribe Newsletter

Given the user is the index
When the user clicks the suscribe button
And the user enters his name, last name and email
And the user clicks the send button
Then appears the text You have successfully subscribed to this newsletter

