package org.example;

import java.util.HashSet;
import java.util.Set;

class Solution {
    private boolean isNice(String s) {
        Set<Character> charSet = new HashSet<>();
        for (char c: s.toCharArray()) {
            charSet.add(c);
        }
        for (char c: s.toCharArray()) {
            
            if (!charSet.contains(Character.toLowerCase(c)) || 
                !charSet.contains(Character.toUpperCase(c))) {
                return false;
            }
        }
        return true;
    }
    public String longestNiceSubstring(String s) {
        int n = s.length();
        String ans = "";

        int m = n;
        while (m >= 2) {
            for (int i = 0; i + m - 1 < n; i++) {
                String tmp = s.substring(i, i + m);
                if (isNice(tmp)) {
                    return tmp;
                }
            }
            m--;
        }
        return ans;
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