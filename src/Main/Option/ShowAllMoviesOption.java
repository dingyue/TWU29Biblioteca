package Main.Option;

import Main.ColorOutput;
import Main.Movie.Movie;
import Main.Movie.MovieList;
import Main.User.User;

import java.awt.*;

public class ShowAllMoviesOption extends Option{

    public void showAllMovies(){
        int movieId = 1;
        for(Movie movie : MovieList.getMovieList()) {

            ColorOutput.println("<" + movieId +">" + ":" +movie.getName()+ " "+ movie.getDirector() + " "+ movie.getRating(),Color.RED,Color.BLACK);
            movieId++;
        }
    }
    @Override
    public void execute(User currentUser) {
        ColorOutput.println("Below is the movielist:", Color.CYAN, Color.BLACK);
        showAllMovies();
    }
}
