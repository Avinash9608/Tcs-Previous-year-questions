package RachitSirCoding;

import java.util.Scanner;

public class Sept2021Sep13 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=kb.nextInt();
        Integer[] arr=new Integer[size];
        System.out.println("Enter elements in array (Binary Form 0/1)");
        for(int i=0;i<size;i++)
        {
            arr[i]=kb.nextInt();
        }
//        int count=0;
//        for (int i=0;i<size;i++)
//        {
//            for (int j=0;j<size;j++)
//            {
//                if(arr[i]==0)
//                {
//                    if(arr[j]==1 && (i<j))
//                        count++;
//                }
//            }
//        }
//        System.out.println(count);
        int northBiker=0;
        int southBiker=0;
        for (int i=0;i<size;i++)
        {
            if(arr[i]==0)
                northBiker++;
            else
                southBiker+=northBiker;
        }
        System.out.println(southBiker);
    }
}
