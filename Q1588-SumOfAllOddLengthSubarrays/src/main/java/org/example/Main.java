package org.example;


class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
        int n = arr.length;

        for (int i = 1; i <= n; i += 2)
        {
            for (int j = 0; j < n - i + 1; j++)
            {
                for (int k = 0; k < i; k++)
                {
                    ans += arr[j + k];
                }
            }
            
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