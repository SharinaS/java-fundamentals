# Java Fundamentals
This repo contains Java Fundamentals from Code 401 Java at Code Fellows

## Contributor
Sharina Stubbs

## Files and Methods Contained Here
### [Basics.java](https://github.com/SharinaS/java-fundamentals/blob/master/basics/Basics.java) contains the following methods:
* pluralize()
* flipNHeads()
* clock()

### [Library.java](https://github.com/SharinaS/java-fundamentals/blob/master/basiclibrary/src/main/java/basiclibrary/Library.java) contains the following methods:
* diceRolls()
* duplicates()
* averages()
* nestedAverages()
* octoberWeather()
* tallyingVotes()

### The linter Java application contains [app.java](https://github.com/SharinaS/java-fundamentals/blob/master/linter/src/main/java/linter/App.java):
This app contains a method called readFile(), which reads through a given file, and checks each line for the presence of a semicolon. If lines are empty, end with an opening or closing curly brace, or if the line contains if or else, there will not be an error. 

### Inheritance 
Inheritance is a library that contains two classes:
* public class Restaurant
* public class Review

All classes have constructor functions. When a review is added, it is added as a node to a linked list, using instantiations of the Review class. This means that each node has review author, review body and review stars. Meanwhile each restaurant has a name, a star rating from 0 to 5, and a price category. Currently the price category is from 1 to 5, though again, this is not limited anywhere, currently. When a reviewer adds a review, the restaurant's star rating updates.

Methods included in the Restaurant class include:
* addReview(Review review));
* getRestaurantStarRating()
* addReviewsAndRating(String name, String body, int stars0To5)
* public String toString()

There are tests written for all methods and the constructor function.