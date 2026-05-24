package org.example;

import java.util.ArrayList;

class Solution {
    public int alternateDigitSum(int n) {
        var digits = new ArrayList<Integer>();
        int sum = 0;
        int sign = 1;

        while (n > 0) {
            digits.add(0, n % 10);
            n /= 10;
        }
        for (int d: digits) {
            sum += d * sign;
            sign *= -1;
        }

        return sum;
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