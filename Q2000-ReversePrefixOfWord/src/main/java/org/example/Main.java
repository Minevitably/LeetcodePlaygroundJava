package org.example;


class Solution {
    public String reversePrefix(String word, char ch) {
        int i = word.indexOf(ch);
        int n = 0;
        
        if (i == -1) {
            return word;
        } else {
            n = i + 1;
        }

        char[] wordStr = word.toCharArray();

        for (int j = 0; j < n / 2; j++) {
            char t = wordStr[j];
            wordStr[j] = wordStr[n - j - 1];
            wordStr[n - j - 1] = t;
        }

        return new String(wordStr);
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