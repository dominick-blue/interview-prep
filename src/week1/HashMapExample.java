package week1;

import java.util.HashMap;
public class HashMapExample
{

    public static HashMap<Character, Integer> charCount(String s)
    {
        HashMap<Character, Integer> count = new HashMap<>();



        return count;
    }

    public static char mostFrequentCharacter(String s1)
    {
        HashMap<Character, Integer> count = new HashMap<>();
        char mostFrequent = '\0';

        for (char c : s1.toCharArray())
        {
            if (mostFrequent == '\0')
        }



        return mostFrequent;
    }

    public static void main(String[] args)
    {

        String s1 = "mississippi";

        System.out.println("Most frequent char: " + mostFrequentCharacter(s1));

    }
}