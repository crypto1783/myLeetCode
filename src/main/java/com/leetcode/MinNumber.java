package com.leetcode;
import java.util.Arrays;
import java.util.Comparator;

public class MinNumber {

    public static void main(String[] args) {
        MinNumber mn = new MinNumber();
        int[] aa = {10, 2};

        System.out.println(mn.minNumber(aa));
    }

    public String minNumber(int[] nums) {

        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            strs[i] = String.valueOf(nums[i]);
        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));
        StringBuilder res = new StringBuilder();
        for (String s : strs)
            res.append(s);
        return res.toString();
    }

}

class StringCompare implements Comparator<String>
{

    @Override
    public int compare(String o1, String o2) {
        return 0;
    }
}