package org.example;

class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int n = arr.length;

        for (var piece: pieces) {
            int i = -1;
            int m = piece.length;
            for (int k = 0; k < n; k++) {
                if (arr[k] == piece[0]) {
                    i = k;
                    break;
                }
            }
            if (i == - 1) {
                return false;
            }
            if (i + m > n) {
                return false;
            }

            for (int j = 1; j < m; j++) {
                if (piece[j] != arr[i + j]) {
                    return false;
                }
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