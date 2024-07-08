package RachitSirCoding;

import java.util.Scanner;

public class MagicalArrayVille {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=kb.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements in array ");
        for(int i=0;i<size;i++)
        {
            arr[i]=kb.nextInt();
        }
        boolean result=true;
        for (int i=0;i<size;i++)
        {
            if(arr[i]!=i*i) {
                result = false;
                break;
            }
        }
        if(result==true)
            System.out.println("1");
        else System.out.println("-1");
    }
}
