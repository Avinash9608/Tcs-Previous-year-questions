package RachitSirCoding;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter deciaml number ");
        int decNo=kb.nextInt();
        Stack<Integer> binaryStack=new Stack<>();
        while (decNo>0)
        {
            int rem=decNo%2;
            binaryStack.push(rem);
            decNo/=2;
        }
        StringBuilder sb=new StringBuilder();
       while (!binaryStack.empty())
       {
           sb.append(binaryStack.pop());
       }
        System.out.println(sb.toString());
    }
}


//import java.util.*;
//public class Main
//{
//    public static void main(String[] args) {
//        Scanner kb=new Scanner(System.in);
//        System.out.println("Enter deciaml number ");
//        int decNo=kb.nextInt();
//        int[] binaryArray=new int[32];
//        int i=0;
//        while(decNo>0)
//        {
//            binaryArray[i]=decNo%2;
//            i++;
//            decNo/=2;
//        }
//        for(int index=i-1;index>=0;index--)
//        {
//            System.out.print(binaryArray[index]+" ");
//        }
//    }
//}