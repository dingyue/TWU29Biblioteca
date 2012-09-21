package Main.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieList {
    public static List<Movie> movies;

    //    public static void initMovieList() {
//        movies = new ArrayList<Movie>();
//        movies.add(new Movie("I'm DingYue", "Ding Yue", "N/A"));
//    }
    public MovieList() {
        movies = new ArrayList<Movie>();
        movies.add(new Movie("I'm DingYue", "Ding Yue", "N/A"));
        movies.add(new Movie("movie2", "name2", "1"));
        movies.add(new Movie("movie3", "name3", "4"));
        movies.add(new Movie("movie4", "name4", "2"));
        movies.add(new Movie("movie5", "name5", "6"));
        movies.add(new Movie("movie6", "name6", "8"));
        movies.add(new Movie("movie7", "name7", "9"));
        movies.add(new Movie("movie8", "name8", "1"));
        movies.add(new Movie("movie9", "name9", "7"));
        movies.add(new Movie("movie10", "name10", "0"));
        movies.add(new Movie("movie11", "name11", "6"));
        movies.add(new Movie("movie12", "name12", "3"));
        movies.add(new Movie("movie13", "name13", "5"));
        movies.add(new Movie("movie14", "name14", "3"));
        movies.add(new Movie("movie15", "name15", "3"));

    }


//    public static String getAllMovies() {
//        //List<Movie> movies = new ArrayList<Movie>();
//        StringBuffer movieList = new StringBuffer();
//        for (Movie movie : movies) {
//            movieList.append(movie.toString() + "\n");
//        }
//
//        return movieList.toString();
//    }

    public static List<Movie> getMovieList() {
        return new MovieList().movies;
    }


}
