package day31_Constructors.Tasks;

import day31_Constructors.Tasks.Movie;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieObject {
    public static void main(String[] args) {
        Movie movie1= new Movie("ABD","Journey to SDET:Cydeo Batch 25","10/25/2021","Kuzzat Altay");
        movie1.casts=new ArrayList<>(Arrays.asList("Asiya","Adam","Muhtar"));
        String [] cast={"Ahmet","Mehmet"};
        movie1.addCasts(cast);
        System.out.println(movie1.casts);
    }

}
