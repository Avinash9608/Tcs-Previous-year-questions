package RachitSirCoding;

import java.util.Scanner;

public class Sep2021 {
    private static int findMaxSqrtAndRect(int x)
    {
        int tem=x/2;
        return (tem+1)*(x-tem+1);
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter N");
        int n=kb.nextInt();
        System.out.println(findMaxSqrtAndRect(n));
    }
}
