package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = m > 0 ? grid[0].length : 0;
        int temp;
        while (k > 0) {
            for (int i = 0; i < m; i++) {
                temp = grid[i][n - 1];
                for (int j = n - 1; j > 0; j--) {
                    grid[i][j] = grid[i][j - 1];
                }
                grid[i][0] = temp;

            }

            temp = grid[m - 1][0];
            for (int i = m - 1; i > 0; i--) {
                grid[i][0] = grid[i - 1][0];
            }
            grid[0][0] = temp;

            k--;
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int[] g: grid) {
            List<Integer> glist = Arrays.stream(g)
                    .boxed()
                    .collect(Collectors.toList());
            ans.add(glist);
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