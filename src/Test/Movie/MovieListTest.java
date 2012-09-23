package Movie;

import Main.Movie.Movie;
import Main.Movie.MovieList;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItem;

public class MovieListTest {

    @Test
    public void should_add_default_movies_when_init_the_movieList() {
        Movie movie = new Movie("I'm DingYue", "Ding Yue", "N/A");
        MovieList movieList = new MovieList();
        assertThat(movieList.movies, hasItem(movie));
    }
}

