package RachitSirCoding;

import java.util.Scanner;

public class FlowerBed {
    private static boolean canPlaceFlower(int[] arr, int n)
    {
        int size= arr.length;

        for (int i=0;i<size;i++)
        {
            if(n==0)
                return true;
            if(arr[i]==0)
            {
                int prev=0;
                if(i>0)
                {
                    prev=arr[i-1];
                }

                int next=0;
                if(i<size-1)
                {
                    next=arr[i+1];
                }

                if(prev==0 && next==0)
                {
                    arr[i]=1;
                    n--;
                }
            }

        }
        return n<=0;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=kb.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter element in array ");
        for (int i=0;i<size;i++)
        {
            arr[i]=kb.nextInt();
        }
        System.out.println("Number of flower plant in flowerbed ");
        int flower=kb.nextInt();
        System.out.println(canPlaceFlower(arr,flower));

    }
}
