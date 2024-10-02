package week1;

import java.util.HashMap;
import java.util.Map;

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

        map.remove("Dom");

        System.out.println(map.containsKey("Dom"));

        System.out.println("Is Map Clear? : " + map.isEmpty());


        /**/

        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + "\nValue: " + value);
        }



    }

}
