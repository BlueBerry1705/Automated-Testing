Feature: register

Scenario: Register an account

Given the user is the index menu
When the user clicks the profile button
And the user clicks the registro button
And the user enters an email
And the user clicks the enviar codigo button
Then appears the text Comprueba tu buzón de correo


Scenario: Invalid Email

Given the user is the index menu
When the user clicks the profile button
And the user clicks the registro button
And the user enters bad email
And the user clicks the enviar codigo button
Then appears the text correo invalido


