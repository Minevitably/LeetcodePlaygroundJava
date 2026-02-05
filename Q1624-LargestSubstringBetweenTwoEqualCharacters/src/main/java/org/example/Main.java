package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;
        Deque<Character> st = new ArrayDeque<>();

        for (char ch: s.toCharArray()) {
            if (ch == '(') {
                st.push(ch);
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            } else if (ch == ')') {
                st.pop();
                depth--;
            }
        }

        return maxDepth;
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