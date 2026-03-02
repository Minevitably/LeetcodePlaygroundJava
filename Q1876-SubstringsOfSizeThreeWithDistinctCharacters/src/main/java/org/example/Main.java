package org.example;


class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        int n = s.length();
        char[] sc = s.toCharArray();

        for (int i = 2; i < n; i++) {
            if (sc[i - 2] != sc[i - 1] && sc[i - 2] != sc[i] && sc[i - 1] != sc[i]) {
                count++;
            }
        }

        return count;
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