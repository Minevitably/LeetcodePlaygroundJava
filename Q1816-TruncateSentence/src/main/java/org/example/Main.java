package org.example;

import java.util.HashSet;
import java.util.Set;

class Solution {
    private String removeLeadingZeros(String str) {
        int n = str.length();
        int i = 0;

        while (i < n - 1 && str.charAt(i) == '0') {
            i++;
        }

        return str.substring(i);
    }
    public int numDifferentIntegers(String word) {
        Set<String> s = new HashSet<>();

        word = word.replaceAll("[a-zA-Z]", " ");
        String[] numStrs = word.split(" ");

        for (String numStr: numStrs) {
            if (!numStr.isEmpty()) {
                s.add(removeLeadingZeros(numStr));
            }
        }

        return s.size();
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        (new Solution()).numDifferentIntegers("a123bc34d8ef34");
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