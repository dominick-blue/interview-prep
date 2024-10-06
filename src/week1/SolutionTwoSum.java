package week1;

import java.util.HashMap;

public class SolutionTwoSum
{
    public static int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            int number = nums[i];
            int difference = target - number;

            if (map.containsKey(difference))
            {
                return new int[] {map.get(difference), i};
            }
            map.put(number, i);
        }
        return new int[] {};
    }

    public static void main(String[] args)
    {
        int[] nums = {2,7,11,15};

        int target = 9;

        System.out.println(twoSum(nums, target));

    }
}
