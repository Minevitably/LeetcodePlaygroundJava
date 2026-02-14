package org.example;


class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int N = n / 7;
        int m = n % 7;
        int x = (n - 1) % 7 + 1;

        sum += (49 * N + 7 * N * N) / 2;
        // remaining days
        for (int i = 0; i < m; i++) {
            sum += x + N - i;
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