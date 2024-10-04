package week1;

import java.util.Arrays;

public class ArraysExample
{
    public static void main(String[] args)
    {
        String[] array = new String[5];

        array[0] = "Dom";
        array[1] = "Jas";
        array[2] = "Wolf";
        array[3] = "Tanae";
        array[4] = "Trent";

        for (String name : array)
        {
            System.out.println(name);
        }

        // Find element at a given index

        System.out.println(array[4]);
    }
}
