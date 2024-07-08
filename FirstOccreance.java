package RachitSirCoding;

import java.util.Scanner;

public class FirstOccreance {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=kb.nextInt();
        System.out.println("Enter value K");
        int k=kb.nextInt();
        System.out.println("Enter elemnts in array ");
        int[] array=new int[size];
        for (int i=0;i<size;i++)
        {
            array[i]=kb.nextInt();
        }
        int index=-1;
        for (int i=0;i<size;i++)
        {
            if(array[i]==k)
            {
                index=i+1;
                break;
            }
        }
        System.out.println(index);
    }
}
