package inheritance;

public class Review {
    // instance variables
    String author;
    String review;
    int starRating;
    Reviewable business;

    // this allows our addReview method, given our interface
    Reviewable reviewable;

    public Review(String name, String review, int stars, Reviewable business) {
        if(stars > 5) {
            throw new IllegalArgumentException("Rating must be less than or equal to 5 stars");
        }
        this.author = name;
        this.review = review;
        this.starRating = stars;
        this.business = business;
    }

    @Override
    public String toString() {
        return String.format(
                "%s gave the business %s stars, and gave the following review: %s",
                this.author, this.starRating, this.review);
    }
}

