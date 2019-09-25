package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {
    Theater happyNightsTheater;
    Theater megaBoxOffice;

    @Before
    public void setup() {
        happyNightsTheater = new Theater(
                "Happy Nights Theater"
        );

        megaBoxOffice = new Theater(
                "Mega Box Office Hits"
        );
    }

        // check functionality of shop constructor
        @Test
        public void testShopConstructor() {
            assertEquals("Mega Box Office Hits",
                    megaBoxOffice.name);
        }
}