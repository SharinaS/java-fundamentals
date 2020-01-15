package inheritance;

// Thanks to James Dansie for providing some help with the logic and some code,
// as well as to code review on 9/24/19 at Code Fellows with Michelle Ferreirae.
// NOTE: One restaurant has many reviews, and one review has one restaurant.
// NOTE: Interfaces are accessed via "implements" while Inheritance is used via "extends"

import java.util.LinkedList;

public class Restaurant implements Reviewable {
    // Instance Variables
    String name;
    double starRating;
    int priceCategory;
    LinkedList<Review> reviews;

    // Constructor
    public Restaurant (String name, double starRating, int priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
        this.starRating = starRating;
        this.reviews = new LinkedList<>();
    }


//    public void addReviewAndRating(String name, String body, int stars0To5) {
//        // make a new review instance
//        Review newReview = new Review(name, body, stars0To5, this);
//        // add the new review to the list, using the addReview method
//        addReview(newReview);
//        // update the restaurant review with getStarRating method.
//        getStarRating();
//    }


    public void addReviewAndRating(String name, String body, int stars0To5, Reviewable business) {
        // make a new review instance
        Review newReview = new Review(name, body, stars0To5, this);
        // add the new review to the list, using the addReview method
        addReview(newReview);
        // update the restaurant review with getStarRating method.
        getStarRating();
    }

    @Override
    public void addReview(Review review){
        // add review to the end of the list in the constructor
        this.reviews.add(review);
        // Review has the instance variable business, and so this line points it towards Restaurant.
        review.business = this;
    }

    public void getStarRating(){
        int starSum = 0;
        // start at the head of the restaurant list and add up the stars
        for(Review r : this.reviews) {
            starSum += r.starRating;
        }
        // get the average rating: divide the number of stars by the number of reviews, and update constructor
        this.starRating = starSum / this.reviews.size();
    }

    @Override
    public String toString() {
        return String.format(
                "The restaurant %s has a price category of %s and has an average of %s stars",
                this.name, this.priceCategory, this.starRating);
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }
}