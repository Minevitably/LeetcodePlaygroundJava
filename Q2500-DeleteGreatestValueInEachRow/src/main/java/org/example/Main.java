package org.example;

import java.util.Arrays;

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for (var row: grid) {
            Arrays.sort(row);
        }

        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for (int j = 0; j < n; j++) {
            int maxVal = grid[0][j];
            for (int i = 1; i < m; i++) {
                maxVal = Math.max(maxVal, grid[i][j]);
            }
            ans += maxVal;
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