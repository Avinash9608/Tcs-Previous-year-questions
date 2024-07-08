package RachitSirCoding;

public class Panagram {
    public static void main(String[] args) {
        String[] array={"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy","dog"};
        int[] alphabetic=new int[26];
        for (String s:array)
        {
            for (int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                alphabetic[ch-'a']++;
            }
        }
        boolean result=true;
        for (int i=0;i<26;i++)
        {
            if(alphabetic[i]==0)
            {
                result=false;
                break;
            }
        }
        System.out.println(result);
    }
}
