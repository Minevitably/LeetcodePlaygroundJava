package org.example;


class Solution {
    private int getMaxLocalAt(int[][] grid, int i, int j) {
        int val = -1;

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (val == -1) {
                    val = grid[i + r][j + c];
                } else {
                    val = Math.max(val, grid[i + r][j + c]);
                }
            }
        }

        return val;
    }
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        var maxLocal = new int[n - 2][n - 2];

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                maxLocal[i][j] = getMaxLocalAt(grid, i, j);
            }
        }

        return maxLocal;
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