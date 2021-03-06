package com.hashedin;

import java.io.IOException;
import java.util.Map;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     * @throws IOException 
     */
    public void testApp() throws IOException
    {
    	MovieManager mg = new MovieManager();
		Map<String, Movie> movieMap = mg.getMovies(mg.getClass().getClassLoader().getResourceAsStream("movies_test"));
        assertEquals(movieMap.size(),6);
        
        Map<Integer,Genre> genmap=mg.getGenre(mg.getClass().getClassLoader().getResourceAsStream("genre.data"));
        assertEquals(genmap.size(),19);     
    }
    
}
