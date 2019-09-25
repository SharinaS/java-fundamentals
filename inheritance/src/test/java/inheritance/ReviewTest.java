package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    // class to use for testing, given Reviewable is expected by the compiler
    class TestReviewable implements Reviewable {

        @Override
        public void addReview(Review review) {

        }
    }

    // tests toString
    @Test
    public void testReview() {
        Review bobby = new Review("Bobby", "I enjoyed the restaurant", 4, new TestReviewable());
        System.out.println(bobby.toString());
    }

    // tests adding review
    @Test
    public void testReviewAdding() {
        Restaurant woodblock = new Restaurant("Woodlock", 5, 4);
        Review reviewOfWoodblock = new Review("Tommy", "it's good", 5, new TestReviewable());
        woodblock.addReview(reviewOfWoodblock);
    }

    // test that expects an illegal argument exception to be thrown
    @Test(expected = IllegalArgumentException.class)
    public void testReviewConstructor_throwsExceptionForTooHighOfRating() {
        new Review("Tammy", "this should break", 20, new TestReviewable());
    }
}