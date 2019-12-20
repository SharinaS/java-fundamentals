# Java Fundamentals
This repo contains Java Fundamentals from Code 401 Java at Code Fellows

# Contributor
Sharina Stubbs

# How To Test The Code:
In the terminal, run `./gradlew test`

# Methods and Classes Contained within This Repo:
## [Basics.java](https://github.com/SharinaS/java-fundamentals/blob/master/basics/Basics.java) contains the following methods:
* pluralize()
* flipNHeads()
* clock()

## [Library.java](https://github.com/SharinaS/java-fundamentals/blob/master/basiclibrary/src/main/java/basiclibrary/Library.java) contains the following methods:
* diceRolls()
* duplicates()
* averages()
* nestedAverages()
* octoberWeather()
* tallyingVotes()

## The linter Java application contains [app.java](https://github.com/SharinaS/java-fundamentals/blob/master/linter/src/main/java/linter/App.java):
This app contains a method called readFile(), which reads through a given file, and checks each line for the presence of a semicolon. If lines are empty, end with an opening or closing curly brace, or if the line contains if or else, there will not be an error. 

## [Inheritance](https://github.com/SharinaS/java-fundamentals/tree/master/inheritance) 
### About this Library
Inheritance is a library that uses an interface to interact with various classes. It is built on the idea of a website that allows users to review restaurants, shops and theaters.

All classes have constructor functions. When a review is added, it is added as a node to a linked list, using instantiations of the Review class. This means that each node has review author, review body and review stars. Meanwhile a restaurant has a name, a star rating from 0 to 5, and a price category. Shops have name, description and a price category, and theaters have a name and reviews. Currently the price category is from 1 to 5, though again, this is not limited anywhere, currently. When a reviewer adds a review, the business' star rating updates. 

### This library contains the following classes + 1 interface:
* [Restaurant](https://github.com/SharinaS/java-fundamentals/blob/master/inheritance/src/main/java/inheritance/Restaurant.java) 
* [Shop](https://github.com/SharinaS/java-fundamentals/blob/master/inheritance/src/main/java/inheritance/Shop.java)
* [Review](https://github.com/SharinaS/java-fundamentals/blob/master/inheritance/src/main/java/inheritance/Review.java)
* [Theater](https://github.com/SharinaS/java-fundamentals/blob/master/inheritance/src/main/java/inheritance/Theater.java)
* [Reviewable](https://github.com/SharinaS/java-fundamentals/blob/master/inheritance/src/main/java/inheritance/Reviewable.java)

### Methods in the Restaurant class:
* addReview(Review review));
* getRestaurantStarRating()
* addReviewsAndRating(String name, String body, int stars0To5)
* toString()

### Methods in the Shop Class:
* addReview(Review review)
* toString()

### Methods in the Review Class:
* toString()

### Methods in the Theater Class:
* addMovie(String movie)
* removeMovie(String movie)
* addReview(Review review)
* toString()

### Method in the Reviewable Interface
* addReview(Review review)

### SetUp and Feature Tasks for Inheritance:
Setup
* Within the java-fundamentals repo, create a directory named inheritance. cd into that directory, and run gradle init --type java-library.

Feature Tasks
* Create a class to represent a Restaurant. Each Restaurant should have a name, a number of stars betweeen 0 and 5, and a price category (i.e. number of dollar signs).
* Implement a Restaurant constructor.
  * Test that your Restaurant constructor is behaving reasonably.
* Implement a reasonable toString method for Restaurants.
* Write a test to create an instance of Restaurant and ensure that its toString is working properly.
* Create a class to represent a Review. Each Review should have a body, an author, and a number of stars.
* Write a Review constructor.
  * Test that your constructor is working reasonably.
* Implement a reasonable toString method for Reviews.
* Write a test to create an instance of Review and ensure that its toString is working properly.
* A Review should be about a single Restaurant. Choose an implementation for this, and implement it. Some considerations:
  * Should a Review know which Restaurant it is about?
  * Should a Restaurant know which Reviews are about it?
  * Is a Restaurant a special type of Review? Is a Review a special type of Restaurant? Is there common functionality that unites them?
* Update your toString and constructor methods appropriately, and also update your testing code to test this new functionality.
* Add an instance method addReview to your Restaurant class. This method should take in a Review instance, and associate that review with this Restaurant. The specific methodology for this will vary, depending on the implementation you chose above.
* Add tests to ensure that when you call addReview, the association is created between the Restaurant and the Review.
* When you associate a review with a restaurant, that restaurant’s star rating should change. Ensure that your addReview method updates the Restaurant star rating appropriately, and add tests. (In particular, ensure that if you’re trying to call addReview when the restaurant and the review are already associated, the star rating of the restaurant does not update.)

Stretch Goals
* Some Restaurants are part of a chain, and it would be nice to capture, for example, that all of the McDonald’s locations are McDonaldses.
  * Choose an implementation for this, and implement it.
  * Add tests for this functionality.
* Add an updateStars method to the Review class. This method should update the stars for that review, and, if the review is associated with a restaurant, also update the number of stars for that restaurant.
* Refactor: keeping track of stars for restaurants is getting complicated. Get rid of that instance variable, and instead make this an instance method that calculates a restaurant’s star rating on the fly when it’s called.
* Create another class for a User, so that we know which reviews were written by the same User. Ensure that a single User can’t submit multiple Reviews for the same Restaurant.