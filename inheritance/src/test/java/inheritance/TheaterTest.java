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

    // add a movie to empty list
    @Test
    public void testAddMovie1() {
        happyNightsTheater.addMovie("Cloudy Days");
        assertEquals(
                "movie list should have the movie, Cloudy Days, in it",
                "The theater Happy Nights Theater is showing these movies: [Cloudy Days].",
                happyNightsTheater.toString());
    }

    // add two movies to list
    @Test
    public void testAddMovie2() {
        happyNightsTheater.addMovie("Cloudy Days");
        happyNightsTheater.addMovie("Abracadabra");
        assertEquals(
                "movie list should have the movies, Cloudy Days and Abracadabra, in it",
                "The theater Happy Nights Theater is showing these movies: [Cloudy Days, Abracadabra].",
                happyNightsTheater.toString());
    }

    // remove last movie from the list
    @Test
    public void testRemoveMovie1() {
        happyNightsTheater.addMovie("Cloudy Days");
        happyNightsTheater.addMovie("Abracadabra");
        happyNightsTheater.removeMovie("Abracadabra");
        assertEquals(
                "only one movie should be left in the list - Cloudy Days",
                "The theater Happy Nights Theater is showing these movies: [Cloudy Days].",
                happyNightsTheater.toString()
        );
    }

    // remove last movie from the list
    @Test
    public void testRemoveMovie2() {
        happyNightsTheater.addMovie("Cloudy Days");
        happyNightsTheater.addMovie("Abracadabra");
        happyNightsTheater.addMovie("Happy Leaves");
        happyNightsTheater.removeMovie("Abracadabra");
        assertEquals(
                "Two movies should be left in the list",
                "The theater Happy Nights Theater is showing these movies: [Cloudy Days, Happy Leaves].",
                happyNightsTheater.toString()
        );
    }

}