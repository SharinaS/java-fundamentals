package inheritance;

// a body, an author, and a number of stars.
//

public class Review {
    // point to the appropriate restaurant
    // constructor and a toString
    String author;
    String body;
    int stars;

    public Review(String name, String body, int stars) {
        this.author = name;
        this.body = body;
        this.stars = stars;
    }

    @Override
    public String toString() {
        return String.format("%s gave the restaurant %s stars, and gave the following review: %s", this.author, this.stars, this.body);
    }


}

