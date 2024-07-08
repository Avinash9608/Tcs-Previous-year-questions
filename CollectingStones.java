package RachitSirCoding;

import java.util.Scanner;

public class CollectingStones {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter stone ");
        String metal=kb.next().toLowerCase();
        System.out.println("Enter stone");
        String stone=kb.next().toLowerCase();
        int count=0;
        for (int i=0;i<metal.length();i++)
        {
            for (int j=0;j<stone.length();j++)
            {
                char ch1=stone.charAt(j);
                char ch2=metal.charAt(i);
                if(ch1==ch2)
                    count++;
            }
        }
        System.out.println(count);
    }
}
