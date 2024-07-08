package RachitSirCoding;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=kb.nextInt();
        System.out.println("Enter value of k");
        int k=kb.nextInt();
        System.out.println("Enter elemnts in array ");
        int[] array=new int[size];
        for (int i=0;i<size;i++)
        {
            array[i]=kb.nextInt();
        }
        Arrays.sort(array);
        int start=0;
        int end=size-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(array[mid]==k) {
                System.out.print("Found at index " + (mid + 1));
                break;
            }
            else if(array[mid]<k)
                start=mid+1;
            else
                end=mid-1;
        }
        if(start>end)
            System.out.println("not found");
    }
}
