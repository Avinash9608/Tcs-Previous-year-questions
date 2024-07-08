package RachitSirCoding;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args) {
        int[] array = {1};
        LinkedHashMap<Integer, Integer> freq = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {
            freq.put(array[i], freq.getOrDefault(array[i], 0) + 1);
        }
        int fristNonRepeating = 0;
        if (freq.size() == 1 ) {
            fristNonRepeating = 0;
        } else {

            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                if (entry.getValue() % 2 != 0) {
                    fristNonRepeating = entry.getKey();
                    break;
                }
            }
        }

            System.out.println(fristNonRepeating);

    }
}
