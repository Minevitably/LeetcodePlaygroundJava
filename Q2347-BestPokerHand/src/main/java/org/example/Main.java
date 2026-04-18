package org.example;

import java.util.Arrays;

class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int n = suits.length;

        // 1. Flush
        boolean flush = true;
        for (int i = 1; i < n; i++) {
            if (suits[i - 1] != suits[i]) {
                flush = false;
            }
        }
        if (flush) {
            return "Flush";
        }

        // 2. Three of a Kind
        int[] cnt = new int[14];
        Arrays.fill(cnt, 0);
        for (int rank: ranks) {
            cnt[rank]++;
        }
        for (int c: cnt) {
            if (c >= 3) {
                return "Three of a Kind";
            }
        }

        // 3. Pair
        for (int c: cnt) {
            if (c == 2) {
                return "Pair";
            }
        }

        // 4. High Card
        return "High Card";
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