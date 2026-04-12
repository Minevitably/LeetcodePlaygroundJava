package org.example;

import java.util.Arrays;

class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] sCount = new int[26];
        Arrays.fill(sCount, 0);
        int[] targetCount = new int[26];
        Arrays.fill(targetCount, 0);
        int ans = -1;

        for (char c: s.toCharArray()) {
            sCount[(int)(c - 'a')]++;
        }
        for (char c: target.toCharArray()) {
            targetCount[(int)(c - 'a')]++;
        }
        for (int i = 0; i < 26; i++) {
            if (targetCount[i] == 0) {
                continue;
            }
            int t = sCount[i] / targetCount[i];
            if (ans == -1) {
                ans = t;
            } else {
                ans = Math.min(ans, t);
            }
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