package inheritance;

public class Review {
    // instance variables
    String author;
    String review;
    int starRating;
    // create a pointer back to the business, such as Restaurant
    Reviewable business;

    public Review(String name, String review, int stars, Reviewable business) {
        // limit the number of stars for each review's rating
        if(stars > 5) {
            throw new IllegalArgumentException("Rating must be less than or equal to 5 stars");
        }

        this.author = name;
        this.review = review;
        this.starRating = stars;
        this.business = null;
    }

    @Override
    public String toString() {
        return String.format(
                "%s gave the business, %s, %s stars, and gave the following review: %s",
                this.author, this.business, this.starRating, this.review);
    }
}

