package RachitSirCoding;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumberFormed {
    private static void reverseDigit(char[] digit)
    {
        int start=0;
        int end=digit.length-1;
        while (start<end)
        {
            char temp=digit[start];
            digit[start]=digit[end];
            digit[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your number ");
        int input=kb.nextInt();
        String strinput=Integer.toString(input);
        char[] digits=strinput.toCharArray();
        Arrays.sort(digits);
        reverseDigit(digits);
        String res=new String(digits);
        System.out.println(res);
    }
}
