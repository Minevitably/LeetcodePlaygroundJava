package org.example;

import java.util.HashSet;

class Solution {
    public boolean findSubarrays(int[] nums) {
        var s = new HashSet<Integer>();
        int n = nums.length;
        
        for (int i = 1; i < n; i++) {
            int sum = nums[i] + nums[i - 1];
            if (s.contains(sum)) {
                return true;
            }
            s.add(sum);
        }
        
        return false;
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