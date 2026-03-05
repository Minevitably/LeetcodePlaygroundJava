package org.example;


class Solution {
    public int maxProductDifference(int[] nums) {
        int w = 0;
        int x = -1;
        int y = 0;
        int z = -1;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[w]) {
                w = i;
            }
            if (nums[i] < nums[y]) {
                y = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i == w || i == y) {
                continue;
            }
            if (x == -1) {
                x = i;
            }
            if (z == -1) {
                z = i;
            }
            if (nums[i] > nums[x]) {
                x = i;
            }
            if (nums[i] < nums[z]) {
                z = i;
            }
        }

        return nums[w] * nums[x] - nums[y] * nums[z];
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