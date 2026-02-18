package org.example;


class Solution {
    public int minOperations(String s) {
        int n = s.length();
        // odd -> '0', even -> '1'
        int count1 = 0;
        // odd -> '1', even -> '0'
        int count2 = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0') {
                    count1++;
                } else {
                    count2++;
                }
            } else {
                if (s.charAt(i) == '1') {
                    count1++;
                } else {
                    count2++;
                }
            }

        }


        return Math.min(count1, count2);
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