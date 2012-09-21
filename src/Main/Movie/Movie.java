package Main.Movie;

public class Movie {
    private String name;
//    private String year;
    private String director;
    private String rating;

//    public Movie(String name, String year, String director, String rating) {
//        this.name = name;
//        this.year = year;
//        this.director = director;
//        this.rating = rating;
//    }

    public Movie(String name, String director, String rating) {
        this.name = name;
        this.director = director;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

//    public String getYear() {
//        return year;
//    }

    public String getDirector() {
        return director;
    }

    public String getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        if (director != null ? !director.equals(movie.director) : movie.director != null) return false;
        if (name != null ? !name.equals(movie.name) : movie.name != null) return false;
        if (rating != null ? !rating.equals(movie.rating) : movie.rating != null) return false;
       // if (year != null ? !year.equals(movie.year) : movie.year != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        //result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (director != null ? director.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                //", year='" + year + '\'' +
                ", director='" + director + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
