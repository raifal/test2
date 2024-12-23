package de.rainerfaller;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        // loop 10 times and print the loop counter
        for (int i = 0; i < 10; i++) {
        	System.out.println("i = " + i);
        }
        
        // create 10 test persons with birthdate
        for (int i = 0; i < 10; i++) {
        	Person p = new Person("Person " + i, LocalDate.of(2000 + i, i + 1, i + 1));
        	System.out.println(p);
        }
        
    }
}
