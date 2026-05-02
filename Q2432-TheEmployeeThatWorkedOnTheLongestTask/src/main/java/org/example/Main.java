package org.example;


class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int now = 0;
        int max = logs[0][1];
        int id = logs[0][0];

        for (int[] l: logs) {
            l[1] -= now;
            now += l[1];
            if (l[1] > max) {
                max = l[1];
                id = l[0];
            }
            if (l[1] == max) {
                id = Math.min(id, l[0]);
            }
        }

        return id;
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