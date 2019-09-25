package inheritance;

// Thanks to James Dansie for providing help with the logic and some code, and code review on 9/24/19 at Code Fellows

import java.util.LinkedList;

public class Restaurant {
    // Instance variables
    String name;
    double stars0To5;
    int priceCategory;

    LinkedList<Review> reviews;

    // constructor for Restaurant
    public Restaurant (String name, double stars0To5, int priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
        this.stars0To5 = stars0To5;
        // initialize linked list to initially be empty
        this.reviews = new LinkedList<>();
    }

    // adds new review to this restaurant
    public void addReview(Review review){
        // this review is set up inside the reviews list
        this.reviews.add(review);
        // sets up a new pointer that points review to its restaurant
        review.restaurant = this;
    }

    public void getRestaurantStarRating(){
        int starSum = 0;

        // start at the head of the restaurant list and add up the stars
        for(Review r : this.reviews) {
            starSum += r.starRating;
        }
        // divide the number of stars by the number of reviews
        this.stars0To5 = starSum / this.reviews.size();
    }

    public void addReviewsAndRating(String name, String body, int stars0To5) {  //addReviewedHead
        addReview(new Review(name, body, stars0To5));
        getRestaurantStarRating();
    }

    @Override
    public String toString() {
        return String.format(
                "The restaurant %s has a price category of %s and has an average of %s stars",
                this.name, this.priceCategory, this.stars0To5);
    }
}


/* NOTES
    ret.reviews.get(0).restaurant
    One restaurant has many reviews, and one review has one restaurant
     */