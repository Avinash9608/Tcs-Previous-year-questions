package RachitSirCoding;

import java.util.Scanner;

public class PalindromInSentance {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your complete sentence ");
        String input= kb.nextLine().toLowerCase();
        input=input.replaceAll("[^a-zA-Z0-9]","");
        boolean result=true;
        for(int i=0;i<input.length()/2;i++)
        {
            if(input.charAt(i)!=input.charAt(input.length()-i-1))
            {
                result=false;
                break;
            }
        }
        System.out.println(input);
        System.out.println("Palindrom "+result);
    }
}
