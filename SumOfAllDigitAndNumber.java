package RachitSirCoding;


import java.util.Scanner;

public class SumOfAllDigitAndNumber {
    private static int sumOfAllNumers(String recived )
    {
        int sum=0;
        for (int i=0;i<recived.length();i++)
        {
            for (int j=i+1;j<=recived.length();j++)
            {
                String subStr=recived.substring(i,j);
                sum+=Integer.parseInt(subStr);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter input as a String ");
        String input=kb.next();

        int res=sumOfAllNumers(input);
        System.out.println(res);
    }
}
