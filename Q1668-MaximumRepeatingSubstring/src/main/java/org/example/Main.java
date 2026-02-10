package org.example;


class Solution {
    public int maxRepeating(String sequence, String word) {
        int k = 0;
        int i = 0;
        int n = sequence.length();
        int m = word.length();
        int count = 0;

        while (i < n - m + 1) {
            if (sequence.substring(i, i + m).equals(word)) {
                count++;
                k = Math.max(k, count);
                i += m;
                continue;
            } else if (count > 0) {
                count = 0;
                i -= (m - 1);
                continue;
            }
            i++;
        }

        return k;
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