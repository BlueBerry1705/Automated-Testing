Feature: addshoppingcart

Scenario: Add a product to the shopping cart

Given the user is the index web
When the user clicks the television button
And the user clicks the añadir carrito button
And the user clicks the no gracias button
Then appears the text Su producto fue añadido con éxito al carrito

