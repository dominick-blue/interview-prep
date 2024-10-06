package week1;

import java.util.HashMap;

public class SolutionValidAnagram
{
    private static HashMap<Character, Integer> charCount(String s)
    {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray())
        {
            if (!map.containsKey(c))
            {
                map.put(c, 0);
            }
            map.put(c, map.get(c) + 1);
        }

        return map;
    }

    public boolean isAnagram(String s, String t)
    {
        return charCount(s).equals(charCount(t));
    }


}
