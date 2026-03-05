package org.example;


class Solution {
    public boolean canBeIncreasing(int[] nums) {
        boolean deleted = false;
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] < nums[i]) {
                continue;
            }

            if (deleted) {
                return false;
            }
            // delete nums[i - 1]
            if (i - 2 < 0 || nums[i - 2] < nums[i]) {
                deleted = true;
                continue;
            }

            // delete nums[i]
            if (i + 1 >= n || nums[i - 1] < nums[i + 1]) {
                deleted = true;
                continue;
            } else {
                return false;
            }
        }

        return true;
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