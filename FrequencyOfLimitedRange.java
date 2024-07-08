package RachitSirCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfLimitedRange {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=kb.nextInt();
        System.out.println("Enter value of p");
        int p=kb.nextInt();
        System.out.println("Enter value within range of p");
        int[] array=new int[size];
        for (int i=0;i<size;i++)
        {
            array[i]=kb.nextInt();
        }
        Map<Integer,Integer> freq=new HashMap<>();
        for (int i=0;i<size;i++)
        {
            freq.put(array[i],freq.getOrDefault(array[i],0)+1);
        }
        for (int i=1;i<=p;i++)
        {
            if(!freq.containsKey(i))
            {
                freq.put(i,0);
            }
        }
        for(Map.Entry<Integer,Integer> entry:freq.entrySet())
        {
            System.out.print(entry.getValue()+" ");
        }
    }
}
