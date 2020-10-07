package com.sebastian;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> characters = new HashMap<>();
	    char[] string = args.length == 0 ? scanner.nextLine().toCharArray() : args[0].toCharArray();

	    for(char c : string) {
	        if (characters.containsKey(c)) {
	            characters.replace(c, characters.get(c)+1);
            } else { characters.put(c, 1); }
        }
	    characters.forEach((character, integer) -> System.out.println(character + ": " + integer));
    }
}
