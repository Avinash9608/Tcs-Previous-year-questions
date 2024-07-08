package RachitSirCoding;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter binary ");
        String input=kb.next();
        int decimal=Integer.parseInt(input,2);
        System.out.println("Decimal from of given input- "+decimal);
    }
}

//import java.util.*;
//public class Main
//{
//    public static void main(String[] args) {
//        Scanner kb=new Scanner(System.in);
//        System.out.println("Enter binary ");
//        int input=kb.nextInt();
//        String s=Integer.toString(input);
//        int decimal=Integer.parseInt(s,2);
//        System.out.println("Decimal from of given input- "+decimal);
//    }
//}
