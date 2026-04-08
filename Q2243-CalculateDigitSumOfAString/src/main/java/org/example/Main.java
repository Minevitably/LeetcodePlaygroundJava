package org.example;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String digitSum(String s, int k) {

        while (s.length() > k) {
            List<String> groups = new ArrayList<>();
            int n = s.length();
            for (int i = 0; i < n; i += k) {
                int j = i + k <= n ? i + k : n;
                groups.add(s.substring(i, j));
            }
            s = "";
            for (String g: groups) {
                int sum = 0;
                for (char ch: g.toCharArray()) {
                    sum += (int)(ch - '0');
                }
                s += String.valueOf(sum);
            }
        }

        return s;
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