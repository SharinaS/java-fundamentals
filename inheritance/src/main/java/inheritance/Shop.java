package inheritance;

import java.util.LinkedList;

public class Shop implements Reviewable {
    // instance variables
    String name;
    String description;
    int priceCategory;
    LinkedList<Review> reviews;

    // constructor function
    public Shop (String name, String description, int priceCategory) {
        this.name = name;
        this.description = description;
        this.priceCategory = priceCategory;
        this.reviews = new LinkedList<>();
    }

    // instance methods from Reviewables Interface
    @Override
    public void addReview(Review review) {
        this.reviews.add(review);
        review.business = this;
    }

    @Override
    public String toString() {
        return String.format(
                "The shop %s is %s with a price category of %s.",
                this.name, this.description, this.priceCategory);
    }
}
