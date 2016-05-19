package com.Favre;

import java.util.ArrayList;

/**
 * Created by user on 5/19/16.
 */
public class HelloWorld {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();

        /*won't run this: does not recognize these are Strings
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        String name = names.get(0);
        */

        //correct with casting:

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        String name = (String) names.get(0);
    }
}
