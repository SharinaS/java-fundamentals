package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    @Test
    public void testReview() {
        Review bobby = new Review("Bobby", "I enjoyed the restaurant", 4);
        System.out.println(bobby.toString());
    }
}