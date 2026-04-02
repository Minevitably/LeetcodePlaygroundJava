package org.example;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> cnt = new HashMap<>();
        int maxCount = 0;
        int ans = -1;
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] == key) {
                cnt.put(nums[i], cnt.getOrDefault(nums[i], 0) + 1);
                if (cnt.get(nums[i]) > maxCount) {
                    ans = nums[i];
                    maxCount = cnt.get(nums[i]);
                }
            }
        }

        return ans;
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