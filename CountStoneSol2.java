package RachitSirCoding;

import java.util.HashMap;
import java.util.Scanner;

public class CountStoneSol2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter metal: ");
        String metal = kb.next().toLowerCase();
        System.out.println("Enter stone: ");
        String stone = kb.next().toLowerCase();
        int count = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < metal.length(); i++) {
            freq.put(metal.charAt(i), freq.getOrDefault(metal.charAt(i), 0) + 1);
        }
        for (char ch : stone.toCharArray()) {
            if (freq.containsKey(ch))
                count += freq.get(ch);
        }
        System.out.println("Result: " + count);
    }
}
