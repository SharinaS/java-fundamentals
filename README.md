# Java Fundamentals
This repo contains code for projects centered around fundamental concepts of Java taught at Code Fellows in Fall 2019 while I was a student in their [Code401-Java-d6](https://github.com/SharinaS/seattle-java-401d6) "Advanced Software Development in Java with SpringMVC, Android and AWS" 10-week long class. The projects, classes and methods contained within are from the early days of the class.

For more advanced concepts and material, also learned within this same class, refer to my other repos that I generated during this time:
* [Data Structures and Algorithms](https://github.com/SharinaS/data-structures-and-algorithms)
* [CodeFellowship](https://github.com/SharinaS/codefellowship)
* [Songr](https://github.com/SharinaS/songr)
* [Quotes](https://github.com/SharinaS/quotes)
* [Bitmap-Transformer](https://github.com/SharinaS/bitmap-transformer)
* [Taskmaster](https://github.com/SharinaS/taskmaster)
* [FocaList](https://github.com/401-Focal-Point/Focalist)
* [ZombieTag, aka JavaTag](https://github.com/JavaAwesome/JavaTag)

This repo also has a Wiki that I used to keep notes in for concepts encountered during, and even after, the class.
* [My Java Wiki of Notes](https://github.com/SharinaS/java-fundamentals/wiki)

# Contributor
Sharina Stubbs

# A Collection of Challenges and a Linter Application
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

# A Library Called [Inheritance](https://github.com/SharinaS/java-fundamentals/tree/master/inheritance) 
Inheritance is a library that uses an interface to interact with various classes. It is built on the idea of a website that allows users to review restaurants, shops and theaters.

 ## About the Library
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

## SetUp and Feature Tasks for Inheritance - Day 1
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

## SetUp and Feature Tasks for Inheritance - Day 2
### Setup
Continue working in your inheritance library. Start by refactoring any of the relationships that you created in the last lab, but question today.

### Feature Tasks
* The users want shops! Create a Shop class; a Shop should have a name, description, and number of dollar signs.
  * Implement a constructor for a Shop.
  * Implement a reasonable toString method for Shops.
  * Add tests for the basics of your Shop class.
* The users also want to review shops!
  * It would be great if a Review could be about either a Shop or a Restaurant. Choose an implementation, and make this possible.
  * Ensure that your Shop class has an instance method to add a review about that shop, and that it works just as well as the Restaurant instance method with the same purpose.
  * Write tests for this functionality.
* The users want theaters! 
  * Create a Theater class; a Theater should have a name and all of the movies currently showing there. (Strings are fine for the movies; no need to create another class.)
  * Implement a constructor for a Theater.
  * Write addMovie and removeMovie instance methods that allow the theater to update which movies are being shown.
  * Implement a reasonable toString method for Theaters.
  * Test your Theater functionality.
* Review all the things!
* Ensure that your Theater is just as reviewable as your Restaurant and your Shop.
  * Test this functionality.
* Users are frustrated: they like having a body, an author, and a number of stars, but when they’re reviewing a Theater, they also want to specify which movie they saw.
* Some reviews should now have a String movie instance variable, to hold which movie that reviewer is referencing.
* Make sure that someone reviewing a Restaurant or a Shop doesn’t have to include which movie they saw!
* It’s also okay if someone doesn’t want to include the movie they saw when they’re reviewing a theater (maybe they just went in for the popcorn).
* Add testing for any new functionality you’ve created.

### Stretch Goals
Yesterday’s stretch goals only get more interesting today!
* Add an updateStars method to the Review class. This method should update the stars for that review, and, if the review is associated with a restaurant (or other reviewable thing!), also update the number of stars for that reviewable thing.
* Refactor: keeping track of stars is getting complicated. Get rid of that instance variable, and instead make this an instance method that calculates a reviewable’s star rating on the fly when that instance method is called.
* Create another class for a User, so that we know which reviews were written by the same User. Ensure that a single User can’t submit multiple Reviews for the same reviewable.

# How To Test The Code:
Navigate within the terminal to the directory of the code you wish to test. When you examine the files contained within the directory, you must have the following files to test in this way:
1. gradle/wrapper
2. build.gradle
3. gradlew
4. gradlew.bat
5. settings.gradle

In the terminal, run 
```
./gradlew test
```
