package week1;

import java.util.*;

public class SolutionGroupAnagrams
{
    // Brute Force Solution

//    public List<List<String>> groupAnagrams(String[] strs)
//    {
//        Map<String, List<String>> res = new HashMap<>();
//
//        for (String s : strs)
//        {
//            int[] count = new int[26];
//
//            for (char c : s.toCharArray())
//            {
//                count[c - 'a']++;
//            }
//
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < 26; i++)
//            {
//                sb.append('#');
//                sb.append(count[i]);
//            }
//            String key = sb.toString();
//
//            if (!res.containsKey(key))
//            {
//                res.put(key, new ArrayList<>());
//            }
//            res.get(key).add(s);
//        }
//
//        return new ArrayList<>(res.values());
//    }

    // Optimal Solution O(m * n)

    /*
    * Approach
    *
    * 1. Create a map (k, v) where the keys are a string and the values are a list of strings
    * 2. Create a for loop to iterate over each word string in the list of strings
    * 3. For each string, create a char list, the sort that list, then create a new String object with that list of sorted chars
    * 4. Use the locate and update pattern by checking to see if a sorted word is not in the map. If it is not, add it along with a new
    * array list.
    * 5. Get the sorted word key and add the word into its list value
    * 6. Once complete with the loop, return the map.
    * */
    public List<List<String>> groupAnagrams(String[] strs)
    {
        Map<String, List<String>> map = new HashMap<>();

    for (String word : strs)
        {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord))
            {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
