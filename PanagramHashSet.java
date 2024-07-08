package RachitSirCoding;

import java.util.HashSet;

public class PanagramHashSet {
    public static void main(String[] args) {
        String[] array={"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy","dog"};
        HashSet<Character> map=new HashSet<>();
        for (String s:array)
        {
            for (int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
               map.add(ch);
            }
        }
       if(map.size()==26)
           System.out.println("true");
       else
           System.out.println("false");
    }
}
