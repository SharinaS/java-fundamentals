package inheritance;

import java.util.LinkedList;

public class Theater implements Reviewable{
    // instance variables
    String name;
    LinkedList <String> movies;
    LinkedList <Review> reviews;

    // constructor
    public Theater(String name) {
        this.name = name;
        this.reviews = new LinkedList<>();
    }

    // instance methods
    public void addMovie(String movie) {
        if(movies == null) {
            movies = new LinkedList<>();
        }
        this.movies.add(movie);

    }

    public void removeMovie(String movie){
        if(movies == null) {
            System.out.println("There are no movies in list");
        } else {
            this.movies.remove(movie);
        }

    }

    @Override
    public void addReview(Review review) {
        this.reviews.add(review);
        review.business = this;
    }

    // string method
    @Override
    public String toString() {
        return String.format(
                "The theater %s is showing these movies: %s.",
                this.name, this.movies);
    }
}
