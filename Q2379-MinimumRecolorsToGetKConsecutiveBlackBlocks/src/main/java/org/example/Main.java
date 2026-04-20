package org.example;


class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int minWhite = -1;
        int white = 0;

        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                white++;
            }
        }
        minWhite = white;
        for (int i = k; i < n; i++) {
            if (blocks.charAt(i) == 'W') {
                white++;
            }
            if (blocks.charAt(i - k) == 'W') {
                white--;
            }
            minWhite = Math.min(minWhite, white);
        }

        return minWhite;
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