package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {
    Restaurant seattleFish;
    Restaurant greatRestaurant;

    @Before
    public void setup(){
        seattleFish = new Restaurant("Seattle Fish and Clams", 4, 2);
        greatRestaurant = new Restaurant("Great Restaurant", 3, 4);
    }

    //Check Restaurant constructor
    @Test
    public void testRestaurantContructor() {
        assertEquals(2, seattleFish.priceCategory);
        assertEquals(4, 4, seattleFish.starRating);
        assertEquals("Seattle Fish and Clams", seattleFish.name);
        assertEquals("Great Restaurant", greatRestaurant.name);
    }

    // Check that the Restaurant toString is working
    @Test
    public void testRestaurantToStringMethod() {
        String expectedResult = "The restaurant Seattle Fish and Clams has a price category of 2 and has an average " +
                "of 4.0 stars";
        assertEquals(
                "Expected a string with the restaurant's name, starRating and priceCategory",
                expectedResult,
                seattleFish.toString());
    }

    // Check star review for a restaurant
    @Test
    public void testAddReviewsAndRating() {
        greatRestaurant.addReviewAndRating("Nancy", "Yeah, this restaurant is great", 4, greatRestaurant);
        assertEquals(
                "Should have 4 stars",
                4,
                greatRestaurant.reviews.get(0).starRating
        );
    }

    // check average of reviews for restaurant while printing out string
    @Test
    public void testGetRestaurantStarRating() {
        greatRestaurant.addReviewAndRating("Nancy", "Yeah, this restaurant is great", 3, greatRestaurant);
        greatRestaurant.addReviewAndRating("Peter Pan", "Tinkle Bell makes a better waffle", 2, greatRestaurant);
        greatRestaurant.addReviewAndRating("Peter Piper", "Great salad", 4, greatRestaurant);
        assertEquals(
                "Should have 3 stars",
                "The restaurant Great Restaurant has a price category of 4 and has an average of 3.0 stars",
                greatRestaurant.toString()
        );
    }

    // check average of stars for a restaurant, and shows that when the restaurant and the review are already
    // associated, the star rating of the restaurant does not update, given the math provided in getStarRating()
    @Test
    public void testGetRestaurantStarRating2() {
        greatRestaurant.addReviewAndRating("Nancy", "Yeah, this restaurant is great", 1, greatRestaurant);
        greatRestaurant.addReviewAndRating("Peter Pan", "Tinkle Bell makes a better waffle", 2, greatRestaurant);
        greatRestaurant.addReviewAndRating("Peter Pan", "Tinkle Bell makes a better waffle", 2, greatRestaurant);
        greatRestaurant.addReviewAndRating("Peter Pan", "Tinkle Bell makes a better waffle", 2, greatRestaurant);
        greatRestaurant.addReviewAndRating("Peter Pan", "Tinkle Bell makes a better waffle", 2, greatRestaurant);
        greatRestaurant.addReviewAndRating("Peter Pan", "Tinkle Bell makes a better waffle", 2, greatRestaurant);
        greatRestaurant.addReviewAndRating("Peter Pan", "Tinkle Bell makes a better waffle", 2, greatRestaurant);
        greatRestaurant.addReviewAndRating("Peter Pan", "Tinkle Bell makes a better waffle", 2, greatRestaurant);

        assertEquals(
                "Should have 1 star, which is what the first two unique reviews produce.",
                "The restaurant Great Restaurant has a price category of 4 and has an average of 1.0 stars",
                greatRestaurant.toString()
        );
    }

    @Test
    public void testPriceCategory() {
        greatRestaurant.setPriceCategory(5);
        assertEquals(
                "Should have a price category of 5",
                5,
                greatRestaurant.priceCategory
        );
    }
}