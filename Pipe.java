package RachitSirCoding;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Pipe {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter incoming pipe size");
        int insize=kb.nextInt();
        int[] incoming=new int[insize];
        System.out.println("Enter incoming values ");
        for (int i=0;i<insize;i++)
        {
            incoming[i]=kb.nextInt();
        }
        System.out.println("Enter outgoing pipe size");
        int outsize=kb.nextInt();
        System.out.println("Enter outgoing values ");
        int[] outgoing=new int[outsize];
        for (int i=0;i<outsize;i++)
        {
            outgoing[i]=kb.nextInt();
        }
        System.out.println("Enter rust factor ");
        int rustfactor=kb.nextInt();
        int sumIncome= IntStream.of(incoming).sum();
        int sumOutcom=IntStream.of(outgoing).sum();
        if(rustfactor!=0)
        {
            sumIncome=sumIncome+rustfactor;
        }
        int diff=sumOutcom-sumIncome;
        if(diff==0)
            System.out.println("BALANCED");
        else
        System.out.println(diff);
    }
}
