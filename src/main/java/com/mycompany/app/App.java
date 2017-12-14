package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		Console c=System.console();
		String n=c.readLine();
		System.out.println("Welcome "+n);
    }
}
