package Movie;

import Main.Movie.Movie;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MovieTest {
    @Test
    public void should_return_movie_information(){
//        Movie movie = new Movie("Sholay","1975","Ramesh Sippy","N/A");
        Movie movie = new Movie("Sholay","Ramesh Sippy","N/A");
        assertThat(movie.getName(),is("Sholay"));
        //assertThat(movie.getYear(),is("1975"));
        assertThat(movie.getDirector(),is("Ramesh Sippy"));
        assertThat(movie.getRating(),is("N/A"));
    }
}
