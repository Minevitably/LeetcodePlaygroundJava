package org.example;

import java.util.Arrays;

class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] rangesArr = new int[51];
        Arrays.fill(rangesArr, 0);
        for (var range: ranges) {
            for (int i = range[0]; i <= range[1]; i++) {
                rangesArr[i] = 1;
            }
        }

        for (int i = left; i <= right; i++) {
            if (rangesArr[i] == 0) {
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