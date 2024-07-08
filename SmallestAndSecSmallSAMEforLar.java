package RachitSirCoding;

import java.util.Scanner;

public class SmallestAndSecSmallSAMEforLar {
    private static int smallest(int[] arr)
    {
        int min=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]<min) {
                min2 = min;
                min = arr[i];
            }
            else if(arr[i]<min2 && arr[i]!=min)
            {
                min2=arr[i];
            }
        }
        System.out.println("sec smallest "+min2);
        return min;
    }
    private static int largest(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>max) {
                max2 = max;
                max = arr[i];
            }else if (arr[i]>max2 && arr[i]!=max)
            {
                max2=arr[i];
            }
        }
        System.out.println("sec max"+max2);
        return max;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=kb.nextInt();
        int[] array=new int[size];
        System.out.println("Enter elemnts in array ");
        for (int i=0;i<size;i++)
        {
            array[i]= kb.nextInt();
        }
        int result=smallest(array);
        System.out.println("smallest-"+result);
        int result2=largest(array);
        System.out.println("largest-"+result2);
    }
}
