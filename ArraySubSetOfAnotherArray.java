package RachitSirCoding;

import java.util.HashMap;
import java.util.Map;

public class ArraySubSetOfAnotherArray {
    public static void main(String[] args) {
        int[] arr1 = {10,5,2,23,19};
        int[] arr2 = {19,5,3};
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0) + 1);
        }
        boolean result = true;
        for (int i = 0; i < arr2.length; i++) {
            if (!freq.containsKey(arr2[i])) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}