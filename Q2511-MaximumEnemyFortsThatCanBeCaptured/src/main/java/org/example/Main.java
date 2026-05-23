package org.example;

class Solution {
    public int captureForts(int[] forts) {
        int n = forts.length;
        int maxFortsCount = 0;

        for (int i = 0; i < n; i++) {
            if (forts[i] == 1) {
                // left forts count
                int l = 0;
                int j = i - 1;
                while (j >= 0 && forts[j] == 0) {
                    l++;
                    j--;
                }
                // exception handle
                if (j < 0 || forts[j] == 1) {
                    l = 0;
                }

                // right forts count
                int r = 0;
                j = i + 1;
                while (j < n && forts[j] == 0) {
                    r++;
                    j++;
                }
                // exception handle
                if (j >= n || forts[j] == 1) {
                    r = 0;
                }

                maxFortsCount = Math.max(maxFortsCount, Math.max(l, r));
            }
        }

        return maxFortsCount;
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