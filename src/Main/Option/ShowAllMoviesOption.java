package main.option;

import main.ColorOutput;
import main.movie.Movie;
import main.movie.MovieList;
import main.user.User;

import java.awt.*;

public class ShowAllMoviesOption extends Option {
    private static final String MOVIES_INFO = "Below is the movielist:";

    public void showAllMovies() {
        int movieId = 1;
        for (Movie movie : MovieList.getMovieList()) {

            ColorOutput.println("<" + movieId + ">" + ":" + movie.getName() + " " + movie.getDirector() + " " + movie.getRating(), Color.RED, Color.BLACK);
            movieId++;
        }
    }

    @Override
    public boolean shouldExecute(int optNum) {
        return optNum == SHOW_All_MOVIES;
    }

    @Override
    public void execute(User currentUser) {
        ColorOutput.println(MOVIES_INFO, Color.CYAN, Color.BLACK);
        showAllMovies();
    }
}
