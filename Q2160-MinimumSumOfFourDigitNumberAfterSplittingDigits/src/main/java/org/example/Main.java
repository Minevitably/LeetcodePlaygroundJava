package org.example;

import java.util.Arrays;

class Solution {
    public int minimumSum(int num) {
        int[] digits = new int[4];
        int i = 0;

        while (num > 0) {
            digits[i] = num % 10;
            i++;
            num /= 10;
        }
        Arrays.sort(digits);
        
        return (digits[0] * 10 + digits[2]) + (digits[1] * 10 + digits[3]);
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