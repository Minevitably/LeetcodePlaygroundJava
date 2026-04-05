package org.example;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int largestInteger(int num) {
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        List<Integer> digits = new ArrayList<>();
        int ans = 0;
        while (num > 0) {
            int digit = num % 10;
            digits.add(digit);
            if (digit % 2 == 0) {
                evens.add(digit);
            } else {
                odds.add(digit);
            }
            num /= 10;
        }

        odds.sort(null);
        evens.sort(null);
        int n = digits.size();
        int j = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (digits.get(i) % 2 == 0) {
                digits.set(i, evens.get(j));
                j++;
            } else {
                digits.set(i, odds.get(k));
                k++;
            }
            ans += digits.get(i) * Math.pow(10, i);
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