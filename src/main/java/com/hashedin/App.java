package com.hashedin;

import java.io.IOException;

/**
 * Main Class
 *
 */
public class App 
{
    
    	public static void main(String[] args) throws IOException {
    		MovieManager mg = new MovieManager();
    		mg.getMovies(mg.getClass().getClassLoader().getResourceAsStream("movie.data"));
    	//	Map<String, MovieRatings> movieRMap =mg.getClass().getClassLoader().getResourceAsStream("ratings.data"));
    	//	mg.getMostActiveUser();
    		//mg.getmostRatedMovie();
    		mg.getGenre(mg.getClass().getClassLoader().getResourceAsStream("genre.data"));
    		mg.getmostRatedMovie(mg.getClass().getClassLoader().getResourceAsStream("ratings.data"));
    		mg.getMostActiveUser(mg.getClass().getClassLoader().getResourceAsStream("ratings.data"));
    	}
    }

