package org.example;


class Solution {
    private char shift(char c, int x) {
        return (char)(c + x);
    }
    public String replaceDigits(String s) {
        int n = s.length();

        char[] sarr = s.toCharArray();
        
        for (int i = 1; i < n; i += 2) {
            sarr[i] = shift(sarr[i - 1], (int)(sarr[i] - '0'));
        }

        return new String(sarr);
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