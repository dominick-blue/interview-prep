package week1;

import java.util.HashMap;

public class HashMapExample
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Jasmine", 31);
        map.put("Wolf", 1);
        map.put("Dom", 34);

        // Returns Key

        System.out.println(map.get("Jasmine"));

        // Returns Boolean

        System.out.println(map.containsKey("Wolf"));

    }

}
