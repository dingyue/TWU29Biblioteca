package movie;

import main.movie.Movie;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MovieTest {
    @Test
    public void should_return_movie_information() {
        Movie movie = new Movie("Sholay", "Ramesh Sippy", "N/A");
        assertThat(movie.getName(), is("Sholay"));
        assertThat(movie.getDirector(), is("Ramesh Sippy"));
        assertThat(movie.getRating(), is("N/A"));
    }

    @Test
    public void should_get_accurate_movie_name() {
        Movie movie = new Movie("Sholay", "Ramesh Sippy", "N/A");
        assertThat(movie.getName(), is("Sholay"));
    }

    @Test
    public void should_get_accurate_movie_director() {
        Movie movie = new Movie("Sholay", "Ramesh Sippy", "N/A");
        assertThat(movie.getDirector(), is("Ramesh Sippy"));
    }

    @Test
    public void should_get_accurate_movie_rating() {
        Movie movie = new Movie("Sholay", "Ramesh Sippy", "N/A");
        assertThat(movie.getRating(), is("N/A"));
    }

    @Test
    public void testToString() {
        Movie movie = new Movie("Sholay", "Ramesh Sippy", "N/A");

        assertThat(movie.toString(), is("movie{" +
                "name='" + "Sholay" + '\'' +
                ", director='" + "Ramesh Sippy" + '\'' +
                ", rating='" + "N/A" + '\'' +
                '}'));
    }

    @Test
    public void testEquals() {

        Movie movie1 = new Movie("movie1", "director1", "1");
        Movie movie2 = new Movie("movie1", "director1", "1");
        Movie movie3 = new Movie("movie1", "director3", "1");
        Movie movie4 = new Movie("movie4", "director1", "1");
        Movie movie5 = new Movie("movie4", "director1", "5");
        assertThat(movie1.equals(movie2), is(true));
        assertThat(movie1.equals(movie4), is(false));
        assertThat(movie1.equals(movie3), is(false));
        assertThat(movie4.equals(movie5), is(false));
    }
}
