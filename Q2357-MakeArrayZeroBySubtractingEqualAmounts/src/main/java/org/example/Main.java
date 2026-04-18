package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.lang.Math;

class Solution {
    private int maxElement(int[] nums) {
        int m = -1;
        if (nums == null || nums.length == 0) {
            return m;
        }

        m = nums[0];
        for (int num: nums) {
            m = Math.max(m, num);
        }

        return m;
    }

    public int minimumOperations(int[] nums) {
        int count = 0;

        while (maxElement(nums) != 0) {
            int x = -1;
            for (int num: nums) {
                if (num == 0) {
                    continue;
                }
                if (x == -1) {
                    x = num;
                }
                x = Math.min(x, num);
            }

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[i] -= x;
                }
            }
            count++;
        }

        return count;
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