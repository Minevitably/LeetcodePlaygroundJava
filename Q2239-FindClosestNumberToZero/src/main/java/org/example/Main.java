package org.example;


class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0];

        for (int v: nums) {
            if (Math.abs(v) < Math.abs(closest)) {
                closest = v;
            }else if (Math.abs(v) == Math.abs(closest)) {
                closest = Math.max(closest, v);
            }
        }

        return closest;
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