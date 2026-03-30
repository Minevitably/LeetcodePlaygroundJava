package org.example;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evens.add(nums[i]);
            } else {
                odds.add(nums[i]);
            }
        }
        evens.sort(null);
        odds.sort((a, b) -> Integer.compare(b, a));
        int j = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = evens.get(j);
                j++;
            } else {
                nums[i] = odds.get(k);
                k++;
            }
        }

        return nums;
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