package org.example;


class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minIndex = -1;
        int minDistance = Integer.MAX_VALUE;
        int n = points.length;

        for (int i = 0; i < n; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            // valid
            if (x1 == x || y1 == y) {
                int d = Math.abs(x - x1) + Math.abs(y - y1);
                if (d < minDistance) {
                    minDistance = d;
                    minIndex = i;
                }
            }
        }

        return minIndex;
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