package sample.classes;

import org.json.simple.JSONArray;
import org.junit.jupiter.api.Test;
import sample.screens.Suggestions;

import static org.junit.jupiter.api.Assertions.*;

class SearchFieldsMethodsTest {
    private SearchFieldsMethods search;


    @Test
    void calculateRating() {
        SearchFieldsMethods test = new SearchFieldsMethods();
        test.calculateRating("5");
    }

    @Test
    void calculateActor() {
        SearchFieldsMethods test = new SearchFieldsMethods();
        test.calculateActor("Brad");
    }

    @Test
    void calculateYear() {
        SearchFieldsMethods test = new SearchFieldsMethods();
        test.calculateYear("2001");
    }

    @Test
    void calculateGenreAndRating() {
        SearchFieldsMethods test = new SearchFieldsMethods();
        test.calculateGenreAndRating("Action", "5");
    }

    @Test
    void calculateGenreAndYear() {
        SearchFieldsMethods test = new SearchFieldsMethods();
        test.calculateGenreAndYear("Action", "2001");
    }

    @Test
    void calculateGenreAndActor() {
        SearchFieldsMethods test = new SearchFieldsMethods();
        test.calculateGenreAndActor("Action", "Brad");
    }

    @Test
    void calculateYearAndActor() {
        SearchFieldsMethods test = new SearchFieldsMethods();
        test.calculateYearAndActor("2001", "Brad");
    }

    @Test
    void calculateYearAndRating() {
        SearchFieldsMethods test = new SearchFieldsMethods();
        test.calculateYearAndActor("2001", "8");
    }

    @Test
    void calculateActorAndRating() {
        SearchFieldsMethods test = new SearchFieldsMethods();
        test.calculateActorAndRating("2000", "Brad");
    }

    @Test
    void calculateActorYearRating() {
        SearchFieldsMethods test = new SearchFieldsMethods();
        test.calculateActorYearRating("Jonah", "2003", "6");
    }

    @Test
    void calculateGenreYearRating() {
        SearchFieldsMethods test = new SearchFieldsMethods();
        test.calculateGenreYearRating("Jonah", "2003", "6");
    }

    @Test
    void calculateGenreActorRating() {
        SearchFieldsMethods test = new SearchFieldsMethods();
        test.calculateGenreActorRating("Drama", "Liam", "6");
    }

    @Test
    void calculateGenreYearActor() {
        SearchFieldsMethods test = new SearchFieldsMethods();
        test.calculateGenreYearActor("Science-Fiction", "2003", "6");
    }

    @Test
    void calculateGenreYearActorRating() {
        SearchFieldsMethods test = new SearchFieldsMethods();
        test.calculateGenreYearActorRating("Jonah", "2003", "Brad" ,"8");
    }
}