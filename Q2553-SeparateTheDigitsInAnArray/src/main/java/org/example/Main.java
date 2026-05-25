package org.example;

import java.util.ArrayList;

class Solution {
    public int[] separateDigits(int[] nums) {
        var ans = new ArrayList<Integer>();

        for (int num: nums) {
            String numDigits = String.valueOf(num);
            for (char d: numDigits.toCharArray()) {
                ans.add((int)(d - '0'));
            }
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
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