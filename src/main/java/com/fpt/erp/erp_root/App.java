package com.fpt.erp.erp_root;

import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Stream<Integer> stream = Stream.of(1, 2, 4);
        stream.forEach(System.out::println);
    }
}
