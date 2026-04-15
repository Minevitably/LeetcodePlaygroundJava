package org.example;


class Solution {
    public String greatestLetter(String s) {
        int[] upperCnt = new int[26];
        int[] lowerCnt = new int[26];

        for (char c: s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowerCnt[(int)(c - 'a')]++;
            } else {
                upperCnt[(int)(c - 'A')]++;
            }
        }
        for (int i = 25; i >= 0; i--) {
            if (upperCnt[i] >= 1 && lowerCnt[i] >= 1) {
                return String.valueOf((char)(i + 'A'));
            }
        }

        return "";
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