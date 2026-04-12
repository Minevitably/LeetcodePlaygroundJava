package org.example;

import java.util.Arrays;

class Solution {
    public boolean digitCount(String num) {
        int[] cnt = new int[10];
        Arrays.fill(cnt, 0);

        int n = num.length();

        for (char c: num.toCharArray()) {
            cnt[(int)(c - '0')]++;
        }
        for (int i = 0; i < n; i++) {
            if (cnt[i] != (int)(num.charAt(i) - '0')) {
                return false;
            }
        }

        return true;
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