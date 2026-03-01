package org.example;


class Solution {
    public boolean checkZeroOnes(String s) {
        int longestZeros = 0;
        int longestOnes = 0;
        int n = s.length();

        int i = 0;
        while (i < n) {
            int count = 0;
            char ch = s.charAt(i);
            while (i < n && s.charAt(i) == ch) {
                count++;
                i++;
            }
            if (ch == '0') {
                longestZeros = Math.max(longestZeros, count);
            } else {
                longestOnes = Math.max(longestOnes, count);
            }
        }

        return longestOnes > longestZeros;
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