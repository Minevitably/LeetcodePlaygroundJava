package org.example;


class Solution {
    public int countHillValley(int[] nums) {
        int i = 0;
        int n = nums.length;
        int count = 0;

        while (i < n) {
            int l = i - 1;
            int r = i + 1;
            while (l >= 0 && nums[i] == nums[l]) {
                l--;
            }
            while (r < n && nums[i] == nums[r]) {
                r++;
            }

            if (l < 0 || r > n - 1) {
                i++;
                continue;
            }

            if ((nums[l] > nums[i] && nums[r] > nums[i]) || 
                (nums[l] < nums[i] && nums[r] < nums[i])) {
                count++;
                i = r;
                continue;
            }

            i++;
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