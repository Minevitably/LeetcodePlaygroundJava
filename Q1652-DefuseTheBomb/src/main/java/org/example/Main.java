package org.example;

import java.util.Arrays;

class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        if (k == 0) {
            Arrays.fill(code, 0);
            return code;
        }
        int[] ans = Arrays.copyOf(code, n);
        int sum = 0;


        int head = 1;
        int tail = k;
        if (k < 0) {
            k = -k;
            head = n - k;
            tail = n - 1;
        }
        for (int i = head; i <= tail; i++) {
            sum += code[i];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = sum;
            tail = (tail + 1) % n;
            sum = sum - code[head] + code[tail];
            head = (head + 1) % n;
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