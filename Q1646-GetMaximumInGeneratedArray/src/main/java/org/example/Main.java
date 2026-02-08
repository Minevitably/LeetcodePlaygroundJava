package org.example;

import java.util.Arrays;

class Solution {
    public int getMaximumGenerated(int n) {
        int maxVal = -1;
        int[] nums = new int[n + 1];
        Arrays.fill(nums, 0);

        if (n == 0 || n == 1) {
            return n;
        }

        nums[0] = 0;
        nums[1] = 1;
        for (int i = 2; i < n + 1; i++)
        {
            if (i % 2 == 0) {
                nums[i] = nums[i / 2];
            } else {
                nums[i] = nums[i / 2] + nums[i / 2 + 1];
            }
            maxVal = Math.max(maxVal, nums[i]);
        }
        

        return maxVal;
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}