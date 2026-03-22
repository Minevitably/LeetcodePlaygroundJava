package org.example;

import java.util.Arrays;

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] cnt = new int[26];
        Arrays.fill(cnt, 0);

        for (char ch: word1.toCharArray()) {
            cnt[(int)(ch - 'a')]++;
        }
        for (char ch: word2.toCharArray()) {
            cnt[(int)(ch - 'a')]--;
        }
        for (int v: cnt) {
            if (Math.abs(v) > 3) {
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