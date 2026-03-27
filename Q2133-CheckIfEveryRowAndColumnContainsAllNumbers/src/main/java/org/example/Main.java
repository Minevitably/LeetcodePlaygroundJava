package org.example;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        Set<Integer> sr = new HashSet<>();
        Set<Integer> sc = new HashSet<>();

        for (int i = 0; i < n; i++) {
            sr.clear();
            sc.clear();
            for (int j = 0; j < n; j++) {
                if (sr.contains(matrix[i][j]) || sc.contains(matrix[j][i])) {
                    return false;
                }
                sr.add(matrix[i][j]);
                sc.add(matrix[j][i]);
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