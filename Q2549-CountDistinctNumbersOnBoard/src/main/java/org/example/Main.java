package org.example;

import java.util.HashSet;

class Solution {
    public int distinctIntegers(int n) {
        var board = new HashSet<Integer>();

        board.add(n);

        while (true) {
            int count = board.size();
            var tempBoard = new HashSet<Integer>();
            for (int x: board) {
                for (int i = 1; i <= n; i++) {
                    if (x % i == 1) {
                        tempBoard.add(i);
                    }
                }
            }
            board.addAll(tempBoard);
            if (count == board.size()) {
                break;
            }
        }

        return board.size();
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