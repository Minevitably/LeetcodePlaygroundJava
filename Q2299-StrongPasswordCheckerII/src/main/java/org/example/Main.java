package org.example;


class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int n = password.length();
        boolean checkLength = false;
        boolean checkLower = false;
        boolean checkUpper = false;
        boolean checkDigit = false;
        boolean checkSpecial = false;
        boolean checkAdjacent = true;

        String specialChars = "!@#$%^&*()-+";

        checkLength = n >= 8;
        for (char ch: password.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (!checkLower) {
                    checkLower = Character.isLowerCase(ch);
                }
                if (!checkUpper) {
                    checkUpper = Character.isUpperCase(ch);
                }
            }
            if (Character.isDigit(ch)) {
                checkDigit = true;
            }
            if (specialChars.indexOf(ch) != -1) {
                checkSpecial = true;
            }
        }

        for (int i = 1; i < n; i++) {
            if (password.charAt(i) == password.charAt(i - 1)) {
                checkAdjacent = false;
            }
        }


        return checkLength && checkLower && checkUpper && checkDigit && checkSpecial &&
               checkAdjacent;
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