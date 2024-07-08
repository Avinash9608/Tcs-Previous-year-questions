package RachitSirCoding;

import java.util.Arrays;
import java.util.Scanner;

public class ZeroOneTwoArray {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=kb.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter array in element ");
        for (int i=0;i<size;i++)
        {
            arr[i]=kb.nextInt();
        }
        Arrays.sort(arr);
        for (int x:arr)
            System.out.print(x+" ");
    }
}
