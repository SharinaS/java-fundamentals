package inheritance;

// Thanks to James Dansie for providing some help with the logic and some code,
// as well as to code review on 9/24/19 at Code Fellows with Michelle Ferreirae.
// NOTE: One restaurant has many reviews, and one review has one restaurant.
// NOTE: Interfaces are accessed via "implements" while Inheritance is used via "extends"

import java.util.LinkedList;

public class Restaurant implements Reviewable {
    // Instance Variables
    String name;
    double stars0To5;
    int priceCategory;
    LinkedList<Review> reviews;

    // Constructor
    public Restaurant (String name, double stars0To5, int priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
        this.stars0To5 = stars0To5;
        this.reviews = new LinkedList<>();
    }

    // adds new review to this restaurant
    @Override
    public void addReview(Review review){
        // add review to the end of the list in the constructor
        this.reviews.add(review);
        // set up a new pointer
        review.reviewable = this;
    }

    public void getStarRating(){
        int starSum = 0;
        // start at the head of the restaurant list and add up the stars
        for(Review r : this.reviews) {
            starSum += r.starRating;
        }
        // divide the number of stars by the number of reviews
        this.stars0To5 = starSum / this.reviews.size();
    }

    public void addReviewsAndRating(String name, String body, int stars0To5) {
        addReview(new Review(name, body, stars0To5, this));
        getStarRating();
    }

    @Override
    public String toString() {
        return String.format(
                "The restaurant %s has a price category of %s and has an average of %s stars",
                this.name, this.priceCategory, this.stars0To5);
    }
}