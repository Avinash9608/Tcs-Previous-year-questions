package RachitSirCoding;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumberFormed2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your number ");
        int input=kb.nextInt();
        String inputStr=Integer.toString(input);
        char[] arr=inputStr.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb=new StringBuilder(new String(arr));
        sb.reverse();
//        System.out.println(sb);
        int res=Integer.parseInt(sb.toString());
        System.out.println(res);

    }

}
