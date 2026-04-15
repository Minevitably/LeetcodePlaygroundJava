package org.example;

import java.util.Arrays;

class Solution {
    public String decodeMessage(String key, String message) {
        char[] keyMap = new char[26];
        Arrays.fill(keyMap, '*');
        int n = message.length();
        int j = 0;
        StringBuilder ans = new StringBuilder();

        for (char ch: key.toCharArray()) {
            if (Character.isLetter(ch) && keyMap[(int)(ch - 'a')] == '*') {
                keyMap[(int)(ch - 'a')] = (char)(j + 'a');
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (Character.isLetter(message.charAt(i))) {
                ans.append(keyMap[(int)(message.charAt(i) - 'a')]);
            } else {
                ans.append(' ');
            }
        }

        return ans.toString();
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