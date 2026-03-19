package org.example;


class Solution {
    private boolean isValid(String s) {
        if (s.isEmpty()) {
            return false;
        }
        int hyphens = 0;
        int puncs = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                return false;
            }

            if (ch == '-') {
                hyphens++;
                if (i - 1 < 0 || i + 1 > n - 1) {
                    return false;
                }
                if (hyphens > 1) {
                    return false;
                }
                if (!Character.isLetter(s.charAt(i - 1))) {
                    return false;
                }
                if (!Character.isLetter(s.charAt(i + 1))) {
                    return false;
                }
            }

            if (ch == '!' || ch == '.' || ch == ',') {
                puncs++;
                if (puncs > 1) {
                    return false;
                }
                if (i != n - 1) {
                    return false;
                }
            }
        }
        
        return true;
    }

    public int countValidWords(String sentence) {
        String[] tokens = sentence.split(" ");
        int count = 0;

        for (String token: tokens) {
            if (isValid(token)) {
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