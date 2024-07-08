package RachitSirCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sep2021C2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=kb.nextInt();
        Integer[] arr=new Integer[size];
        System.out.println("Enter elements in array ");
        for(int i=0;i<size;i++)
        {
            arr[i]=kb.nextInt();
        }
        Arrays.sort(arr, Comparator.reverseOrder());
        int sum=0;
        for (int i=0;i<size/2;i++)
        {
            sum+=(arr[i]-arr[size-i-1]);
        }
        System.out.println("sum "+sum);
    }
}
