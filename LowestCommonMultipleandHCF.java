package RachitSirCoding;

import java.util.Scanner;

public class LowestCommonMultipleandHCF {
    private static int hcf(int x, int y)
    {
        if(x==0)
            return y;
        return hcf(y%x, x);
    }

    private static int lcm(int x, int y)
    {
        return (x/hcf(x,y))*y;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a and B");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int resulthcf=hcf(a,b);
        System.out.println("Result of HCF-"+resulthcf);
        int resultlcm=lcm(a,b);
        System.out.println("Result of LCM-"+resultlcm);
    }
}
