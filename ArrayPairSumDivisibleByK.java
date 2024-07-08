package RachitSirCoding;

import java.util.Scanner;

public class ArrayPairSumDivisibleByK {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter (even)size of array ");
        int size=kb.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter element in array");
        for (int i=0;i<size;i++)
        {
            arr[i]= kb.nextInt();
        }
        System.out.println("Entered element are ");
        for (int x:arr)
            System.out.print(x+" ");
        System.out.println("Enter value of k ");
        int k=kb.nextInt();
        boolean result=true;
        for (int i=0;i<size/2;i++)
        {
            int sum=arr[i]+arr[size-1-i];
            if(sum%k!=0){
                result=false;
                break;
            }
        }
        System.out.println("Result-"+result);
    }
}
