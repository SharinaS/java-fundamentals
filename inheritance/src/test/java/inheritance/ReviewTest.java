package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    @Test
    public void testReview() {
        Review bobby = new Review("Bobby", "I enjoyed the restaurant", 4);
        System.out.println(bobby.toString());
    }


    @Test
    public void testReviewAdding() {
        Restaurant woodblock = new Restaurant("Woodlock", 5, 4);
        Review reviewOfWoodblock = new Review("Tommy", "it's good", 5);
        woodblock.addReview(reviewOfWoodblock);
    }

    // test that expects an illegal argument exception to be thrown
    @Test(expected = IllegalArgumentException.class)
    public void testReviewConstructor_throwsExceptionForTooHighOfRating() {
        new Review("Tammy", "this should break", 20);
    }
}