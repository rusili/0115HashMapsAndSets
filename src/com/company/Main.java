package com.company;

import java.util.*;

public class Main {
    private static Map<Integer, String> evenMap = new HashMap<>();

    public static void main(String[] args) {
        evenMap.put(2, "Two");
        evenMap.put(3, "Three");
        evenMap.put(22, "Twenty two");
        evenMap.put(31, "Thirty one");
        evenMap.put(1, "One");
        evenMap.put(15, "Fifteen");
        evenMap.put(2000, "Two thousand");
        evenMap.put(99, "Ninety nine");

        printEvenValues(evenMap);
    }

    // Prompt: Given a Hashmap, if an Integer typed key is divisible by 2, print out its value
    private static void printEvenValues(Map<Integer, String> inputMap) {
        for (int key : inputMap.keySet()) {             // Iterate through the Set of keys
            if (key % 2 == 0) {                         // If key is divisible by 2,
                System.out.println(inputMap.get(key));  // Print out its value
            }
        }

        for (String value : inputMap.values()){         // Iterate through the collection of values
            // Do stuff
        }
    }
}
