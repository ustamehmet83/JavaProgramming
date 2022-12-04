package day31_Constructors.Tasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country,title,genre,releaseDate,director,cast;
    public ArrayList<String>casts;

    public Movie(String country, String title, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
        casts = new ArrayList<>();
    }
    
    public void addCast(String cast){
        casts.add(cast);
    }


    public void addCasts(String [] cast){
            casts.addAll(Arrays.asList(cast));
    }
    
    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", casts=" + casts.size() +
                '}';
    }
}
