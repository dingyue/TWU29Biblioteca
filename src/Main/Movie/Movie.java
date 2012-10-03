package main.movie;

public class Movie {
    private String name;
    private String director;
    private String rating;

    public Movie(String name, String director, String rating) {
        this.name = name;
        this.director = director;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

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

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (director != null ? director.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "movie{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
