package RachitSirCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=kb.nextInt();
        int[] array=new int[size];
        System.out.println("Enter elemnts in array ");
        for (int i=0;i<size;i++)
        {
            array[i]= kb.nextInt();
        }
        Arrays.sort(array);
        ArrayList<Integer> realStore=new ArrayList<>();
        realStore.add(array[0]);
        for (int i=0;i<size-1;i++)
        {
            if(array[i]!=array[i+1])
            {
                realStore.add(array[i+1]);
            }
        }
        int[] res=new int[realStore.size()];
        for(int i=0;i<res.length;i++)
        {
            res[i]=realStore.get(i);
        }
        System.out.println(realStore);
        for (int x:res)
            System.out.print(x+" ");
    }
}
