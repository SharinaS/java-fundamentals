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

### [Inheritance](https://github.com/SharinaS/java-fundamentals/tree/master/inheritance) 
Inheritance is a library that uses an interface to interact with various classes. It is built on the idea of a website that allows users to review restaurants, shops and theaters.

This library contains the following classes + 1 interface:
* Class Reviews
* Class Restaurant
* Class Shop
* Class Theater
* Interface Reviewable

All classes have constructor functions. When a review is added, it is added as a node to a linked list, using instantiations of the Review class. This means that each node has review author, review body and review stars. Meanwhile a restaurant has a name, a star rating from 0 to 5, and a price category. Shops have name, description and a price category, and theaters have a name and reviews. Currently the price category is from 1 to 5, though again, this is not limited anywhere, currently. When a reviewer adds a review, the business' star rating updates. 

### Methods in the Restaurant class:
* addReview(Review review));
* getRestaurantStarRating()
* addReviewsAndRating(String name, String body, int stars0To5)
* toString()

### Methods in the Shop Class:
* addReview(Review review)
* toString()

### Methods in the Theater Class:
* addMovie(String movie)
* removeMovie(String movie)
* addReview(Review review)
* toString()
