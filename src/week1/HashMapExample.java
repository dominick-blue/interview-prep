package week1;

import java.util.HashMap;


//public class HashMapExample
//{
//
//    private static HashMap<Character, Integer> charCount(String s)
//    {
//        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
//
//        for (char c : s.toCharArray())
//        {
//            if (count.get(c) == null)
//            {
//                count.put(c, 0);
//            }
//
//            count.put(c, count.get(c) + 1);
//        }
//
//        return count;
//    }
//
//
//    public static boolean anagrams(String s1, String s2)
//    {
//        return charCount(s1).equals(charCount(s2));
//    }
//
//    public static void main(String[] args)
//    {
//        String s1 = "dominick";
//        String s2 = "dominique";
//
//        System.out.println(anagrams(s1, s2));
//    }
//}

public class HashMapExample
{

    public static HashMap<Character, Integer> charCount(String s)
    {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();

        for (char c : s.toCharArray())
        {
            if (count.get(c) == null)
            {
                count.put(c, 0);
            }

            count.put(c, count.get(c) + 1);
        }

        return count;
    }

    public static boolean anagrams(String s1, String s2)
    {
        return charCount(s1).equals(charCount(s2));
    }

    public static void main(String[] args)
    {
        String s1 = "Justin";
        String s2 = "Dustin";

        System.out.println(anagrams(s1, s2));
    }
}