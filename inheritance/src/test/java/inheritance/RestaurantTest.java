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

    // To DO: constructor checker
//    @Test
//    public void testRestaurantConstructor() {
//        assertEquals(0, seattleFish.name);
//    }

    // Check that restaurant has a toString working
    @Test
    public void testRestaurant() {
        System.out.println(seattleFish.toString());
    }

    // Check if a node is inserted to head of list, and print it out as a string
    @Test
    public void testInsertNodeAtBeginningOfList() {
        seattleFish.insertNodeToHeadOfList(new Review("James", "Nom Shack is better", 1));
        System.out.println(seattleFish.head.data.toString());
    }

    // Check if the method adds review to head of list
    @Test
    public void testAddReviewToHead() {
        seattleFish.addReviewToHead("Razzle", "Fish is always great", 5);
        System.out.println(seattleFish.head.data.toString());
    }

    // Check if method adds multiple reviews to list, each succeeding one to the head.
    @Test
    public void testAddTwoReviewsToHead() {
        seattleFish.addReviewToHead("Razzle", "Fish is always great", 5);
        seattleFish.addReviewToHead("Tom", "I like their breakfast", 4);
        System.out.println(seattleFish.head.data.toString());
        System.out.println(seattleFish.head.next.data.toString());
    }

    // Check that stars in constructor function are updated with new average, once reviews are added
    @Test
    public void testAddUpStarsAndGetRestaurantAverage() {
        seattleFish.addReviewToHead("Razzle", "Fish is always great", 3);
        seattleFish.addReviewToHead("Tom", "I like their breakfast", 3);
        seattleFish.addReviewToHead("Petra", "The cod is good", 3);
        seattleFish.addUpStarsAndGetRestaurantAverage();
        System.out.println(seattleFish.toString());
    }

    // Check that error message returns if method that calculates average used when there are no reviews added


} // end RestaurantTestClass