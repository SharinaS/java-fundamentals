package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    Shop trinketsYouDontNeed;
    Shop petSupplyWarehouse;

    @Before
    public void setup(){
        trinketsYouDontNeed = new Shop(
                "Trinkets You Don't Need",
                "A shop that sells random stuff for your house",
                3);
        petSupplyWarehouse = new Shop(
                "Pet Supply Warehouse",
                "Pet supplies for various types of pets",
                4);
    }

    // check functionality of shop constructor
    @Test
    public void testShopConstructor() {
        assertEquals(
                "Trinkets You Don't Need",
                trinketsYouDontNeed.name
                );
        assertEquals("Pet supplies for various types of pets",
                petSupplyWarehouse.description);
    }

    // Check that reviewer's name added to the review for the shop
    @Test
    public void testAddDataToReview1() {
        Review cliveReview = new Review("Clive", "This place has everything", 4);
        petSupplyWarehouse.addReview(cliveReview);
        assertEquals(
                "Review's name should be Clive",
                "Clive",
                petSupplyWarehouse.reviews.get(0).author
        );
        //System.out.println(petSupplyWarehouse.reviews.get(0).author);
    }

    @Test
    public void testAddDataToReview2() {
        Review cliveReview = new Review("Clive", "This place has everything", 4);
        petSupplyWarehouse.addReview(cliveReview);
        assertEquals(
                "Review's review should be a string",
                "This place has everything",
                petSupplyWarehouse.reviews.get(0).review
        );
        System.out.println(petSupplyWarehouse.reviews.get(0).review);
    }

    @Test
    public void testShopToStringMethod() {
        System.out.println(trinketsYouDontNeed.toString());
    }

}